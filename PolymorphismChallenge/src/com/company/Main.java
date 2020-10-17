package com.company;

class Car {
    private String name;
    private int cylinders;
    private int wheels;
    private boolean hasEngine;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.hasEngine = true;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String amaze () {
        return "This is amaze 1";
    }
}

class BMW extends Car {
    public BMW () {
        super ("Z3", 12);
    }

    @Override
    public String amaze() {
        return "This is second fastest car in the world";
    }
}

class Toyota extends Car {
    public Toyota () {
        super ("Sonata", 8);
    }

    @Override
    public String amaze() {
        return "This is slowest race car in the world";
    }
}

class Ford extends Car {
    public Ford () {
        super ("Mustang", 16);
    }

    @Override
    public String amaze() {
        return "This is fastest race car in the world";
    }
}

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i < 7; i++) {
            Car car = randomCAR();
            System.out.println("Car #" + i + " : " + car.getName() + "\n" + "amaze: " + car.amaze() + "\n"
            + ". The car cylinder is " + car.getCylinders());
        }
    }
    public static Car randomCAR () {
        int randomCar = (int) (Math.random() * 3) + 1;
        System.out.println("My random car is: " + randomCar);

        switch (randomCar) {
            case 1:
                return new BMW();
            case 2:
                return new Toyota();
            case 3:
                return new Ford();
        }
        return null;
    }
}
