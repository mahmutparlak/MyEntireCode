package com.company;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1price;

    private String addition2Name;
    private double addition2price;

    private String addition3Name;
    private double addition3price;

    private String addition4Name;
    private double addition4price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1 (String name, double price) {
        this.addition1Name = name;
        this.addition1price = price;
    }

    public void addHamburgerAddition2 (String name, double price) {
        this.addition2Name = name;
        this.addition2price = price;
    }

    public void addHamburgerAddition3 (String name, double price) {
        this.addition3Name = name;
        this.addition3price = price;
    }

    public void addHamburgerAddition4 (String name, double price) {
        this.addition4Name = name;
        this.addition4price = price;
    }

    public double itemizeHamburger () {
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger " + "on a " + this.breadRollType + " roll " + "price is " + this.price);

        if (this.addition1Name != null) {
            hamburgerPrice += this.addition1price;
            System.out.println(this.addition1Name + " added and extra " + this.addition1price + " added.");
        }

        if (this.addition2Name != null) {
            hamburgerPrice += this.addition2price;
            System.out.println(this.addition2Name + " added and extra " + this.addition2price + " added.");
        }

        if (this.addition3Name != null) {
            hamburgerPrice += this.addition3price;
            System.out.println(this.addition3Name + " added and extra " + this.addition3price + " added.");
        }

        if (this.addition4Name != null) {
            hamburgerPrice += this.addition4price;
            System.out.println(this.addition4Name + " added and extra " + this.addition4price + " added.");
        }

        return hamburgerPrice;
    }

}
