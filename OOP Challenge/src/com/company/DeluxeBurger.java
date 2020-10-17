package com.company;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe Burger", "Sausage, Bacon", 14.54, "White");
        super.addHamburgerAddition1("Chips", 2.2);
        super.addHamburgerAddition2("Cola", 2.2);

    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add additions on deluxe burger.");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add additions on deluxe burger.");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add additions on deluxe burger.");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add additions on deluxe burger.");
    }
}
