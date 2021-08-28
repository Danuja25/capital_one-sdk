package model;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "featureDetails"
})
public class Feature {

    @JsonProperty("featureDetails")
    private FeatureDetails featureDetails;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

    /**
     * No args constructor for use in serialization
     */
    public Feature() {
    }

    /**
     * @param featureDetails
     */
    public Feature(FeatureDetails featureDetails) {
        super();
        this.featureDetails = featureDetails;
    }

    @JsonProperty("featureDetails")
    public FeatureDetails getFeatureDetails() {
        return featureDetails;
    }

    @JsonProperty("featureDetails")
    public void setFeatureDetails(FeatureDetails featureDetails) {
        this.featureDetails = featureDetails;
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
        sb.append(Feature.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("featureDetails");
        sb.append('=');
        sb.append(((this.featureDetails == null) ? "<null>" : this.featureDetails));
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
        result = ((result * 31) + ((this.featureDetails == null) ? 0 : this.featureDetails.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Feature)) {
            return false;
        }
        Feature rhs = ((Feature) other);
        return ((Objects.equals(this.featureDetails, rhs.featureDetails)) && (Objects.equals(this.additionalProperties, rhs.additionalProperties)));
    }

}
