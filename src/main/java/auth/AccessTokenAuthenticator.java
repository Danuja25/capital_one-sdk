package auth;

import okhttp3.Authenticator;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.util.Objects;

public class AccessTokenAuthenticator implements Authenticator
{
    private AppCredentials credentials;

    public AccessTokenAuthenticator(AppCredentials credentials)
    {
        this.credentials = credentials;
    }

    @Nullable
    @Override
    public Request authenticate(@Nullable Route route, @NotNull Response response) throws IOException
    {

        AuthClient authClient = new AuthClient(credentials);
        if(response.code() == 401)
        {
            String token = authClient.generateToken();
            if(Objects.nonNull(token) && !token.isEmpty())
            {
                return response.request().newBuilder()
                        .header(AuthConstants.AUTH_HEADER,token)
                        .build();
            }
        }
        return null;
    }
}
