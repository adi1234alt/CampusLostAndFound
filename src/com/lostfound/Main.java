package com.lostfound;

import java.util.Scanner;

import com.lostfound.model.User;
import com.lostfound.model.Admin;
import com.lostfound.model.LostItem;
import com.lostfound.model.FoundItem;
import com.lostfound.model.Claim;
import com.lostfound.service.ItemService;
import com.lostfound.service.FoundItemService;
import com.lostfound.service.ClaimService;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        User user = new User(
                1,
                "Aditya",
                "aditya@example.com",
                "1234"
        );

        Admin admin = new Admin(
                1,
                "aditya",
                "aditya123"
        );

        ItemService itemService = new ItemService();
        FoundItemService foundItemService = new FoundItemService();
        ClaimService claimService = new ClaimService();

        int choice;
        int nextItemId = 101;
        int nextClaimId = 1;

        do {

            System.out.println("\n===== CAMPUS LOST AND FOUND =====");
            System.out.println("1. Report Lost Item");
            System.out.println("2. Report Found Item");
            System.out.println("3. View All Items");
            System.out.println("4. Search Item by Name");
            System.out.println("5. Search Item by Category");
            System.out.println("6. Submit Claim");
            System.out.println("7. View All Claims");
            System.out.println("8. View Project Statistics");
            System.out.println("9. Approve Claim");
            System.out.println("10. Reject Claim");
            System.out.println("11. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:

                    System.out.println("\n===== REPORT LOST ITEM =====");

                    System.out.print("Enter item name: ");
                    String lostItemName = scanner.nextLine();

                    if (lostItemName.trim().isEmpty()) {
                        System.out.println("Item name cannot be empty.");
                        break;
                    }

                    System.out.print("Enter category: ");
                    String lostCategory = scanner.nextLine();

                    if (lostCategory.trim().isEmpty()) {
                        System.out.println("Category cannot be empty.");
                        break;
                    }

                    System.out.print("Enter location where you lost it: ");
                    String lostLocation = scanner.nextLine();

                    if (lostLocation.trim().isEmpty()) {
                        System.out.println("Location cannot be empty.");
                        break;
                    }

                    System.out.print("Enter description: ");
                    String lostDescription = scanner.nextLine();

                    LostItem lostItem = new LostItem(
                            nextItemId,
                            lostItemName,
                            lostCategory,
                            lostLocation,
                            lostDescription,
                            "LOST"
                    );

                    itemService.addItem(lostItem);

                    System.out.println("Lost item reported successfully!");
                    System.out.println("Your Item ID is: " + nextItemId);

                    nextItemId++;

                    break;


                case 2:

                    System.out.println("\n===== REPORT FOUND ITEM =====");

                    System.out.print("Enter item name: ");
                    String foundItemName = scanner.nextLine();

                    if (foundItemName.trim().isEmpty()) {
                        System.out.println("Item name cannot be empty.");
                        break;
                    }

                    System.out.print("Enter category: ");
                    String foundCategory = scanner.nextLine();

                    if (foundCategory.trim().isEmpty()) {
                        System.out.println("Category cannot be empty.");
                        break;
                    }

                    System.out.print("Enter location where you found it: ");
                    String foundLocation = scanner.nextLine();

                    if (foundLocation.trim().isEmpty()) {
                        System.out.println("Location cannot be empty.");
                        break;
                    }

                    System.out.print("Enter description: ");
                    String foundDescription = scanner.nextLine();

                    FoundItem foundItem = new FoundItem(
                            nextItemId,
                            foundItemName,
                            foundCategory,
                            foundLocation,
                            foundDescription,
                            "FOUND"
                    );

                    foundItemService.addFoundItem(foundItem);
                    itemService.addItem(foundItem);

                    System.out.println("Found item reported successfully!");
                    System.out.println("Item ID is: " + nextItemId);

                    nextItemId++;

                    break;


                case 3:

                    System.out.println("\n===== ALL ITEMS =====");
                    itemService.viewAllItems();

                    break;


                case 4:

                    System.out.print("\nEnter item name to search: ");
                    String searchName = scanner.nextLine();

                    if (searchName.trim().isEmpty()) {
                        System.out.println("Search name cannot be empty.");
                        break;
                    }

                    itemService.searchByName(searchName);

                    break;


                case 5:

                    System.out.print("\nEnter category to search: ");
                    String searchCategory = scanner.nextLine();

                    if (searchCategory.trim().isEmpty()) {
                        System.out.println("Search category cannot be empty.");
                        break;
                    }

                    itemService.searchByCategory(searchCategory);

                    break;


                case 6:

                    System.out.println("\n===== SUBMIT CLAIM =====");

                    System.out.print("Enter Item ID: ");
                    int itemId = scanner.nextInt();
                    scanner.nextLine();

                    if (!itemService.itemExists(itemId)) {
                        System.out.println("Invalid Item ID. Item does not exist.");
                        break;
                    }

                    System.out.print("Enter reason for claiming this item: ");
                    String reason = scanner.nextLine();

                    if (reason.trim().isEmpty()) {
                        System.out.println("Claim reason cannot be empty.");
                        break;
                    }

                    Claim claim = new Claim(
                            nextClaimId,
                            user.getId(),
                            itemId,
                            reason,
                            "PENDING"
                    );

                    claimService.submitClaim(claim);

                    nextClaimId++;

                    break;


                case 7:

                    System.out.println("\n===== ALL CLAIMS =====");
                    claimService.viewAllClaims();

                    break;


                case 8:

                    System.out.println("\n===== PROJECT STATISTICS =====");

                    System.out.println(
                            "Total Items: " + itemService.getTotalItems()
                    );

                    System.out.println(
                            "Lost Items: " + itemService.getLostItems()
                    );

                    System.out.println(
                            "Found Items: " + itemService.getFoundItems()
                    );

                    System.out.println("---------------------------");

                    System.out.println(
                            "Total Claims: " + claimService.getTotalClaims()
                    );

                    System.out.println(
                            "Pending Claims: " + claimService.getPendingClaims()
                    );

                    System.out.println(
                            "Approved Claims: " + claimService.getApprovedClaims()
                    );

                    System.out.println(
                            "Rejected Claims: " + claimService.getRejectedClaims()
                    );

                    break;


                case 9:

                    System.out.println("\n===== ADMIN LOGIN =====");

                    System.out.print("Enter admin username: ");
                    String adminUsername = scanner.nextLine();

                    System.out.print("Enter admin password: ");
                    String adminPassword = scanner.nextLine();

                    if (adminUsername.equals(admin.getUsername())
                            && adminPassword.equals(admin.getPassword())) {

                        System.out.println("Admin login successful!");

                        System.out.print("Enter Claim ID: ");
                        int approveId = scanner.nextInt();
                        scanner.nextLine();

                        claimService.approveClaim(approveId);

                    } else {

                        System.out.println(
                                "Invalid admin username or password."
                        );
                    }

                    break;


                case 10:

                    System.out.println("\n===== ADMIN LOGIN =====");

                    System.out.print("Enter admin username: ");
                    String adminUsername2 = scanner.nextLine();

                    System.out.print("Enter admin password: ");
                    String adminPassword2 = scanner.nextLine();

                    if (adminUsername2.equals(admin.getUsername())
                            && adminPassword2.equals(admin.getPassword())) {

                        System.out.println("Admin login successful!");

                        System.out.print("Enter Claim ID: ");
                        int rejectId = scanner.nextInt();
                        scanner.nextLine();

                        claimService.rejectClaim(rejectId);

                    } else {

                        System.out.println(
                                "Invalid admin username or password."
                        );
                    }

                    break;


                case 11:

                    System.out.println(
                            "Thank you for using Campus Lost and Found!"
                    );

                    break;


                default:

                    System.out.println("Invalid choice!");
            }

        } while (choice != 11);

        scanner.close();
    }
}