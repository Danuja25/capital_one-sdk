package model;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "productDefinition",
        "rates",
        "features"
})
public class Product {

    @JsonProperty("productDefinition")
    private ProductDefinition productDefinition;
    @JsonProperty("rates")
    private List<Rate> rates = null;
    @JsonProperty("features")
    private List<Feature> features = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public Product() {
    }

    /**
     * @param features
     * @param rates
     * @param productDefinition
     */
    public Product(ProductDefinition productDefinition, List<Rate> rates, List<Feature> features) {
        super();
        this.productDefinition = productDefinition;
        this.rates = rates;
        this.features = features;
    }

    @JsonProperty("productDefinition")
    public ProductDefinition getProductDefinition() {
        return productDefinition;
    }

    @JsonProperty("productDefinition")
    public void setProductDefinition(ProductDefinition productDefinition) {
        this.productDefinition = productDefinition;
    }

    @JsonProperty("rates")
    public List<Rate> getRates() {
        return rates;
    }

    @JsonProperty("rates")
    public void setRates(List<Rate> rates) {
        this.rates = rates;
    }

    @JsonProperty("features")
    public List<Feature> getFeatures() {
        return features;
    }

    @JsonProperty("features")
    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Product.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("productDefinition");
        sb.append('=');
        sb.append(((this.productDefinition == null) ? "<null>" : this.productDefinition));
        sb.append(',');
        sb.append("rates");
        sb.append('=');
        sb.append(((this.rates == null) ? "<null>" : this.rates));
        sb.append(',');
        sb.append("features");
        sb.append('=');
        sb.append(((this.features == null) ? "<null>" : this.features));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null) ? "<null>" : this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result * 31) + ((this.features == null) ? 0 : this.features.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        result = ((result * 31) + ((this.productDefinition == null) ? 0 : this.productDefinition.hashCode()));
        result = ((result * 31) + ((this.rates == null) ? 0 : this.rates.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Product) == false) {
            return false;
        }
        Product rhs = ((Product) other);
        return ((((Objects.equals(this.features, rhs.features)) && (Objects.equals(this.additionalProperties, rhs.additionalProperties))) && (Objects.equals(this.productDefinition, rhs.productDefinition))) && (Objects.equals(this.rates, rhs.rates)));
    }

}
