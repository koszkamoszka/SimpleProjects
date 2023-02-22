package org.example;

import java.util.Scanner;

public class mediumCalculator {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(calculate(str));
    }

    public static int calculate(String expression) {
        int solution = 0;
        char operation = '+';
        int currentNumber = 0;
        for (char symbol : expression.toCharArray()) {
            if (Character.isDigit(symbol)) {
                currentNumber = currentNumber * 10 + Integer.parseInt(String.valueOf(symbol));
            } else {
                solution = performOperation(operation, solution, currentNumber);
                operation = symbol;
                currentNumber = 0;
            }
        }

        return performOperation(operation, solution, currentNumber);
    }

    public static int performOperation(char operation, int solution, int currentNumber) {
        switch (operation) {
            case '+' -> solution += currentNumber;
            case '-' -> solution -= currentNumber;
            case '*' -> solution *= currentNumber;
            case '/' -> solution /= currentNumber;
        }
        return solution;
    }

}
