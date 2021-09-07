package account_starter.model;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "tierDescription",
        "annualPercentageYield"
})
public class TieredAnnualPercentageYield {

    @JsonProperty("tierDescription")
    private String tierDescription;
    @JsonProperty("annualPercentageYield")
    private float annualPercentageYield;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public TieredAnnualPercentageYield() {
    }

    /**
     * @param annualPercentageYield
     * @param tierDescription
     */
    public TieredAnnualPercentageYield(String tierDescription, float annualPercentageYield) {
        super();
        this.tierDescription = tierDescription;
        this.annualPercentageYield = annualPercentageYield;
    }

    @JsonProperty("tierDescription")
    public String getTierDescription() {
        return tierDescription;
    }

    @JsonProperty("tierDescription")
    public void setTierDescription(String tierDescription) {
        this.tierDescription = tierDescription;
    }

    @JsonProperty("annualPercentageYield")
    public float getAnnualPercentageYield() {
        return annualPercentageYield;
    }

    @JsonProperty("annualPercentageYield")
    public void setAnnualPercentageYield(float annualPercentageYield) {
        this.annualPercentageYield = annualPercentageYield;
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
        sb.append(TieredAnnualPercentageYield.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tierDescription");
        sb.append('=');
        sb.append(((this.tierDescription == null) ? "<null>" : this.tierDescription));
        sb.append(',');
        sb.append("annualPercentageYield");
        sb.append('=');
        sb.append(this.annualPercentageYield);
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
        result = ((result * 31) + Float.floatToIntBits(this.annualPercentageYield));
        result = ((result * 31) + ((this.tierDescription == null) ? 0 : this.tierDescription.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TieredAnnualPercentageYield)) {
            return false;
        }
        TieredAnnualPercentageYield rhs = ((TieredAnnualPercentageYield) other);
        return (((Float.floatToIntBits(this.annualPercentageYield) == Float.floatToIntBits(rhs.annualPercentageYield)) && (Objects.equals(this.tierDescription, rhs.tierDescription))) && (Objects.equals(this.additionalProperties, rhs.additionalProperties)));
    }

}
