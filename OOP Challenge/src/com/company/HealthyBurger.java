package com.company;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1price;

    private String healthyExtra2Name;
    private double healthyExtra2price;

    public HealthyBurger (String meat, double price) {
        super ("Healthy", meat, price, "Brown rye");
    }

    public void addHealthyAddition1 (String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1price = price;
    }

    public void addHealthyAddition2 (String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2price = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();
        if (healthyExtra1Name != null) {
            hamburgerPrice += this.healthyExtra1price;
            System.out.println(this.healthyExtra1Name + " added and new price is " + this.healthyExtra1price);
        }
        if (healthyExtra2Name != null) {
            hamburgerPrice += this.healthyExtra2price;
            System.out.println(this.healthyExtra2Name + " added and new price is " + this.healthyExtra2price);
        }
        return hamburgerPrice;
    }
}
