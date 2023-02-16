package com.example.calculator;

import java.util.Arrays;

public enum ArithmaticCalculator {
    ADD("+"){
        @Override
        public int operandCalculate(int operand1, int operand2) {
            return operand1 + operand2;
        }
    },

    SUBTRACT("-") {
        @Override
        public int operandCalculate(int operand1, int operand2) {
            return operand1 - operand2;
        }
    },

    MULTIPLY("*") {
        @Override
        public int operandCalculate(int operand1, int operand2) {
            return operand1 * operand2;
        }
    },

    DIVIDE("/") {
        @Override
        public int operandCalculate(int operand1, int operand2) {
            return operand1 / operand2;
        }
    };

    private final String operator;

    ArithmaticCalculator(String operator) {
        this.operator = operator;
    }

    public abstract int operandCalculate(final int operand1, final int operand2);

    public static int calculate(int operand1, String operator, int operand2){
        ArithmaticCalculator arithmaticCalculator = Arrays.stream(values())
                .filter(v -> v.operator.equals(operator))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Not valid operator"));
        return arithmaticCalculator.operandCalculate(operand1, operand2);
    }


}
