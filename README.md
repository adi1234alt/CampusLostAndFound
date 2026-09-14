# Campus Lost and Found System

## Overview

Campus Lost and Found System is a Java-based console application made to manage lost and found items within a college campus.

The main idea of this project is to make it easier for students and staff to report items, search for items, and claim their belongings. An admin is also provided to manage and verify the claims.

## Features

- Report a lost item
- Report a found item
- View all reported items
- Search items by name
- Search items by category
- Submit a claim for an item
- View all claims
- Admin login
- Approve claims
- Reject claims
- View project statistics
- Input validation and error messages

## Technologies Used

- Java
- Object-Oriented Programming
- IntelliJ IDEA
- ArrayList
- Git
- GitHub

## Project Structure

```text
CampusLostAndFound
└── src
    └── com.lostfound
        ├── Main.java
        ├── model
        │   ├── User.java
        │   ├── Admin.java
        │   ├── Item.java
        │   ├── LostItem.java
        │   ├── FoundItem.java
        │   └── Claim.java
        └── service
            ├── ItemService.java
            ├── FoundItemService.java
            └── ClaimService.java