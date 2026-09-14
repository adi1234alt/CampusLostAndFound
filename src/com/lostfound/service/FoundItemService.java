package com.lostfound.service;

import com.lostfound.model.FoundItem;
import java.util.ArrayList;
import java.util.List;

public class FoundItemService {

    private List<FoundItem> foundItems = new ArrayList<>();

    public void addFoundItem(FoundItem item) {
        foundItems.add(item);
    }

    public void viewFoundItems() {

        for (FoundItem item : foundItems) {

            System.out.println("Item ID: " + item.getItemId());
            System.out.println("Name: " + item.getItemName());
            System.out.println("Category: " + item.getCategory());
            System.out.println("Location: " + item.getLocation());
            System.out.println("Description: " + item.getDescription());
            System.out.println("Status: " + item.getStatus());

            System.out.println("---------------------------");
        }
    }
}