package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("434 282 9690");

    public static void main(String[] args) {
	boolean quit = false;
	startPhone();
	printAction();
	while (!quit) {
        System.out.println("\n Enter action: (press 6 to show available actions");
        int action = scanner.nextInt();
        scanner.nextLine();

        switch (action) {
            case 0:
                System.out.println("\n Shutting down...");
                quit = true;
                break;
            case 1:
                mobilePhone.printContacts();
                break;
            case 2:
                addNewContact();
                break;
            case 3:
                updateContact();
                break;
            case 4:
                removeContact();
                break;
            case 5:
                queryContact();
                break;
            case 6:
                printAction();
                break;
        }
    }
    }

    private static void addNewContact () {
        System.out.println("Add new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Add new phone number: ");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phone);

        if (mobilePhone.addNewContact(newContact)) {
            System.out.println("New contact added: name = " + name + ", phone = " + phone);
        } else {
            System.out.println("Cannot add " + name + " already on file." );
        }
    }

    private static void updateContact () {
        System.out.println("Enter existing contact name = ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact cannot be found.");
            return;
        }
        System.out.print("Enter new contact name = ");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact phone number = ");
        String newPhoneNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newPhoneNumber);
        if (mobilePhone.upDateContact(existingContactRecord, newContact)) {
            System.out.println("Successfully updated record.");
        } else {
            System.out.println("Record cannot be updated.");
        }
    }

    private static void removeContact () {
        System.out.println("Enter existing contact name = ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact cannot be found.");
            return;
        }

        if (mobilePhone.removeContact(existingContactRecord)) {
            System.out.println("Successfully deleted.");
        } else {
            System.out.println("Error deleting contact.");
        }
    }

    private static void queryContact () {
        System.out.println("Enter existing contact name = ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact cannot be found.");
            return;
        }
        System.out.println("Name " + existingContactRecord.getName() + "Phone number " + existingContactRecord.getPhoneNumber());
    }

    private static void startPhone () {
        System.out.println("Phone starting...");
    }

    public static void printAction () {
        System.out.println("\n Available actions: \n press...");
        System.out.println("0 - to shutdown \n" +
                           "1 - to print contacts \n" +
                           "2 - to add a new contact \n" +
                           "3 - to update an existing contact \n" +
                           "4 - to remove an existing contact \n" +
                           "5 - to query if an existing contact exist \n" +
                           "6 - to print a list of available actions.");
        System.out.println("Choose your actions; ");
    }
}
