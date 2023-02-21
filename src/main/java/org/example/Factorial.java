package org.example;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int n = Integer.parseInt(str), fct = 1;
        if (n <= 20) {
            for (int i = 1; i <= n; i++) {
                fct = fct * i;
            }
            System.out.println(fct);
        } else {
            System.out.println("Sosi bibu");
        }
    }
}
