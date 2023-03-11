package org.example.calculators;

import java.util.Scanner;

// input: 3+7*4/8-1
// output: 4
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(calculate(str));
    }

    public static int calculate(String expression) {
        int solution = Integer.parseInt(String.valueOf(expression.charAt(0)));
        for (int i = 1; i < expression.length(); i++) {
            if (i % 2 == 1) {
                switch (expression.charAt(i)) {
                    case '+' -> solution += expression.charAt(i + 1);
                    case '-' -> solution -= expression.charAt(i + 1);
                    case '*' -> solution *= expression.charAt(i + 1);
                    case '/' -> solution /= expression.charAt(i + 1);
                }
            }
        }
        return solution;
    }
}


