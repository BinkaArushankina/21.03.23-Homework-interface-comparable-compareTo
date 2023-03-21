package Homework;

public class Square extends Area{

    private double a;


    public Square(String displayName, int a) {
        super(displayName);
        this.a=a;
    }


    public double getArea() {
        return a*a;
    }


}
