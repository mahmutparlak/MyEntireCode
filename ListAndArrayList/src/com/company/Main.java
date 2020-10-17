package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
	    boolean quit = false;
	    int choice = 0;
	    printInstractions();

	    while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstractions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstractions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - to print choice options");
        System.out.println("\t 1 - to print the list of grocery items");
        System.out.println("\t 2 - to add an item to the list");
        System.out.println("\t 3 - to print modified item in the list");
        System.out.println("\t 4 - to remove item in the list");
        System.out.println("\t 5 - to search item in the list");
        System.out.println("\t 6 - to quit the application.");
    }

    public static void addItem() {
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

//    public static void modifyItem() {
//        System.out.print("Enter item number ");
//        int itemNo = scanner.nextInt();
//        scanner.nextLine();
//        System.out.println("Enter replacement item: ");
//        String newItem = scanner.nextLine();
//        groceryList.modifyGroceryItem(itemNo - 1, newItem);
//    }

    public static void modifyItem() {
        System.out.print("Current item name: ");
        String itemNo = scanner.nextLine();
        System.out.println("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo, newItem);
    }

    public static void removeItem() {
        System.out.print("Enter item name: ");
        String itemNo = scanner.nextLine();
        groceryList.removeGroceryItem(itemNo);
    }

    public static void searchItem() {
        System.out.print("Item to search for: ");
        String searchItem = scanner.nextLine();
        if (groceryList.onFile(searchItem)) {
            System.out.println("found " + searchItem + " in our grocery list");
        } else {
            System.out.println(searchItem + " is not in the shopping list");
        }
    }

    public static void processArrayList () {
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());
    }
}
