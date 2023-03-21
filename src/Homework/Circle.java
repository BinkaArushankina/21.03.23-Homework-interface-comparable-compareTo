package Homework;

public class Circle extends Area{

    private static double PI = 3.14;
    private double radius;

    public Circle(String displayName, double radius) {
        super(displayName);
        this.radius=radius;
    }

    public double getArea() {
        return PI*radius*radius;
    }


}
