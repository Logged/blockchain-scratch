package com.blockchain.models;

import java.util.LinkedList;

public class Block {
    private final String hash;
    private final String size;
    private final BlockHeader header;
    private final String txCounter;
    private final LinkedList<Transaction> transactions;

    public Block(String hash, BlockHeader header, String size, String txCounter, LinkedList<Transaction> transactions) {
        this.hash = hash;
        this.header = header;
        this.size = size;
        this.txCounter = txCounter;
        this.transactions = transactions;
    }

    public String getHash() {
        return hash;
    }

    public BlockHeader getHeader() {
        return header;
    }

    public String getSize() {
        return size;
    }

    public String getTxCounter() {
        return txCounter;
    }

    public LinkedList<Transaction> getTransactions() {
        return transactions;
    }

    private static class BlockHeader {
        private final String ver;
        private final String hashPrevBlock;
        private final String hashMerkleRoot;
        private final String time;
        private final String bits;
        private final String nonce;

        public BlockHeader(String ver, String hashPrevBlock, String hashMerkleRoot, String time, String bits, String nonce) {
            this.ver = ver;
            this.hashPrevBlock = hashPrevBlock;
            this.hashMerkleRoot = hashMerkleRoot;
            this.time = time;
            this.bits = bits;
            this.nonce = nonce;
        }

        public String getVer() {
            return ver;
        }

        public String getHashPrevBlock() {
            return hashPrevBlock;
        }

        public String getHashMerkleRoot() {
            return hashMerkleRoot;
        }

        public String getTime() {
            return time;
        }

        public String getBits() {
            return bits;
        }

        public String getNonce() {
            return nonce;
        }
    }
}
