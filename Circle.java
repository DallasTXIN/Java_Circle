//Dallas Lawson
//Prof. Bowman
//SDEV200-1AH
//Chaper 13, Exercise 13.9: Enable Circle Comparable

import ToolKit.GeometricObject;

public class Circle {
    public static void main(String[] args) {
        Circle c1 = new Circle(10);
        Circle c2 = new Circle(10);
        System.out.println("Does the first circle equal the second circle? " + c1.equals(c2));
    }
}

class Circle extends GeometricObject {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius,
                  String color, boolean filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Circle && radius == ((Circle) obj).radius;
    }

    public void printCircle() {
        System.out.println("The circle is created " + getDateCreated() +
                " and the radius is " + radius);
    }
}