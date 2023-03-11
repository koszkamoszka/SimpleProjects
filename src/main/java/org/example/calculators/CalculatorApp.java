package org.example.calculators;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StackCalculator stackCalculator = new StackCalculator();
        System.out.println(stackCalculator.calculate(str));
    }
}
