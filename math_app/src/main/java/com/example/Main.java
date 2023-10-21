package com.example;

import com.example.calculator.Calculator;
import com.example.calculator.Operations;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        double a = 5;
        double b = 2;
        
        System.out.println("Result of addition: " + calc.add(a, b));
        System.out.println("Result of subtraction: " + calc.subtract(a, b));
        System.out.println("Result of multiplication: " + calc.multiply(a, b));
        System.out.println("Result of division: " + calc.divide(a, b));
    }
}
