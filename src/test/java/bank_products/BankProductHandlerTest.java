package bank_products;

import auth.AppCredentials;
import auth.AuthConstants;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import bank_products.model.Product;
import bank_products.model.ProductResponse;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BankProductHandlerTest
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

    @After
    public void tearDown() throws IOException
    {
        this.server.shutdown();
    }

    @Test
    public void getBankProducts()
    {
        this.server.enqueue(new MockResponse().setResponseCode(200).setBody(authBody));
        this.server.enqueue(new MockResponse().setResponseCode(200).setBody(productsBody));
        AuthConstants.AUTH_URL = authServerUrl.url().toString();
        BankProductConstants.BANK_PRODUCTS_URL = serverUrl.url().toString();
        BankProductHandler productHandler = new BankProductHandler(new AppCredentials("test","testSecret","client_credentials"));
        List<Product> bankProducts = productHandler.getBankProducts();
        ProductResponse productResponse = gson.fromJson(productsBody, ProductResponse.class);
        assertEquals(productResponse.getProducts(),bankProducts);
    }

    @Test
    public void generateRequest() throws IOException
    {
        BankProductConstants.BANK_PRODUCTS_URL = serverUrl.url().toString();
        BankProductHandler productHandler = new BankProductHandler(new AppCredentials("test","testSecret","client_credentials"));
        Request request = productHandler.generateRequest(gson);
        assertEquals("POST", request.method());
        assertEquals(serverUrl.url().toString(), request.url().toString());
        assertTrue(Objects.requireNonNull(request.body()).contentLength() > 0);
    }
}