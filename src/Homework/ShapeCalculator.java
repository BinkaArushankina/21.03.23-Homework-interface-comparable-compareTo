package Homework;

public class ShapeCalculator  {

    public double totalSquare(Area[] shapes){
        double res=0;
        for(Area a: shapes){
            res+=a.getArea();
        }
       return res;
    }


}
