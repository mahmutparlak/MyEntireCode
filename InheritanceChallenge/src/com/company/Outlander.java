package com.company;

public class Outlander extends Car {
    private int roadServiceMonth;

    public Outlander(String name, String size, int currentVelocity, int currentDirection, int wheels, int doors, int gears, boolean isManual, int roadServiceMonth) {
        super(name, size, currentVelocity, currentDirection, wheels, doors, gears, isManual);
        this.roadServiceMonth = roadServiceMonth;
    }

    public void accelerate (int rate) {
        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity == 0) {
            stop();
            changeGear(1);
        } else if (newVelocity > 0 && newVelocity < 10) {
            changeGear(1);
        } else if (newVelocity > 10 && newVelocity < 20) {
            changeGear(2);
        } else if (newVelocity > 20 && newVelocity < 30) {
            changeGear(3);
        } else {
            changeGear(4);
        }

        if (newVelocity > 0) {
            changeVelocity(newVelocity, getCurrentVelocity());
        }
    }
}
