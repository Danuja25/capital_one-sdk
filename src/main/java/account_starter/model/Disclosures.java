package account_starter.model;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "productDisclosureUrl",
        "termsAndConditionsUrl",
        "electronicFundTransferDisclosureUrl",
        "privacyPolicyUrl",
        "wireTransferAgreementUrl",
        "paperlessAgreementUrl",
        "fraudProtectionAgreementUrl",
        "tcpaDisclosureContent"
})
public class Disclosures {

    @JsonProperty("productDisclosureUrl")
    private String productDisclosureUrl;
    @JsonProperty("termsAndConditionsUrl")
    private String termsAndConditionsUrl;
    @JsonProperty("electronicFundTransferDisclosureUrl")
    private String electronicFundTransferDisclosureUrl;
    @JsonProperty("privacyPolicyUrl")
    private String privacyPolicyUrl;
    @JsonProperty("wireTransferAgreementUrl")
    private String wireTransferAgreementUrl;
    @JsonProperty("paperlessAgreementUrl")
    private String paperlessAgreementUrl;
    @JsonProperty("fraudProtectionAgreementUrl")
    private String fraudProtectionAgreementUrl;
    @JsonProperty("tcpaDisclosureContent")
    private String tcpaDisclosureContent;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public Disclosures() {
    }

    /**
     * @param termsAndConditionsUrl
     * @param electronicFundTransferDisclosureUrl
     * @param wireTransferAgreementUrl
     * @param tcpaDisclosureContent
     * @param productDisclosureUrl
     * @param paperlessAgreementUrl
     * @param fraudProtectionAgreementUrl
     * @param privacyPolicyUrl
     */
    public Disclosures(String productDisclosureUrl, String termsAndConditionsUrl, String electronicFundTransferDisclosureUrl, String privacyPolicyUrl, String wireTransferAgreementUrl, String paperlessAgreementUrl, String fraudProtectionAgreementUrl, String tcpaDisclosureContent) {
        super();
        this.productDisclosureUrl = productDisclosureUrl;
        this.termsAndConditionsUrl = termsAndConditionsUrl;
        this.electronicFundTransferDisclosureUrl = electronicFundTransferDisclosureUrl;
        this.privacyPolicyUrl = privacyPolicyUrl;
        this.wireTransferAgreementUrl = wireTransferAgreementUrl;
        this.paperlessAgreementUrl = paperlessAgreementUrl;
        this.fraudProtectionAgreementUrl = fraudProtectionAgreementUrl;
        this.tcpaDisclosureContent = tcpaDisclosureContent;
    }

    @JsonProperty("productDisclosureUrl")
    public String getProductDisclosureUrl() {
        return productDisclosureUrl;
    }

    @JsonProperty("productDisclosureUrl")
    public void setProductDisclosureUrl(String productDisclosureUrl) {
        this.productDisclosureUrl = productDisclosureUrl;
    }

    @JsonProperty("termsAndConditionsUrl")
    public String getTermsAndConditionsUrl() {
        return termsAndConditionsUrl;
    }

    @JsonProperty("termsAndConditionsUrl")
    public void setTermsAndConditionsUrl(String termsAndConditionsUrl) {
        this.termsAndConditionsUrl = termsAndConditionsUrl;
    }

    @JsonProperty("electronicFundTransferDisclosureUrl")
    public String getElectronicFundTransferDisclosureUrl() {
        return electronicFundTransferDisclosureUrl;
    }

    @JsonProperty("electronicFundTransferDisclosureUrl")
    public void setElectronicFundTransferDisclosureUrl(String electronicFundTransferDisclosureUrl) {
        this.electronicFundTransferDisclosureUrl = electronicFundTransferDisclosureUrl;
    }

    @JsonProperty("privacyPolicyUrl")
    public String getPrivacyPolicyUrl() {
        return privacyPolicyUrl;
    }

    @JsonProperty("privacyPolicyUrl")
    public void setPrivacyPolicyUrl(String privacyPolicyUrl) {
        this.privacyPolicyUrl = privacyPolicyUrl;
    }

    @JsonProperty("wireTransferAgreementUrl")
    public String getWireTransferAgreementUrl() {
        return wireTransferAgreementUrl;
    }

    @JsonProperty("wireTransferAgreementUrl")
    public void setWireTransferAgreementUrl(String wireTransferAgreementUrl) {
        this.wireTransferAgreementUrl = wireTransferAgreementUrl;
    }

    @JsonProperty("paperlessAgreementUrl")
    public String getPaperlessAgreementUrl() {
        return paperlessAgreementUrl;
    }

    @JsonProperty("paperlessAgreementUrl")
    public void setPaperlessAgreementUrl(String paperlessAgreementUrl) {
        this.paperlessAgreementUrl = paperlessAgreementUrl;
    }

