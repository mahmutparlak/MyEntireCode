package com.company;

public class Main {

    public static void main(String[] args) {
	Hamburger hamburger = new Hamburger("Basic", "lamp", 5.5, "Italian herb-cheese");
	double price = hamburger.itemizeHamburger();
	hamburger.addHamburgerAddition1("tomato", 2.1);
	hamburger.addHamburgerAddition2("pepper", 2.1);
	hamburger.addHamburgerAddition3("extra cheese", 1.3);
	System.out.println("Total hamburger price is " + hamburger.itemizeHamburger());

	HealthyBurger healthyBurger = new HealthyBurger("caw", 5.5);
	healthyBurger.addHealthyAddition1("egg", 2.1);
	healthyBurger.addHealthyAddition2("olive", 1.1);
	System.out.println("Total healthy burger price is " + hamburger.itemizeHamburger());

	DeluxeBurger deluxeBurger = new DeluxeBurger();
	deluxeBurger.itemizeHamburger();

    }
}
