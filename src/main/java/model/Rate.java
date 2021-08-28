package model;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "rateType",
        "rateTiers"
})
public class Rate {

    @JsonProperty("rateType")
    private String rateType;
    @JsonProperty("rateTiers")
    private List<RateTier> rateTiers = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

    /**
     * No args constructor for use in serialization
     */
    public Rate() {
    }

    /**
     * @param rateType
     * @param rateTiers
     */
    public Rate(String rateType, List<RateTier> rateTiers) {
        super();
        this.rateType = rateType;
        this.rateTiers = rateTiers;
    }

    @JsonProperty("rateType")
    public String getRateType() {
        return rateType;
    }

    @JsonProperty("rateType")
    public void setRateType(String rateType) {
        this.rateType = rateType;
    }

    @JsonProperty("rateTiers")
    public List<RateTier> getRateTiers() {
        return rateTiers;
    }

    @JsonProperty("rateTiers")
    public void setRateTiers(List<RateTier> rateTiers) {
        this.rateTiers = rateTiers;
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
        sb.append(Rate.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("rateType");
        sb.append('=');
        sb.append(((this.rateType == null) ? "<null>" : this.rateType));
        sb.append(',');
        sb.append("rateTiers");
        sb.append('=');
        sb.append(((this.rateTiers == null) ? "<null>" : this.rateTiers));
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
        result = ((result * 31) + ((this.rateType == null) ? 0 : this.rateType.hashCode()));
        result = ((result * 31) + ((this.rateTiers == null) ? 0 : this.rateTiers.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Rate)) {
            return false;
        }
        Rate rhs = ((Rate) other);
        return (((Objects.equals(this.rateType, rhs.rateType)) && (Objects.equals(this.rateTiers, rhs.rateTiers))) && (Objects.equals(this.additionalProperties, rhs.additionalProperties)));
    }

}
