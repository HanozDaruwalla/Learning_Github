import org.junit.jupiter.api.Test;

import com.example.calculator_class;

import static org.junit.jupiter.api.Assertions.*;

public class calculatorTest{

    @Test
    void testAddition(){
        assertEquals (12, calculator_class.addition(4,8));
        assertEquals (3, calculator_class.addition(-1, 4));
        assertEquals (5, calculator_class.addition(0,5));
        assertEquals (-3, calculator_class.addition(-1,-2));
        assertEquals (10, calculator_class.addition(10,0));
        assertEquals (Double.MAX_VALUE, calculator_class.addition(Double.MAX_VALUE, 0));
        assertEquals (Double.MIN_VALUE, calculator_class.addition(Double.MIN_VALUE,0));
    }

    // -Double.MAX_VALUE = most min value
    @Test
    void subtraction(){
        assertEquals(7, calculator_class.subtraction(10,3));
        assertEquals(50, calculator_class.subtraction(50,0));
        assertEquals(25, calculator_class.subtraction(35,10));
        assertEquals(-2, calculator_class.subtraction(-5,-3));
        assertEquals(-Double.MAX_VALUE, calculator_class.subtraction(-Double.MAX_VALUE,0));
        assertEquals(-Double.MAX_VALUE, calculator_class.subtraction((-Double.MAX_VALUE +1),1));
    }

    @Test
    void multiplication(){
        assertEquals(20,calculator_class.multiplication(10,2));
        assertEquals(-6,calculator_class.multiplication(-2,3));
        assertEquals(10, calculator_class.multiplication(10,1));
        assertEquals(-Double.MAX_VALUE, calculator_class.multiplication(-Double.MAX_VALUE,1));
        assertEquals(Double.MAX_VALUE, calculator_class.multiplication(Double.MAX_VALUE,1));
        assertEquals(48, calculator_class.multiplication(6,8));
    }
}