package com.company;

public class Point {
    private int x;
    private int y;

    public Point () {

    }
    public Point (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance () {
        double distanceFromZero = Math.sqrt(x*x +y*y);
        return distanceFromZero;
    }

    public double distance (int a, int b) {
        double distanceFromAAndB = Math.sqrt((a - x) * (a - x) + (b - y) * (b - y));
        return distanceFromAAndB;
    }

    public double distance (Point point) {
        double distanceFromPointToPoint = Math.sqrt((point.getX() - x) * (point.getX() - x) + (point.getY() - y) * (point.getY() - y));
        return distanceFromPointToPoint;
    }
}
