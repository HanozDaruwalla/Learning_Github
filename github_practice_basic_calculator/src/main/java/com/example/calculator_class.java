package com.example;

public class calculator_class {    
    
    public static double addition(double a, double b) {
    // Check for overflow FIRST
    if ((b > 0 && a > Double.MAX_VALUE - b) || 
        (b < 0 && a < -Double.MAX_VALUE - b)) {
        throw new ArithmeticException("Double overflow");
    }
    return a + b;  // No try-catch needed
}

    public static double subtraction(double a, double b) {
        return a - b;
    }

    public static double multiplication(double a, double b) {
        return a * b;   
    }

    public static double division(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
        //change later
    }
    
}
