package Homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapeCalculatorTest {
    ShapeCalculator shapeCalculator;

    @BeforeEach
    void  init(){
        shapeCalculator=new ShapeCalculator();
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
