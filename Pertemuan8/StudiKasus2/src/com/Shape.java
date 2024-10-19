package com;

public abstract class Shape {
    private String shapeName;

    public Shape() {
        this.shapeName = "";
    }

    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    public String getShapeName() {
        return this.shapeName;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }

    public abstract double area();

    public String toString() {
        return getShapeName();
    }
}
