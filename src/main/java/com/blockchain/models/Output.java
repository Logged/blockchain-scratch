package com.blockchain.models;

public class Output {
    private final String value;
    private final String scriptPubKey;

    public Output(String value, String scriptPubKey) {
        this.value = value;
        this.scriptPubKey = scriptPubKey;
    }

    public String getValue() {
        return value;
    }

    public String getScriptPubKey() {
        return scriptPubKey;
    }
}
