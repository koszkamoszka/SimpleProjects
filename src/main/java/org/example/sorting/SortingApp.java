package org.example.sorting;

import java.util.Scanner;

// 8
// 7 5 3 8 5 4 8 2
public class SortingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int n = Integer.parseInt(str);
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
//        BubbleSorter bubbleSorter = new BubbleSorter();
//        bubbleSorter.sort(array);
        InsertionSorter insertionSorter = new InsertionSorter();
        insertionSorter.sort(array);
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

    }

}
