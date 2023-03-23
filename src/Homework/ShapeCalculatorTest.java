package Homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapeCalculatorTest {
    ShapeCalculator shapeCalculator;

    @BeforeEach
    void  setUp(){
        shapeCalculator=new ShapeCalculator();
    }
    @Test
    @DisplayName("find the totalSquare of all figures")
    void totalSquareTest(){
        assertEquals(153.5,shapeCalculator.totalSquare(78.5,50.0,
                                                                         25.0),"78,5+50+25 should be 153,5");
    }                                                                       //Tests passed:1
}
