package com;

public class Circle extends Shape{
    private double radius;

    public Circle() {
        super();
        this.radius = 1.0;
    }

    public Circle(double radius, String color) {
        super(color, true);
        this.radius = radius;
    }


    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString();
    }
}
