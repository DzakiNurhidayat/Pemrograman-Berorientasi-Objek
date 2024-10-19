package com;

public class Cylinder extends Shape {
    private double radius;
    private double height;

    public Cylinder(double r, double t) {
        super("Cylinder");
        radius = r;
        height = t;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius * height;
    }

    @Override
    public String toString() {
        return super.toString() + " of radius " + radius + " and height " + height;
    }
}
