package Homework;

public class Area implements Comparable<Area>{

    private String displayName;


    public Area(String displayName) {
        this.displayName = displayName;
    }

    public double getArea(){
        return 0;
    }

    public String getDisplayName(){
        return displayName;
   }



    //Dopolnitelnoe domaschnee sadanie po usche gotowoj sadatsche
    //Homework 21.03.23
    //В задаче из урока 40 вывести на печать массив, отсортированный по возрастанию площади фигур.

    public int compareTo(Area a){
        return Integer.compare((int) getArea(), (int) a.getArea());
    }

    public String toString() {
        return  displayName;
    }



}
