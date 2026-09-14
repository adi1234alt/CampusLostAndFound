package com.lostfound.model;

public class Item {

    private int itemId;
    private String itemName;
    private String category;
    private String location;
    private String description;
    private String status;

    public Item(int itemId, String itemName, String category,
                String location, String description, String status) {

        this.itemId = itemId;
        this.itemName = itemName;
        this.category = category;
        this.location = location;
        this.description = description;
        this.status = status;

    }

    public int getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public String getCategory() {
        return category;
    }

    public String getLocation() {
        return location;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

}