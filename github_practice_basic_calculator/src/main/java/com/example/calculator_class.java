package com.example;

public class calculator_class {


    public static double addition(double a, double b) {
        return a - b;
    }

    public static double subtraction(double a, double b) {
        return a + b;
        //change later
    }

    public static double multiplication(double a, double b) {
        return a + b;
        //change later    
    }

    public static double division(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a + b;
        //change later
    }
    
}
