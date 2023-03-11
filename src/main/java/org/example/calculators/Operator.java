package org.example.calculators;

public enum Operator {
    ADDITION(1, '+'),
    SUBTRACTION(1, '-'),
    MULTIPLICATION(2, '*'),
    DIVISION(2, '/'),
    LEFT_PARENTHESIS(0, '('),
    RIGHT_PARENTHESIS(0, ')');

    private final int precedence;
    private final char symbol;

    Operator(int precedence, char symbol) {
        this.precedence = precedence;
        this.symbol = symbol;
    }

    public int getPrecedence() {
        return precedence;
    }

    public char getSymbol() {
        return symbol;
    }

    public static Operator fromSymbol(char symbol) {
        for (Operator operator : Operator.values()) {
            if (operator.getSymbol() == symbol) {
                return operator;
            }
        }
        throw new IllegalArgumentException();
    }
}
