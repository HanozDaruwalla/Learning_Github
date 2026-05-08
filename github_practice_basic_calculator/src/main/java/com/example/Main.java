package com.example;
import java.util.InputMismatchException;
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
        double num1 = 0;
        double num2 = 0;
        Scanner user_input_scanner = new Scanner(System.in);

        System.out.print("Enter First number (or 'Answer' for previous answer): ");
        
        num1 = UI_Get_Numbers(calculator, user_input_scanner);
              
        
        System.out.print("Enter Second number (or 'Answer' for previous answer): ");
        num2 = UI_Get_Numbers(calculator, user_input_scanner);
        


        System.out.println("What Calculation You Want To Do? ('+' '-' '*' '/')");
        char operation = user_input_scanner.next().charAt(0);

        switch(operation){
            case '+':
                result = calculator.addition(num1, num2);
                UI_Output(num1, operation, num2, result, calculator);
                break;
            case '-':
                result = calculator.subtraction(num1, num2);
                UI_Output(num1, operation, num2, result, calculator);
                break;
            case '*':
                result = calculator.multiplication(num1, num2);
                UI_Output(num1, operation, num2, result, calculator);
                break;
            case '/':
                result = calculator.division(num1, num2);
                UI_Output(num1, operation, num2, result, calculator);
                break;
            default:                
                System.out.println("Invalid Operation");
        }

        
    }

    private static double UI_Get_Numbers(calculator_class calculator, Scanner user_input_scanner) {
        double temp_number = 0.00;
        String user_input_string = "Undefined";
            
        try{
            temp_number = user_input_scanner.nextDouble();
            System.err.println("Temp Number set to: " + temp_number);
        }catch(InputMismatchException e){

            //next getsd what was last written
            user_input_string = user_input_scanner.next();

            if(user_input_string.equals("Answer") || user_input_string.equals("answer")){
                temp_number = calculator.getPrevious_answer();
                System.out.println("Ans (" + temp_number + ")");

            }else{
                System.out.println("Invalid Input, Please Try Again");
                //MAKE VALID REDO CYCLE !!!!!!!!!                
            }
            temp_number = calculator.getPrevious_answer();
            //reset scanner buffer to prevent infinite loop if user input is not a number or "Answer"
            user_input_scanner.nextLine();
        }
        return temp_number;

    }

    private static void UI_Output(double num1, char operation, double num2, double result, calculator_class calculator) {
        System.out.println(num1 + " " + operation +  " " + num2 + " = " + result);
        System.out.println("Result = " + result); 
        Ui_Continue_Query(calculator);
    }

    public static void Ui_Continue_Query(calculator_class calculator){
        Scanner user_input_for_continuation = new Scanner(System.in);
        System.out.println("Do You Want To Continue? (Y/N)");
        char user_response = user_input_for_continuation.next().charAt(0);
        user_input_for_continuation.nextLine(); //resets scanner       
        if(user_response == 'Y' || user_response == 'y'){
            System.out.println("\n\n");
            System.out.println(" ----------- Carrying On Calculator Program -----------");
            UI_Get_Calculation(calculator);

       }else if(user_response == 'N' || user_response == 'n'){
            System.out.println("\n\n");
            System.out.println(" ----------- Ending Calculator Program -----------");
        }else{
            System.out.println("Invalid Input, Please Try Again");
            Ui_Continue_Query(calculator);
        }
    }
    

}