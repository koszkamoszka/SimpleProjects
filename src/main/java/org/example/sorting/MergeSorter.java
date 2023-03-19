package org.example.sorting;

public class MergeSorter implements Sorter {
    @Override
    public int[] sort(int[] array) {
        return sort(array, 0, array.length - 1);
    }

    public int[] sort(int[] array, int leftIndex, int rightIndex) {
        if (leftIndex == rightIndex) {
            return new int[] { array[leftIndex] };
        }
        int[] leftSorted = sort(array, leftIndex, (rightIndex + leftIndex) / 2);
        int[] rightSorted = sort(array, ((rightIndex + leftIndex) / 2 + 1), rightIndex);
        return merge(leftSorted, rightSorted);
    }

    private int[] merge(int[] array1, int[] array2) {
        int[] mergedArray = new int[array1.length + array2.length];
        int index1 = 0;
        int index2 = 0;
        while (index1 != array1.length && index2 != array2.length ) {
            if (array1[index1] > array2[index2]) {
                mergedArray[index1 + index2] = array2[index2];
                index2++;
            }
            else {
                mergedArray[index1 + index2] = array1[index1];
                index1++;
            }
        }
        for (int i = index1; i < array1.length; i++) {
            mergedArray[index1 + index2] = array1[i];
        }
        for (int i = index2; i < array2.length; i++) {
            mergedArray[index1 + index2] = array2[i];
        }
        return mergedArray;
    }
}
