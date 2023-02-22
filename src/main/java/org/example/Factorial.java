package org.example;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int n = Integer.parseInt(str);
        if (n <= 20) {
            System.out.println(factorialRecursive(n));
        } else {
            System.out.println("Sosi bibu");
        }
    }

    private static int factorial(int n) {
        int fct = 1;
        for (int i = 1; i <= n; i++) {
            fct *= i;
        }
        return fct;
    }

    private static int factorialRecursive(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }
}
