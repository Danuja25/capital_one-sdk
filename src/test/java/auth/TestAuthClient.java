package auth;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestAuthClient {

    MockWebServer server;
    HttpUrl serverUrl;
    String authBody;
    Gson gson;

    @Before
    public void setUp()
    {
        server = new MockWebServer();
        try
        {
            server.start();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        serverUrl = server.url("oauth2/token");
        authBody = new Scanner(Objects.requireNonNull(this.getClass().getClassLoader().getResourceAsStream("json/authResponse.json")), "UTF-8").useDelimiter("\\A").next();
        gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .create();
    }

    @After
    public void tearDown() throws IOException
    {
        this.server.shutdown();
    }

    @Test
    public void testGenerateToken()
    {
        this.server.enqueue(new MockResponse().setResponseCode(200).setBody(authBody));
        AuthConstants.AUTH_URL = serverUrl.url().toString();
        AuthClient authClient = new AuthClient(new AppCredentials("test","testSecret","client_credentials"));
        String token = authClient.generateToken();
        AuthResponse authResponse = gson.fromJson(authBody, AuthResponse.class);
        assertEquals(authResponse.getAccessToken(),token);
    }

    @Test
    public void getRequest() throws IOException
    {
        AuthConstants.AUTH_URL = serverUrl.url().toString();
        AuthClient authClient = new AuthClient(new AppCredentials("test","testSecret","client_credentials"));
        Request request = authClient.getRequest(gson);
        assertEquals("POST", request.method());
        assertEquals(serverUrl.url().toString(), request.url().toString());
        assertTrue(Objects.requireNonNull(request.body()).contentLength() > 0);
    }


}