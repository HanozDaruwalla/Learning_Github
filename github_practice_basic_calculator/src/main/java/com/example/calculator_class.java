package com.example;

public class calculator_class { 

    private double previous_answer;
    private double result;

    public calculator_class(){
        this.previous_answer = 0; // Default value for previous_answer
        this.result = 0; // Default value for result
    }
    public double addition(double a, double b) {

    // Check for overflow FIRST
        if ((b > 0 && a > Double.MAX_VALUE - b) || 
            (b < 0 && a < -Double.MAX_VALUE - b)) {
            throw new ArithmeticException("Double overflow");
        }
     // Store the result in the instance variable

    this.result = a + b; // Store the result in result
    this.previous_answer = result; // Store the result in previous_answer
    return result;  // No try-catch needed
    }

    public double subtraction(double a, double b) {
        this.result = a - b; // Store the result in result
        this.previous_answer = result; // Store the result in previous_answer
        return result;
    }

    public double multiplication(double a, double b) {
        this.result = a * b; // Store the result in result
        this.previous_answer = result; // Store the result in previous_answer
        return result;
    }
        

    public double division(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }else{
            this.result = a / b;
            this.previous_answer = result;
        } // Store the result in previous_answer
        return result;
        
    }

    private boolean In_Boundries(double a, double b){
        if ((b > 0 && a > Double.MAX_VALUE - b) || 
            (b < 0 && a < -Double.MAX_VALUE - b)) {
                Throw_If_Out_Of_Boundries();
                return false;
        }
        return true;
    }

    public void Throw_If_Out_Of_Boundries(){
        throw new ArithmeticException("Double overflow");
    }



    public double getPrevious_answer() {
        return this.previous_answer;
    }

    public void setPrevious_answer(double previous_answer) {
        this.previous_answer = previous_answer;
    }

    public double getResult() {
        return this.result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public void resetCalculator() {
        this.previous_answer = 0;
        this.result = 0;
    }    
}
