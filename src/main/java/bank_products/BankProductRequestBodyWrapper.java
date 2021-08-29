package bank_products;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BankProductRequestBodyWrapper implements Serializable
{
    boolean isCollapseRate;

    public BankProductRequestBodyWrapper() {}

    public BankProductRequestBodyWrapper(boolean isCollapseRate)
    {
        this.isCollapseRate = isCollapseRate;
    }

    public boolean isCollapseRate() {
        return isCollapseRate;
    }

    public void setCollapseRate(boolean collapseRate) {
        isCollapseRate = collapseRate;
    }
}
