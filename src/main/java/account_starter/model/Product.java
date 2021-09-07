package account_starter.model;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "productId",
        "productName",
        "cdTerms",
        "annualPercentageYieldDetails",
        "disclosures"
})
public class Product {

    @JsonProperty("productId")
    private String productId;
    @JsonProperty("productName")
    private String productName;
    @JsonProperty("cdTerms")
    private List<String> cdTerms = null;
    @JsonProperty("annualPercentageYieldDetails")
    private AnnualPercentageYieldDetails annualPercentageYieldDetails;
    @JsonProperty("disclosures")
    private Disclosures disclosures;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Product() {
    }

    /**
     *
     * @param annualPercentageYieldDetails
     * @param productId
     * @param cdTerms
     * @param disclosures
     * @param productName
     */
    public Product(String productId, String productName, List<String> cdTerms, AnnualPercentageYieldDetails annualPercentageYieldDetails, Disclosures disclosures) {
        super();
        this.productId = productId;
        this.productName = productName;
        this.cdTerms = cdTerms;
        this.annualPercentageYieldDetails = annualPercentageYieldDetails;
        this.disclosures = disclosures;
    }

    @JsonProperty("productId")
    public String getProductId() {
        return productId;
    }

    @JsonProperty("productId")
    public void setProductId(String productId) {
        this.productId = productId;
    }

    @JsonProperty("productName")
    public String getProductName() {
        return productName;
    }

    @JsonProperty("productName")
    public void setProductName(String productName) {
        this.productName = productName;
    }

    @JsonProperty("cdTerms")
    public List<String> getCdTerms() {
        return cdTerms;
    }

    @JsonProperty("cdTerms")
    public void setCdTerms(List<String> cdTerms) {
        this.cdTerms = cdTerms;
    }

    @JsonProperty("annualPercentageYieldDetails")
    public AnnualPercentageYieldDetails getAnnualPercentageYieldDetails() {
        return annualPercentageYieldDetails;
    }

    @JsonProperty("annualPercentageYieldDetails")
    public void setAnnualPercentageYieldDetails(AnnualPercentageYieldDetails annualPercentageYieldDetails) {
        this.annualPercentageYieldDetails = annualPercentageYieldDetails;
    }

    @JsonProperty("disclosures")
    public Disclosures getDisclosures() {
        return disclosures;
    }

    @JsonProperty("disclosures")
    public void setDisclosures(Disclosures disclosures) {
        this.disclosures = disclosures;
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
        sb.append("productId");
        sb.append('=');
        sb.append(((this.productId == null)?"<null>":this.productId));
        sb.append(',');
        sb.append("productName");
        sb.append('=');
        sb.append(((this.productName == null)?"<null>":this.productName));
        sb.append(',');
        sb.append("cdTerms");
        sb.append('=');
        sb.append(((this.cdTerms == null)?"<null>":this.cdTerms));
        sb.append(',');
        sb.append("annualPercentageYieldDetails");
        sb.append('=');
        sb.append(((this.annualPercentageYieldDetails == null)?"<null>":this.annualPercentageYieldDetails));
        sb.append(',');
        sb.append("disclosures");
        sb.append('=');
        sb.append(((this.disclosures == null)?"<null>":this.disclosures));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.annualPercentageYieldDetails == null)? 0 :this.annualPercentageYieldDetails.hashCode()));
        result = ((result* 31)+((this.productId == null)? 0 :this.productId.hashCode()));
        result = ((result* 31)+((this.cdTerms == null)? 0 :this.cdTerms.hashCode()));
        result = ((result* 31)+((this.disclosures == null)? 0 :this.disclosures.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.productName == null)? 0 :this.productName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Product)) {
            return false;
        }
        Product rhs = ((Product) other);
        return ((((((Objects.equals(this.annualPercentageYieldDetails, rhs.annualPercentageYieldDetails))&&(Objects.equals(this.productId, rhs.productId)))&&(Objects.equals(this.cdTerms, rhs.cdTerms)))&&(Objects.equals(this.disclosures, rhs.disclosures)))&&(Objects.equals(this.additionalProperties, rhs.additionalProperties)))&&(Objects.equals(this.productName, rhs.productName)));
    }

}

