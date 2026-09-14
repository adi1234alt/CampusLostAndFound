package com.lostfound.service;

import com.lostfound.model.Item;
import java.util.ArrayList;
import java.util.List;

public class ItemService {

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void viewAllItems() {

        if (items.isEmpty()) {
            System.out.println("No items available.");
            return;
        }

        for (Item item : items) {

            System.out.println("Item ID: " + item.getItemId());
            System.out.println("Name: " + item.getItemName());
            System.out.println("Category: " + item.getCategory());
            System.out.println("Location: " + item.getLocation());
            System.out.println("Description: " + item.getDescription());
            System.out.println("Status: " + item.getStatus());

            System.out.println("---------------------------");
        }
    }

    public void searchByName(String name) {

        boolean found = false;

        for (Item item : items) {

            if (item.getItemName().toLowerCase().contains(name.toLowerCase())) {

                displayItem(item);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No item found with name: " + name);
        }
    }

    public void searchByCategory(String category) {

        boolean found = false;

        for (Item item : items) {

            if (item.getCategory().toLowerCase().contains(category.toLowerCase())) {

                displayItem(item);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No item found in category: " + category);
        }
    }

    private void displayItem(Item item) {

        System.out.println("Item Found!");
        System.out.println("Item ID: " + item.getItemId());
        System.out.println("Name: " + item.getItemName());
        System.out.println("Category: " + item.getCategory());
        System.out.println("Location: " + item.getLocation());
        System.out.println("Description: " + item.getDescription());
        System.out.println("Status: " + item.getStatus());
        System.out.println("---------------------------");
    }

    public boolean itemExists(int itemId) {

        for (Item item : items) {

            if (item.getItemId() == itemId) {
                return true;
            }
        }

        return false;
    }

    public int getTotalItems() {
        return items.size();
    }

    public int getLostItems() {

        int count = 0;

        for (Item item : items) {

            if (item.getStatus().equals("LOST")) {
                count++;
            }
        }

        return count;
    }

    public int getFoundItems() {

        int count = 0;

        for (Item item : items) {

            if (item.getStatus().equals("FOUND")) {
                count++;
            }
        }

        return count;
    }

}