package org.example.sorting;

public class BubbleSorter implements Sorter {

    @Override
    public void sort(int[] array) {
        for (int k = 0; k < array.length; k++) {
            boolean isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i + 1] < array[i]) {
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }
        }
    }
}
