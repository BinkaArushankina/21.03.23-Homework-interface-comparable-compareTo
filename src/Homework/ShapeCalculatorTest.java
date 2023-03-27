package Homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import java.util.*;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapeCalculatorTest {
    ShapeCalculator shapeCalculator;
    Area rectangle=new Rectangle("Rectangle",5,10);
    Area square=new Square("Square",7);
    Area circle=new Circle("Circle",10);
    Area[] shapes={circle,rectangle,square};
    List<Area> shapeList=Arrays.asList(shapes);  //schtobi ne propisiwatj sanowo List erenimaem dannie is massiwa w list  Arrays.asList;

    @BeforeEach
    void  init(){
        shapeCalculator=new ShapeCalculator();

    }
    @Test
    public void test_sorted(){
        Area[]expected ={square,rectangle,circle} ;
        List<Area> expectedList= Arrays.asList(expected);

        Arrays.sort(shapes);
        Collections.sort(shapeList);

        assertArrayEquals(expected,shapes);
        assertEquals(expectedList,shapeList);
    }
    @Test
    public void  test_sorted_one(){
        Area[]expected= {circle};
        Area[]actual= {circle};
        Arrays.sort(actual);

        assertArrayEquals(expected,actual);
    }

    @Test
    public void test_two_shapes(){
        Area[]shapes={new Circle("Circle",10),new Rectangle("Rectangle",5,10)};
        assertEquals(364,shapeCalculator.totalSquare(shapes));

    }
    @Test
    public void test_one_shape(){
        Area[] shapes = {new Rectangle("Rectangle",5,10)};
        assertEquals(50,shapeCalculator.totalSquare(shapes));
    }
    @Test
    public void test_zero_shape(){
        Area [] shapes = {};
        assertEquals(0,shapeCalculator.totalSquare(shapes));
    }



}
