package com.example;

public class calculator_class { 

    private double previous_answer;

    public calculator_class(){
        this.previous_answer = 0; // Default value for previous_answer
        
    }
    public double addition(double a, double b) {
    // Check for overflow FIRST
    if ((b > 0 && a > Double.MAX_VALUE - b) || 
        (b < 0 && a < -Double.MAX_VALUE - b)) {
        throw new ArithmeticException("Double overflow");
    }else{
        this.previous_answer = a + b; // Store the result in previous_answer
    }
    return a + b;  // No try-catch needed
}

    public double subtraction(double a, double b) {
        return a - b;
    }

    public double multiplication(double a, double b) {
        this.previous_answer = a * b; // Store the result in previous_answer
        return a * b;
    }
        

    public double division(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }else{
            this.previous_answer = a * b;
        } // Store the result in previous_answer
        return a / b;
        //change later
    }

    public double getPrevious_answer() {
        return this.previous_answer;
    }

    public void setPrevious_answer(double previous_answer) {
        this.previous_answer = previous_answer;
    }
    
}
