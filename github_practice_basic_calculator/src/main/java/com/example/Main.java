package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    
    private static double addition(double a, double b) {
        return a + b;
    }

    private static double subtraction(double a, double b) {
        return a + b;
    }

    private static double multiplication(double a, double b) {
        return a + b;
    }

    private static double division(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a + b;
    }
}