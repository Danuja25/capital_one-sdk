package auth;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import okhttp3.*;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

import static utils.CommonConstants.JSON;

public class AuthClient
{
    int connTimeout = 30;
    OkHttpClient okHttpClient;
    private final String clientId;
    private final String clientSecret;
    private final String grantType;
    private String token;

    public AuthClient(AppCredentials credentials)
    {
        this.clientId = credentials.getClientId();
        this.clientSecret = credentials.getClientSecret();
        this.grantType = credentials.getGrantType();
        okHttpClient = new OkHttpClient
                .Builder()
                .connectTimeout(connTimeout, TimeUnit.SECONDS)
                .build();
    }

    public Request authorize(Request request)
    {
        if(Objects.isNull(token) || token.isEmpty())
        {
            token = generateToken();
        }
        return request.newBuilder()
                .header(AuthConstants.AUTH_HEADER, token)
                .build();

    }

    public Request refreshToken(Request request)
    {
        token = null;
        return authorize(request);
    }

    String generateToken()
    {
        Response response;
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .create();

        Request authRequest = getRequest(gson);

        try
        {
            response = okHttpClient.newCall(authRequest).execute();
            String resStr = Objects.requireNonNull(response.body()).string();
            AuthResponse authResponse = gson.fromJson(resStr, AuthResponse.class);
            return authResponse.getAccessToken();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @NotNull
    Request getRequest(Gson gson)
    {
        AuthRequestBodyWrapper requestBodyWrapper = new AuthRequestBodyWrapper();
        requestBodyWrapper.setClientId(clientId);
        requestBodyWrapper.setClientSecret(clientSecret);
        requestBodyWrapper.setGrantType(grantType);

        String authJson = gson.toJson(requestBodyWrapper);
        RequestBody authBody = RequestBody.create(authJson,JSON);

        return new Request.Builder()
                .url(AuthConstants.AUTH_URL)
                .post(authBody)
                .build();
    }

}
