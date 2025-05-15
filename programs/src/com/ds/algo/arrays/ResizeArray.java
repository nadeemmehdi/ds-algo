package com.ds.algo.arrays;

import com.ds.algo.utils.PrintArray;

public class ResizeArray {

    public static void main(String[] args) {

        ResizeArray resizeArray = new ResizeArray();
        int[] array = {2, 3, 4, 5, 6};
        PrintArray.printIntArray(array, "Before: ");
        int[] resizedArray = resizeArray.resizeArray(array, array.length * 2);
        PrintArray.printIntArray(resizedArray, "After: ");
    }

    private int[] resizeArray(int[] array, int capacity) {

        int[] temp = new int[capacity];

        for(int i=0; i<array.length; i++) {
            temp[i] = array[i];
        }

        return temp;
    }
}
