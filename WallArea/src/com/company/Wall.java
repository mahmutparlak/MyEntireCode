package com.company;

public class Wall {

    private double width;
    private double height;

    public Wall () {
    }

    public Wall (double width, double height) {
        this.setHeight(height);
        this.setWidth(width);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
        if(this.width < 0) {
            this.width = 0;
        }
    }

    public void setHeight(double height) {
        this.height = height;
        if (this.height < 0) {
            this.height = 0;
        }
    }

    public double getArea () {
        double getArea = width * height;
        return getArea;
    }
}
