package com.lostfound.service;

import com.lostfound.model.Claim;
import java.util.ArrayList;
import java.util.List;

public class ClaimService {

    private List<Claim> claims = new ArrayList<>();

    public void submitClaim(Claim claim) {
        claims.add(claim);
        System.out.println("Claim submitted successfully!");
    }

    public void viewAllClaims() {

        if (claims.isEmpty()) {
            System.out.println("No claims available.");
            return;
        }

        for (Claim claim : claims) {

            System.out.println("Claim ID: " + claim.getClaimId());
            System.out.println("User ID: " + claim.getUserId());
            System.out.println("Item ID: " + claim.getItemId());
            System.out.println("Reason: " + claim.getReason());
            System.out.println("Status: " + claim.getStatus());

            System.out.println("---------------------------");
        }
    }

    public void approveClaim(int claimId) {

        for (Claim claim : claims) {

            if (claim.getClaimId() == claimId) {

                claim.setStatus("APPROVED");

                System.out.println("Claim approved successfully!");
                return;
            }
        }

        System.out.println("Claim not found.");
    }


    public void rejectClaim(int claimId) {

        for (Claim claim : claims) {

            if (claim.getClaimId() == claimId) {

                claim.setStatus("REJECTED");

                System.out.println("Claim rejected successfully!");
                return;
            }
        }

        System.out.println("Claim not found.");
    }

    public int getTotalClaims() {
        return claims.size();
    }

    public int getPendingClaims() {

        int count = 0;

        for (Claim claim : claims) {

            if (claim.getStatus().equals("PENDING")) {
                count++;
            }
        }

        return count;
    }

    public int getApprovedClaims() {

        int count = 0;

        for (Claim claim : claims) {

            if (claim.getStatus().equals("APPROVED")) {
                count++;
            }
        }

        return count;
    }

    public int getRejectedClaims() {

        int count = 0;

        for (Claim claim : claims) {

            if (claim.getStatus().equals("REJECTED")) {
                count++;
            }
        }

        return count;
    }
}