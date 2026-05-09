package com.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;



public class calculatorInputTest {
    
    @Test
    void UI_Get_Numbers_Test() {
        calculator_class calculator = new calculator_class();
        calculator.setPrevious_answer(10011);

        assertEquals(25, 25);
        assertEquals(-100, -100);

        assertEquals("Answer", calculator.getPrevious_answer()); 
        assertEquals("answer", calculator.getPrevious_answer());
        assertEquals(Double.MAX_VALUE, Double.MAX_VALUE);
        assertEquals(-Double.MIN_VALUE, -Double.MIN_VALUE);




    }
}
