package org.example.calculators;

import java.util.Stack;


public class StackCalculator {

    private Stack<Operator> operatorStack;
    private Stack<Double> valueStack;

    public StackCalculator() {
        operatorStack = new Stack<>();
        valueStack = new Stack<>();
    }

    public int calculate(String expression) {
        double solution = 0;
        int currentNumber = 0;
        for (char symbol : expression.toCharArray()) {
            if (Character.isDigit(symbol)) {
                currentNumber = currentNumber * 10 + Integer.parseInt(String.valueOf(symbol));
            } else {
                valueStack.push((double) currentNumber);
                if (!operatorStack.empty() && !operatorStack.peek().equals(Operator.LEFT_PARENTHESIS)) {

                }
                operatorStack.push(Operator.fromSymbol(symbol));
                solution = performOperation(solution, currentNumber);
                currentNumber = 0;
            }
        }

        return performOperation(solution, currentNumber);
    }

    public static int performOperation(Operator operation, int leftOperand, int rightOperand) {
        switch (operation) {
            case ADDITION -> {
                return leftOperand + rightOperand;
            }
            case SUBTRACTION -> {
                return leftOperand - rightOperand;
            }
            case MULTIPLICATION -> {
                return leftOperand * rightOperand;
            }
            case DIVISION -> {
                return leftOperand / rightOperand;
            }
        }
    }
}
