package Homework;

public abstract class  Area implements Comparable<Area>{

    private String displayName;


    public Area(String displayName) {
        this.displayName = displayName;
    }

    public abstract double getArea();

    public String getDisplayName(){
        return displayName;
   }



    //Dopolnitelnoe domaschnee sadanie po usche gotowoj sadatsche
    //Homework 21.03.23
    //В задаче из урока 40 вывести на печать массив, отсортированный по возрастанию площади фигур.

    public int compareTo(Area a){
        //return Double.compare( getArea(), a.getArea());// mogut bitj problemi
        if(getArea()-a.getArea()>0) {
            return 1;
        }else if (getArea()-a.getArea()<0) {
            return -1;
        }
        return 0;
    }

    public String toString() {
        return  displayName+getArea();
    }



}
