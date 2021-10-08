package main.java.models;

import java.util.LinkedList;

public class Transaction {
    private final String hash;
    private final String ver;
    private final String lockTime;
    private final LinkedList<Input> in;
    private final LinkedList<Output> out;

    public Transaction(String hash, String ver, String lockTime, LinkedList<Input> in, LinkedList<Output> out) {
        this.hash = hash;
        this.ver = ver;
        this.lockTime = lockTime;
        this.in = in;
        this.out = out;
    }

    public String getHash() {
        return hash;
    }

    public String getVer() {
        return ver;
    }

    public String getLockTime() {
        return lockTime;
    }

    public LinkedList<Input> getIn() {
        return in;
    }

    public LinkedList<Output> getOut() {
        return out;
    }
}
