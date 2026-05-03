package com.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        calculator_class calculator = new calculator_class();
        System.out.println(" ----------- Welcome To Calculator Program -----------");
        System.out.println("\n"); 
        UI_Get_Calculation(calculator);

    }

    private static void UI_Get_Calculation(calculator_class calculator) { 
        double result = 0.99;
        Scanner user_input_scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = user_input_scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = user_input_scanner.nextDouble();
        System.out.println("What Calculation You Want To Do? ('+' '-' '*' '/')");
        char operation = user_input_scanner.next().charAt(0);

        switch(operation){
            case '+':
                result = calculator.addition(num1, num2);
                UI_Output(num1, operation, num2, result);
                break;
            case '-':
                result = calculator.subtraction(num1, num2);
                UI_Output(num1, operation, num2, result);
                break;
            case '*':
                result = calculator.multiplication(num1, num2);
                UI_Output(num1, operation, num2, result);
                break;
            case '/':
                result = calculator.division(num1, num2);
                UI_Output(num1, operation, num2, result);
                break;
            default:                
                System.out.println("Invalid Operation");
        }

        
    }

    private static void UI_Output(double num1, char operation, double num2, double result) {
        System.out.println(num1 + " " + operation +  " " + num2 + " = " + result);
        System.out.println("Result = " + result); 
    }

    public static void Ui_Continue_Query(){
        Scanner user_input_for_continuation = new Scanner(System.in);
        System.out.println("Do You Want To Continue? (Y/N)");
        char user_response = user_input_for_continuation.next().charAt(0);
       if(user_response == 'Y' || user_response == 'y'){
            System.out.println("\n\n");
            System.out.println(" ----------- Carrying On Calculator Program -----------");
            UI_Get_Calculation(calculator);

       } 
    }
    

}