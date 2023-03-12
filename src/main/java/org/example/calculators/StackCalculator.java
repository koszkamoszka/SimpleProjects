package org.example.calculators;

import java.util.Stack;


public class StackCalculator {
    private static final int UNDEFINED = -1;

    private final Stack<Operator> operatorStack;
    private final Stack<Double> valueStack;

    public StackCalculator() {
        operatorStack = new Stack<>();
        valueStack = new Stack<>();
    }

    public double calculate(String expression) {
        int currentNumber = UNDEFINED;
        for (char symbol : expression.toCharArray()) {
            if (Character.isDigit(symbol)) {
                if (currentNumber == UNDEFINED) {
                    currentNumber = 0;
                }
                currentNumber = currentNumber * 10 + Integer.parseInt(String.valueOf(symbol));
                continue;
            }
            Operator operator = Operator.fromSymbol(symbol);
            if (currentNumber != UNDEFINED) {
                valueStack.push((double) currentNumber);
                currentNumber = UNDEFINED;
            }
            if (symbol == '(') {
                operatorStack.push(operator);
            } else if (symbol == ')') {
                do {
                    performLastOperation();
                } while (!operatorStack.peek().equals(Operator.LEFT_PARENTHESIS));
                operatorStack.pop();
            } else {
                if (!operatorStack.empty() && !operatorStack.peek().equals(Operator.LEFT_PARENTHESIS)) {
                    performLastOperation();
                }
                operatorStack.push(operator);
            }
        }
        while (!operatorStack.empty()) {
            performLastOperation();
        }

        return valueStack.pop();
    }

    private void performLastOperation() {
        double rightOperand = valueStack.pop();
        double leftOperand = valueStack.pop();
        Operator prevOperator = operatorStack.pop();
        valueStack.push(performOperation(prevOperator, leftOperand, rightOperand));
    }

    private double performOperation(Operator operation, double leftOperand, double rightOperand) {
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
            default -> {
                return 0;
            }
        }
    }
}
