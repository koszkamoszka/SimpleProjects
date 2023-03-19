package org.example.sorting;

public class InsertionSorter implements Sorter {
    @Override
    // 7 3 3 9 15 22 63 2 3
    public void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++){
            int j = i + 1;
            while (j != 0 && array[j - 1] > array[j]) {
                int tmp = array[j];
                array[j] = array[j - 1];
                array[j - 1] = tmp;
                j--;
            }
        }
    }
}
