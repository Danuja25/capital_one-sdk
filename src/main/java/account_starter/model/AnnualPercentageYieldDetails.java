package account_starter.model;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "annualPercentageYieldType",
        "annualPercentageYield",
        "tieredAnnualPercentageYield",
        "termBasedAnnualPercentageYield"
})
public class AnnualPercentageYieldDetails {

    @JsonProperty("annualPercentageYieldType")
    private String annualPercentageYieldType;
    @JsonProperty("annualPercentageYield")
    private float annualPercentageYield;
    @JsonProperty("tieredAnnualPercentageYield")
    private List<TieredAnnualPercentageYield> tieredAnnualPercentageYield = null;
    @JsonProperty("termBasedAnnualPercentageYield")
    private List<TermBasedAnnualPercentageYield> termBasedAnnualPercentageYield = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public AnnualPercentageYieldDetails() {
    }

    /**
     * @param annualPercentageYield
     * @param termBasedAnnualPercentageYield
     * @param tieredAnnualPercentageYield
     * @param annualPercentageYieldType
     */
    public AnnualPercentageYieldDetails(String annualPercentageYieldType, float annualPercentageYield, List<TieredAnnualPercentageYield> tieredAnnualPercentageYield, List<TermBasedAnnualPercentageYield> termBasedAnnualPercentageYield) {
        super();
        this.annualPercentageYieldType = annualPercentageYieldType;
        this.annualPercentageYield = annualPercentageYield;
        this.tieredAnnualPercentageYield = tieredAnnualPercentageYield;
        this.termBasedAnnualPercentageYield = termBasedAnnualPercentageYield;
    }

    @JsonProperty("annualPercentageYieldType")
    public String getAnnualPercentageYieldType() {
        return annualPercentageYieldType;
    }

    @JsonProperty("annualPercentageYieldType")
    public void setAnnualPercentageYieldType(String annualPercentageYieldType) {
        this.annualPercentageYieldType = annualPercentageYieldType;
    }

    @JsonProperty("annualPercentageYield")
    public float getAnnualPercentageYield() {
        return annualPercentageYield;
    }

    @JsonProperty("annualPercentageYield")
    public void setAnnualPercentageYield(float annualPercentageYield) {
        this.annualPercentageYield = annualPercentageYield;
    }

    @JsonProperty("tieredAnnualPercentageYield")
    public List<TieredAnnualPercentageYield> getTieredAnnualPercentageYield() {
        return tieredAnnualPercentageYield;
    }

    @JsonProperty("tieredAnnualPercentageYield")
    public void setTieredAnnualPercentageYield(List<TieredAnnualPercentageYield> tieredAnnualPercentageYield) {
        this.tieredAnnualPercentageYield = tieredAnnualPercentageYield;
    }

    @JsonProperty("termBasedAnnualPercentageYield")
    public List<TermBasedAnnualPercentageYield> getTermBasedAnnualPercentageYield() {
        return termBasedAnnualPercentageYield;
    }

    @JsonProperty("termBasedAnnualPercentageYield")
    public void setTermBasedAnnualPercentageYield(List<TermBasedAnnualPercentageYield> termBasedAnnualPercentageYield) {
        this.termBasedAnnualPercentageYield = termBasedAnnualPercentageYield;
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
        sb.append(AnnualPercentageYieldDetails.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("annualPercentageYieldType");
        sb.append('=');
        sb.append(((this.annualPercentageYieldType == null) ? "<null>" : this.annualPercentageYieldType));
        sb.append(',');
        sb.append("annualPercentageYield");
        sb.append('=');
        sb.append(this.annualPercentageYield);
        sb.append(',');
        sb.append("tieredAnnualPercentageYield");
        sb.append('=');
        sb.append(((this.tieredAnnualPercentageYield == null) ? "<null>" : this.tieredAnnualPercentageYield));
        sb.append(',');
        sb.append("termBasedAnnualPercentageYield");
        sb.append('=');
        sb.append(((this.termBasedAnnualPercentageYield == null) ? "<null>" : this.termBasedAnnualPercentageYield));
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
        result = ((result * 31) + ((this.annualPercentageYieldType == null) ? 0 : this.annualPercentageYieldType.hashCode()));
        result = ((result * 31) + Float.floatToIntBits(this.annualPercentageYield));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        result = ((result * 31) + ((this.termBasedAnnualPercentageYield == null) ? 0 : this.termBasedAnnualPercentageYield.hashCode()));
        result = ((result * 31) + ((this.tieredAnnualPercentageYield == null) ? 0 : this.tieredAnnualPercentageYield.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AnnualPercentageYieldDetails)) {
            return false;
        }
        AnnualPercentageYieldDetails rhs = ((AnnualPercentageYieldDetails) other);
        return (((((Objects.equals(this.annualPercentageYieldType, rhs.annualPercentageYieldType)) && (Float.floatToIntBits(this.annualPercentageYield) == Float.floatToIntBits(rhs.annualPercentageYield))) && (Objects.equals(this.additionalProperties, rhs.additionalProperties))) && (Objects.equals(this.termBasedAnnualPercentageYield, rhs.termBasedAnnualPercentageYield))) && (Objects.equals(this.tieredAnnualPercentageYield, rhs.tieredAnnualPercentageYield)));
    }

}
