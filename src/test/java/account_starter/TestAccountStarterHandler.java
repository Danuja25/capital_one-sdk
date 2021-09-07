package account_starter;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import okhttp3.HttpUrl;
import okhttp3.mockwebserver.MockWebServer;
import org.junit.Before;

import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class TestAccountStarterHandler
{
    MockWebServer server;
    HttpUrl serverUrl;
    HttpUrl authServerUrl;
    String authBody;
    String productsBody;
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
        authServerUrl = server.url("oauth2/token");
        serverUrl = server.url("deposits/products/~/search");
        authBody = new Scanner(Objects.requireNonNull(this.getClass().getClassLoader().getResourceAsStream("json/authResponse.json")), "UTF-8").useDelimiter("\\A").next();
        productsBody = new Scanner(Objects.requireNonNull(this.getClass().getClassLoader().getResourceAsStream("json/bankProductsResponse.json")), "UTF-8").useDelimiter("\\A").next();
        gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.IDENTITY)
                .create();
    }
}
