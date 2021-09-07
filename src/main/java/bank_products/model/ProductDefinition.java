package bank_products.model;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "productName",
        "productGroup",
        "productTypeDescription",
        "productCode"
})
public class ProductDefinition {

    @JsonProperty("productName")
    private String productName;
    @JsonProperty("productGroup")
    private String productGroup;
    @JsonProperty("productTypeDescription")
    private String productTypeDescription;
    @JsonProperty("productCode")
    private String productCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

    /**
     * No args constructor for use in serialization
     */
    public ProductDefinition() {
    }

    /**
     * @param productCode
     * @param productGroup
     * @param productTypeDescription
     * @param productName
     */
    public ProductDefinition(String productName, String productGroup, String productTypeDescription, String productCode) {
        super();
        this.productName = productName;
        this.productGroup = productGroup;
        this.productTypeDescription = productTypeDescription;
        this.productCode = productCode;
    }

    @JsonProperty("productName")
    public String getProductName() {
        return productName;
    }

    @JsonProperty("productName")
    public void setProductName(String productName) {
        this.productName = productName;
    }

    @JsonProperty("productGroup")
    public String getProductGroup() {
        return productGroup;
    }

    @JsonProperty("productGroup")
    public void setProductGroup(String productGroup) {
        this.productGroup = productGroup;
    }

    @JsonProperty("productTypeDescription")
    public String getProductTypeDescription() {
        return productTypeDescription;
    }

    @JsonProperty("productTypeDescription")
    public void setProductTypeDescription(String productTypeDescription) {
        this.productTypeDescription = productTypeDescription;
    }

    @JsonProperty("productCode")
    public String getProductCode() {
        return productCode;
    }

    @JsonProperty("productCode")
    public void setProductCode(String productCode) {
        this.productCode = productCode;
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
        sb.append(ProductDefinition.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("productName");
        sb.append('=');
        sb.append(((this.productName == null) ? "<null>" : this.productName));
        sb.append(',');
        sb.append("productGroup");
        sb.append('=');
        sb.append(((this.productGroup == null) ? "<null>" : this.productGroup));
        sb.append(',');
        sb.append("productTypeDescription");
        sb.append('=');
        sb.append(((this.productTypeDescription == null) ? "<null>" : this.productTypeDescription));
        sb.append(',');
        sb.append("productCode");
        sb.append('=');
        sb.append(((this.productCode == null) ? "<null>" : this.productCode));
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
        result = ((result * 31) + ((this.productTypeDescription == null) ? 0 : this.productTypeDescription.hashCode()));
        result = ((result * 31) + ((this.productCode == null) ? 0 : this.productCode.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        result = ((result * 31) + ((this.productGroup == null) ? 0 : this.productGroup.hashCode()));
        result = ((result * 31) + ((this.productName == null) ? 0 : this.productName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ProductDefinition)) {
            return false;
        }
        ProductDefinition rhs = ((ProductDefinition) other);
        return (((((Objects.equals(this.productTypeDescription, rhs.productTypeDescription)) && (Objects.equals(this.productCode, rhs.productCode))) && (Objects.equals(this.additionalProperties, rhs.additionalProperties))) && (Objects.equals(this.productGroup, rhs.productGroup))) && (Objects.equals(this.productName, rhs.productName)));
    }

}
