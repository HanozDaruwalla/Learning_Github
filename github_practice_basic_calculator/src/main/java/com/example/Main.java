package com.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double result = 0.99;

        Scanner user_input_scanner = new Scanner(System.in);
        System.out.println(" ----------- Welcome To Calculator Program -----------");
        System.out.print("Enter first number: ");
        double num1 = user_input_scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = user_input_scanner.nextDouble();
        System.out.println("What Calculation You Want To Do? ('+' '-' '*' '/')");
        char operation = user_input_scanner.next().charAt(0);

        switch(operation){
            case '+':
                result = addition(num1, num2);
                break;
            case '-':
                result = subtraction(num1, num2);
                break;
            case '*':
                result = multiplication(num1,num2);
                break;
            case '/':
                result = division(num1, num2);
                break;
            default:                
                System.out.println("Invalid Operation");
        }

        System.out.println(num1 + " " + operation +  " " + num2 + " =" + result);
        System.out.println(" Result = " + result);  
    }
    
    private static double addition(double a, double b) {
        return a + b;
    }

    private static double subtraction(double a, double b) {
        return a + b;
        //change later
    }

    private static double multiplication(double a, double b) {
        return a + b;
        //change later    
    }

    private static double division(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a + b;
        //change later
    }
}