    @JsonProperty("fraudProtectionAgreementUrl")
    public String getFraudProtectionAgreementUrl() {
        return fraudProtectionAgreementUrl;
    }

    @JsonProperty("fraudProtectionAgreementUrl")
    public void setFraudProtectionAgreementUrl(String fraudProtectionAgreementUrl) {
        this.fraudProtectionAgreementUrl = fraudProtectionAgreementUrl;
    }

    @JsonProperty("tcpaDisclosureContent")
    public String getTcpaDisclosureContent() {
        return tcpaDisclosureContent;
    }

    @JsonProperty("tcpaDisclosureContent")
    public void setTcpaDisclosureContent(String tcpaDisclosureContent) {
        this.tcpaDisclosureContent = tcpaDisclosureContent;
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
        sb.append(Disclosures.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("productDisclosureUrl");
        sb.append('=');
        sb.append(((this.productDisclosureUrl == null) ? "<null>" : this.productDisclosureUrl));
        sb.append(',');
        sb.append("termsAndConditionsUrl");
        sb.append('=');
        sb.append(((this.termsAndConditionsUrl == null) ? "<null>" : this.termsAndConditionsUrl));
        sb.append(',');
        sb.append("electronicFundTransferDisclosureUrl");
        sb.append('=');
        sb.append(((this.electronicFundTransferDisclosureUrl == null) ? "<null>" : this.electronicFundTransferDisclosureUrl));
        sb.append(',');
        sb.append("privacyPolicyUrl");
        sb.append('=');
        sb.append(((this.privacyPolicyUrl == null) ? "<null>" : this.privacyPolicyUrl));
        sb.append(',');
        sb.append("wireTransferAgreementUrl");
        sb.append('=');
        sb.append(((this.wireTransferAgreementUrl == null) ? "<null>" : this.wireTransferAgreementUrl));
        sb.append(',');
        sb.append("paperlessAgreementUrl");
        sb.append('=');
        sb.append(((this.paperlessAgreementUrl == null) ? "<null>" : this.paperlessAgreementUrl));
        sb.append(',');
        sb.append("fraudProtectionAgreementUrl");
        sb.append('=');
        sb.append(((this.fraudProtectionAgreementUrl == null) ? "<null>" : this.fraudProtectionAgreementUrl));
        sb.append(',');
        sb.append("tcpaDisclosureContent");
        sb.append('=');
        sb.append(((this.tcpaDisclosureContent == null) ? "<null>" : this.tcpaDisclosureContent));
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
        result = ((result * 31) + ((this.termsAndConditionsUrl == null) ? 0 : this.termsAndConditionsUrl.hashCode()));
        result = ((result * 31) + ((this.electronicFundTransferDisclosureUrl == null) ? 0 : this.electronicFundTransferDisclosureUrl.hashCode()));
        result = ((result * 31) + ((this.wireTransferAgreementUrl == null) ? 0 : this.wireTransferAgreementUrl.hashCode()));
        result = ((result * 31) + ((this.tcpaDisclosureContent == null) ? 0 : this.tcpaDisclosureContent.hashCode()));
        result = ((result * 31) + ((this.productDisclosureUrl == null) ? 0 : this.productDisclosureUrl.hashCode()));
        result = ((result * 31) + ((this.paperlessAgreementUrl == null) ? 0 : this.paperlessAgreementUrl.hashCode()));
        result = ((result * 31) + ((this.fraudProtectionAgreementUrl == null) ? 0 : this.fraudProtectionAgreementUrl.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        result = ((result * 31) + ((this.privacyPolicyUrl == null) ? 0 : this.privacyPolicyUrl.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Disclosures)) {
            return false;
        }
        Disclosures rhs = ((Disclosures) other);
        return (((((((((Objects.equals(this.termsAndConditionsUrl, rhs.termsAndConditionsUrl)) && (Objects.equals(this.electronicFundTransferDisclosureUrl, rhs.electronicFundTransferDisclosureUrl))) && (Objects.equals(this.wireTransferAgreementUrl, rhs.wireTransferAgreementUrl))) && (Objects.equals(this.tcpaDisclosureContent, rhs.tcpaDisclosureContent))) && (Objects.equals(this.productDisclosureUrl, rhs.productDisclosureUrl))) && (Objects.equals(this.paperlessAgreementUrl, rhs.paperlessAgreementUrl))) && (Objects.equals(this.fraudProtectionAgreementUrl, rhs.fraudProtectionAgreementUrl))) && (Objects.equals(this.additionalProperties, rhs.additionalProperties))) && (Objects.equals(this.privacyPolicyUrl, rhs.privacyPolicyUrl)));
    }

}
