package com.example;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

      //String Vals for testing purposes
        static String Success_String = "Success";
        static String Failure_String = "Failure";
        static String Invalid_String = "Invalid";

    public static void main(String[] args) {
        calculator_class calculator = new calculator_class();
        System.out.println(" ----------- Welcome To Calculator Program -----------");
        System.out.println("\n"); 
        UI_Get_Calculation_Numbers(calculator);

    }

    private static void UI_Get_Calculation_Numbers(calculator_class calculator) { 
        double num1 = 0;
        double num2 = 0;
        Scanner user_input_scanner = new Scanner(System.in);
        boolean valid_input = false;
        ArrayList<String> Temp_Num_And_If_Valid_RETURNED = new ArrayList<String>();
        

        
        //gets num 1 and checks if valid input
        while(valid_input == false){ 
            System.out.print("Enter First number (or 'Answer' for previous answer): ");
            Temp_Num_And_If_Valid_RETURNED = UI_Get_Numbers(calculator, user_input_scanner);
            
            //gets number for calc later
            num1 = Double.parseDouble(Temp_Num_And_If_Valid_RETURNED.get(0));
            
            //checks if valid input
            valid_input = Boolean.parseBoolean(Temp_Num_And_If_Valid_RETURNED.get(1));
        }

        valid_input = false; //resets valid input for second number input cycle


        //gets num 2 and checks if valid input
        while(valid_input == false){ 
            System.out.print("Enter Second number (or 'Answer' for previous answer): ");
            Temp_Num_And_If_Valid_RETURNED = UI_Get_Numbers(calculator, user_input_scanner);
            System.out.print("\n");

            //gets number for calc later
            num2 = Double.parseDouble(Temp_Num_And_If_Valid_RETURNED.get(0));
            
            //checks if valid input
            valid_input = Boolean.parseBoolean(Temp_Num_And_If_Valid_RETURNED.get(1));
        }

        valid_input = false; //resets valid input for second number input cycle
    
        
        while(valid_input == false){
            UI_Get_Operation_And_Calculate(num1, num2, calculator, user_input_scanner);
        }
    }

    private static boolean UI_Get_Operation_And_Calculate(double num1, double num2,calculator_class calculator, Scanner user_input_scanner) {

        double result = 0.99;

        System.out.println("\n What Calculation You Want To Do? ('+' '-' '*' '/')");
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
                
                try{
                    result = calculator.division(num1, num2);
                    UI_Output(num1, operation, num2, result, calculator);
                }catch(IllegalArgumentException e){
                    System.out.println("Cannot Divide By Zero, Please Try Again");
                    System.out.println("\n");
                    UI_Get_Operation_And_Calculate(num1, num2, calculator, user_input_scanner);
                }
                break;

            default:                
                System.out.println("Invalid Operation");
                System.out.println("\n\n\n");
                System.out.println("num1 = " + num1);
                System.out.println("num2 = " + num2 +"\n");
                return false;

        }
        return true;
    }

        
    

    private static ArrayList<String> UI_Get_Numbers(calculator_class calculator, Scanner user_input_scanner) {
        double temp_number = 0.00;
        String user_input_string = "Undefined";
        Boolean valid_input = false;
        ArrayList<String> Temp_Num_AND_If_Valid_Input = new ArrayList<String>();
            

        //     ----------------------  Is the user input a number?  ----------------------  
        try{
            temp_number = user_input_scanner.nextDouble();
            valid_input = true;
        
        }catch(InputMismatchException e){ // --------- if not number, check if input = answer -----------

            //next gets what was last written
            user_input_string = user_input_scanner.next();

            //get previous answer if user input = answer
            if(user_input_string.equals("Answer") || user_input_string.equals("answer")){
                temp_number = calculator.getPrevious_answer();
                System.out.println("Ans (" + temp_number + ")");
                valid_input = true;

            }else{//invalidd input. redo
                System.out.println("Invalid Input, Please Try Again");
                valid_input = false;
                //the calling will redo the cycle if valid input is false, so no need to redo here      
            }

            
            //reset scanner buffer to prevent infinite loop if user input is not a number or "Answer"
            user_input_scanner.nextLine();
        }
        //put data in arraylist for return
        Temp_Num_AND_If_Valid_Input.add(String.valueOf(temp_number));
        Temp_Num_AND_If_Valid_Input.add(String.valueOf(valid_input));

        return Temp_Num_AND_If_Valid_Input;

    }

    //output calculation and result, then ask if user wants to continue
    private static void UI_Output(double num1, char operation, double num2, double result, calculator_class calculator) {
        System.out.println("\n\n" +  num1 + " " + operation +  " " + num2 + " = " + result);
        System.out.println("Result = " + result); 
        Ui_Continue_Query(calculator);
    }


    public static void Ui_Continue_Query(calculator_class calculator){
        Scanner user_input_for_continuation = new Scanner(System.in);

        // -----------------------  Ask User If They Want To Continue  ----------------------
        System.out.println("\n");
        System.out.println("Do You Want To Continue? (Y/N)");
        char user_response = user_input_for_continuation.next().charAt(0);
        user_input_for_continuation.nextLine(); //resets scanner      

        if(user_response == 'Y' || user_response == 'y'){
            System.out.println("\n\n");
            System.out.println(" ----------- Carrying On Calculator Program -----------");
            UI_Get_Calculation_Numbers(calculator);
           
       }else if(user_response == 'N' || user_response == 'n'){
            System.out.println("\n\n");
            System.out.println(" ----------- Ending Calculator Program -----------");
         
            //           -----------------------  Invalid Input ----------------------
        }else{
            System.out.println("Invalid Input, Please Try Again");
            Ui_Continue_Query(calculator);
        }
    } 
    

}