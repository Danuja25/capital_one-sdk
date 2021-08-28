package model;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "annualizedPercentageYield",
        "term",
        "minimumBalance",
        "maximumBalance"
})
public class RateTier {

    @JsonProperty("annualizedPercentageYield")
    private float annualizedPercentageYield;
    @JsonProperty("term")
    private long term;
    @JsonProperty("minimumBalance")
    private long minimumBalance;
    @JsonProperty("maximumBalance")
    private long maximumBalance;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

    /**
     * No args constructor for use in serialization
     */
    public RateTier() {
    }

    /**
     * @param annualizedPercentageYield
     * @param minimumBalance
     * @param maximumBalance
     * @param term
     */
    public RateTier(float annualizedPercentageYield, long term, long minimumBalance, long maximumBalance) {
        super();
        this.annualizedPercentageYield = annualizedPercentageYield;
        this.term = term;
        this.minimumBalance = minimumBalance;
        this.maximumBalance = maximumBalance;
    }

    @JsonProperty("annualizedPercentageYield")
    public float getAnnualizedPercentageYield() {
        return annualizedPercentageYield;
    }

    @JsonProperty("annualizedPercentageYield")
    public void setAnnualizedPercentageYield(float annualizedPercentageYield) {
        this.annualizedPercentageYield = annualizedPercentageYield;
    }

    @JsonProperty("term")
    public long getTerm() {
        return term;
    }

    @JsonProperty("term")
    public void setTerm(long term) {
        this.term = term;
    }

    @JsonProperty("minimumBalance")
    public long getMinimumBalance() {
        return minimumBalance;
    }

    @JsonProperty("minimumBalance")
    public void setMinimumBalance(long minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    @JsonProperty("maximumBalance")
    public long getMaximumBalance() {
        return maximumBalance;
    }

    @JsonProperty("maximumBalance")
    public void setMaximumBalance(long maximumBalance) {
        this.maximumBalance = maximumBalance;
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
        sb.append(RateTier.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("annualizedPercentageYield");
        sb.append('=');
        sb.append(this.annualizedPercentageYield);
        sb.append(',');
        sb.append("term");
        sb.append('=');
        sb.append(this.term);
        sb.append(',');
        sb.append("minimumBalance");
        sb.append('=');
        sb.append(this.minimumBalance);
        sb.append(',');
        sb.append("maximumBalance");
        sb.append('=');
        sb.append(this.maximumBalance);
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
        result = ((result * 31) + ((int) (this.maximumBalance ^ (this.maximumBalance >>> 32))));
        result = ((result * 31) + ((int) (this.term ^ (this.term >>> 32))));
        result = ((result * 31) + Float.floatToIntBits(this.annualizedPercentageYield));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        result = ((result * 31) + ((int) (this.minimumBalance ^ (this.minimumBalance >>> 32))));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof RateTier)) {
            return false;
        }
        RateTier rhs = ((RateTier) other);
        return (((((this.maximumBalance == rhs.maximumBalance) && (this.term == rhs.term)) && (Float.floatToIntBits(this.annualizedPercentageYield) == Float.floatToIntBits(rhs.annualizedPercentageYield))) && (Objects.equals(this.additionalProperties, rhs.additionalProperties))) && (this.minimumBalance == rhs.minimumBalance));
    }

}
