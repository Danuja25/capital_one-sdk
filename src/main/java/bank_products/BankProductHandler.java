package bank_products;

import auth.AppCredentials;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import bank_products.model.Product;
import bank_products.model.ProductResponse;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import service.ApiClient;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static utils.CommonConstants.JSON;

public class BankProductHandler
{
    AppCredentials credentials;
    boolean isCollapseRate;
    Gson gson;

    public BankProductHandler(AppCredentials credentials)
    {
        this.credentials = credentials;
        gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.IDENTITY)
                .create();
    }

    public List<Product> getBankProducts()
    {
        ProductResponse productResponse = null;
        ApiClient apiClient = new ApiClient(credentials);

        Request request = generateRequest(gson);
        Response response = apiClient.sendRequest(request);

        try
        {
            String resStr = Objects.requireNonNull(response.body()).string();
            productResponse = gson.fromJson(resStr, ProductResponse.class);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        if(Objects.nonNull(productResponse))
        {
            return productResponse.getProducts();
        }
        return new ArrayList<>();
    }

    @NotNull
    Request generateRequest(Gson gson)
    {
        BankProductRequestBodyWrapper requestBodyWrapper = new BankProductRequestBodyWrapper();
        requestBodyWrapper.setCollapseRate(isCollapseRate);

        String authJson = gson.toJson(requestBodyWrapper);
        RequestBody bankProductsBody = RequestBody.create(authJson,JSON);

        return new Request.Builder()
                .url(BankProductConstants.BANK_PRODUCTS_URL)
                .post(bankProductsBody)
                .build();
    }

    public boolean isCollapseRate() {
        return isCollapseRate;
    }

    public void setCollapseRate(boolean collapseRate) {
        isCollapseRate = collapseRate;
    }
}
