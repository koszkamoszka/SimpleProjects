package org.example.sorting;

public class QuickSorter implements Sorter {
    @Override
    public int[] sort(int[] array) {
        return sort(array, 0, array.length - 1);
    }

    public int[] sort(int[] array, int leftIndex, int rightIndex) {
        if (rightIndex - leftIndex < 2) {
            return array;
        }
        int index1 = leftIndex;
        int index2 = rightIndex - 1;
        int pivot = array[rightIndex];
        while (index1 < index2) {
            if (array[index1] > pivot && array[index2] < pivot) {
                int swap = array[index1];
                array[index1] = array[index2];
                array[index2] = swap;
            }
            if (array[index2] >= pivot) {
                index2--;
            }
            if (array[index1] <= pivot) {
                index1++;
            }
        }
        int pivotNewIndex;
        if (array[index2] > pivot) {
            array[rightIndex] = array[index2];
            array[index2] = pivot;
            pivotNewIndex = index2;
        }
        else {
            array[rightIndex] = array[index2 + 1];
            array[index2 + 1] = pivot;
            pivotNewIndex = index2 + 1;
        }
        sort(array, leftIndex, pivotNewIndex - 1);
        sort(array, pivotNewIndex + 1, rightIndex);
        return array;
    }
}
