package com.company;

public class Main {

    public static void main(String[] args) {
	Printer printer = new Printer(50, true);
        System.out.println("Initial page count = " + printer.getNumberOfPage());
        int numberOfPages = printer.printPages(4);
        System.out.println("Pages printed was " + numberOfPages + ". New total printed count is " + printer.getNumberOfPage());
        numberOfPages = printer.printPages(7);
        System.out.println("Pages printed was " + numberOfPages + ". New total printed count is " + printer.getNumberOfPage());
    }
}
