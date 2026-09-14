# Campus Lost and Found System

## Problem Statement

In college, students and staff sometimes lose things like ID cards, books, bags, wallets, or electronic items. At the same time, someone else may find these items. If there is no proper system to manage them, it becomes difficult to find the owner and return the item.

To solve this problem, I developed a Campus Lost and Found System using Java. The system allows users to report lost and found items, search for items, and submit a claim. An admin can check the claims and either approve or reject them.

## Scope

The project is mainly focused on handling lost and found items inside a college campus.

The system allows users to:

- Report a lost item.
- Report a found item.
- See all available items.
- Search for an item by name.
- Search for an item by category.
- Submit a claim for an item.
- See the submitted claims.

The admin can:

- Login using admin credentials.
- View all claims.
- Approve a claim.
- Reject a claim.
- Check basic project statistics.

Currently, the project is a console-based Java application. The data is stored temporarily using `ArrayList`, so it is not connected to a database yet.

## Target Users

### Students and Staff

Students and staff are the main users of the system. They can report lost or found items, search for items, and submit claims.

### Administrator

The administrator is responsible for checking the claims submitted by users. The admin can view claims and decide whether to approve or reject them.

## Main Features

### 1. Report Lost Item

A user can enter the item name, category, location, and description. After adding the item, the system generates an Item ID.

### 2. Report Found Item

A user can enter the details of an item they found. The item is added to the system with the status `FOUND`.

### 3. View and Search Items

Users can view all items in the system. They can also search for an item using its name or category.

### 4. Submit a Claim

If a user finds an item that belongs to them, they can submit a claim by entering the Item ID and explaining why they are claiming it. The claim starts with the status `PENDING`.

### 5. Admin Approval or Rejection

The admin can login and check the submitted claims. The admin can change the claim status to either `APPROVED` or `REJECTED`.

### 6. Project Statistics

The system also shows some basic statistics, such as:

- Total number of items
- Number of lost items
- Number of found items
- Total claims
- Pending claims
- Approved claims
- Rejected claims

## Technologies Used

- Java
- Object-Oriented Programming
- IntelliJ IDEA
- ArrayList
- Git
- GitHub

## Project Type

This is a **console-based Java application**. Users interact with the system through a menu displayed in the command prompt.