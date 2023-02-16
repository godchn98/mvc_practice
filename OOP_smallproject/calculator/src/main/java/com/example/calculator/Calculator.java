package com.example.calculator;

public class Calculator {
    public static int calculate(int opperand1, String operator, int opperand2) {
        int result = 0;        
        if(operator=="+" || operator=="-" ||operator=="*" ||operator=="/" ) {
        switch (operator) {
            case "+": result =  opperand1 + opperand2; break;
            case "-": result = opperand1 - opperand2; break;
            case "*": result = opperand1 * opperand2; break;
            case "/": result = opperand1 / opperand2; break;
        }}
        else {throw new IllegalArgumentException("not a correct operator");}
        
        return result;
    }
}
