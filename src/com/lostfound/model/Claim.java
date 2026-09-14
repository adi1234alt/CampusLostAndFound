package com.lostfound.model;

public class Claim {

    private int claimId;
    private int userId;
    private int itemId;
    private String reason;
    private String status;

    public Claim(int claimId, int userId, int itemId,
                 String reason, String status) {

        this.claimId = claimId;
        this.userId = userId;
        this.itemId = itemId;
        this.reason = reason;
        this.status = status;
    }

    public int getClaimId() {
        return claimId;
    }

    public int getUserId() {
        return userId;
    }

    public int getItemId() {
        return itemId;
    }

    public String getReason() {
        return reason;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}