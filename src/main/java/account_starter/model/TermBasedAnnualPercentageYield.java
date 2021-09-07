package account_starter.model;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "term",
        "annualPercentageYield"
})
public class TermBasedAnnualPercentageYield {

    @JsonProperty("term")
    private String term;
    @JsonProperty("annualPercentageYield")
    private float annualPercentageYield;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public TermBasedAnnualPercentageYield() {
    }

    /**
     * @param annualPercentageYield
     * @param term
     */
    public TermBasedAnnualPercentageYield(String term, float annualPercentageYield) {
        super();
        this.term = term;
        this.annualPercentageYield = annualPercentageYield;
    }

    @JsonProperty("term")
    public String getTerm() {
        return term;
    }

    @JsonProperty("term")
    public void setTerm(String term) {
        this.term = term;
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
        sb.append(TermBasedAnnualPercentageYield.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("term");
        sb.append('=');
        sb.append(((this.term == null) ? "<null>" : this.term));
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
        result = ((result * 31) + ((this.term == null) ? 0 : this.term.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TermBasedAnnualPercentageYield)) {
            return false;
        }
        TermBasedAnnualPercentageYield rhs = ((TermBasedAnnualPercentageYield) other);
        return (((Float.floatToIntBits(this.annualPercentageYield) == Float.floatToIntBits(rhs.annualPercentageYield)) && (Objects.equals(this.term, rhs.term))) && (Objects.equals(this.additionalProperties, rhs.additionalProperties)));
    }

}
