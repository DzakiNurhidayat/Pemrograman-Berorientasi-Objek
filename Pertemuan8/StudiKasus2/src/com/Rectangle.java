package com;

public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle(double p, double l) {
        super("Rectangle");
        width = p;
        length = l;
    }

    @Override
    public double area() {
        return width * length;
    }

    @Override
    public String toString() {
        return super.toString() + " of width " + width + " and length " + length;
    }
}
