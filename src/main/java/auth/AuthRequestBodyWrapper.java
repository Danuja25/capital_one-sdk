package auth;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AuthRequestBodyWrapper implements Serializable
{
    private String clientId = null;
    private String clientSecret = null;
    private String grantType = null;

    public AuthRequestBodyWrapper clientId(String clientId)
    {
        this.clientId = clientId;
        return this;
    }

    public AuthRequestBodyWrapper clientSecret(String clientSecret)
    {
        this.clientSecret = clientSecret;
        return this;
    }

    public AuthRequestBodyWrapper grantType(String grantType)
    {
        this.grantType = grantType;
        return this;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public String getGrantType() {
        return grantType;
    }

    public void setGrantType(String grantType) {
        this.grantType = grantType;
    }
}
