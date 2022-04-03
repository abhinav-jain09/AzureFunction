package com.ns.rivier.tokenvault.request;

public class AllowRequest {
    private String identifierType;
    private String id;
    private String partnerId;
    private String allow;

    public String getIdentifierType() {
        return identifierType;
    }

    public void setIdentifierType(String identifierType) {
        this.identifierType = identifierType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }

    public String getAllow() {
        return allow;
    }

    public void setAllow(String allow) {
        this.allow = allow;
    }

    @Override
    public String toString() {
        return "AllowRequest{" +
                "identifierType='" + identifierType + '\'' +
                ", id='" + id + '\'' +
                ", partnerId='" + partnerId + '\'' +
                ", allow='" + allow + '\'' +
                '}';
    }
}
