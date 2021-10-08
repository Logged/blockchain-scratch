package com.blockchain.models;

public class Input {
    private final PrevOut prevOut;
    private final String scriptSig;

    public Input(PrevOut prevOut, String scriptSig) {
        this.prevOut = prevOut;
        this.scriptSig = scriptSig;
    }

    public PrevOut getPrevOut() {
        return prevOut;
    }

    public String getScriptSig() {
        return scriptSig;
    }

    public static class PrevOut {
        private final String hash;
        private final int n;

        public PrevOut(String hash, int n) {
            this.hash = hash;
            this.n =n;
        }

        public String getHash() {
            return hash;
        }

        public int getN() {
            return n;
        }
    }
}
