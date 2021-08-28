package auth;

import okhttp3.MediaType;

public class AuthConstants
{
    private AuthConstants() {}

    public static String AUTH_URL = "https://api-sandbox.capitalone.com/oauth2/token";
    public static String AUTH_HEADER = "Authorization";

    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
}
