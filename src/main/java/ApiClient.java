import auth.AccessTokenAuthenticator;
import auth.AppCredentials;
import auth.AuthClient;
import auth.AuthConstants;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class ApiClient
{
    OkHttpClient okHttpClient;
    AppCredentials credentials;
    AuthClient authClient;

    public ApiClient(AppCredentials credentials)
    {
        this.credentials = credentials;
        authClient = new AuthClient(credentials);
        final AccessTokenAuthenticator authenticator = new AccessTokenAuthenticator(credentials);
        okHttpClient = new OkHttpClient
                .Builder()
                .authenticator(authenticator)
                .build();
    }

    Response sendRequest(Request request)
    {
        String authToken = authClient.authorize();
        Request validRequest = request.newBuilder()
                .header(AuthConstants.AUTH_HEADER, authToken)
                .build();
        try
        {
            return okHttpClient.newCall(validRequest).execute();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return null;
    }

}
