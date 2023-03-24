package Homework;

import java.util.Arrays;

public class Homework {
    //В задаче из урока 40 вывести на печать массив ,отсортированный по возрастанию площади фигур.
    //
    //Задача была такая:
    //
    //Создать классы, содержащие методы для подсчета площади прямоугольника, квадрата, круга:
    // Создать классы Circle, Rectangle, Square. В классах должен быть метод getArea, осуществляющий подсчет
    // соответствующей площади В методе main класса Main создать массив или лист содержащий обьекты этих классов
    // и вывести на экран площади фигур, содержащиеся в этом массиве а также название фигуры.
    // Подумать, должны ли быть созданы для выполнения задачи еще какие-то классы/класс и поля в классе/классах

    public static void main(String[] args) {
        //Homework
        //Создать классы, содержащие методы для подсчета площади прямоугольника, квадрата, круга:
        //Создать классы Circle, Rectangle, Square.
        //В классах должен быть метод getArea, осуществляющий подсчет соответствующей площади
        //В методе main класса Main создать массив или лист содержащий обьекты этих классов и вывести на экран площади фигур,
        //содержащиеся в этом массиве а также название фигуры.
        //Подумать, должны ли быть созданы для выполнения задачи еще какие-то классы/класс и поля в классе/классах

        //Пример вывода на печать:
        //Circle has area of 200
        //Rectangle has area of 50.0
        //Square has area of 30.0


        Area square = new Square("Square",5);
        Area rectangle = new Rectangle("Rectangle",5,10);
        Area circle = new Circle("Circle",5);


        Area[] areas = {square,circle,rectangle};
        for(Area a:areas){
            System.out.println(a.getDisplayName()+" has area of "+a.getArea());
            System.out.println();
        }
        //Square - 25
        //
        //Circle - 78.53981633974483
        //
        //Rectangle - 50




        //SORTING
        //Dopolnitelnoe domaschnee sadanie po usche gotowoj sadatsche
        //Homework 21.03.23
        //В задаче из урока 40 вывести на печать массив, отсортированный по возрастанию площади фигур.


        Arrays.sort(areas);
        System.out.println(Arrays.toString(areas));   //[Square25.0, Rectangle50.0, Circle78.5]



        //array                  Arrays.sort(name);         sout(Arrays.toString(name));
        //list                   Collections.sort(name);    sout(name);
        //treeSet and hashSet                               sout(name);




        //TESTING
        //Escho Dopolnitelnoe domaschnee sadanie po usche gotowoj sadatsche
        /*
В задаче из прошлого дз про интерфейс Shape добавить метод, позволяющий высчитывать общую площадь
разных фигур totalSquare(). Пример: площадь прямоугольника 100, площад круга 50, общая площадь 150
Написать этот метод в классе ShapeCalculator
Протестировать этот метод с помощью JUnit
     */



    }
}
