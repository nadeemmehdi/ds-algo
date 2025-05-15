package com.ds.algo.arrays;

import com.ds.algo.utils.PrintArray;

public class MoveZeroToEnd {

    public static void main(String[] args) {

        MoveZeroToEnd moveZeroToEnd = new MoveZeroToEnd();

        int[] array = {8, 1, 0, 2, 1, 0, 3};

        PrintArray.printIntArray(array, "Before: ");

        array = moveZeroToEnd.moveZeroToEnd(array);

        PrintArray.printIntArray(array,"After: ");
    }

    private int[] moveZeroToEnd(int[] array) {

        /** Logic:
         *  j tracks all zero(0) elements;
         *  i tracks all non-zero(0) elements;
         *  if i element not zero and j element is zero, then swap
         *  if j is not zero and increment
         *  */

        int n = array.length;
        int j = 0;

        for(int i=0; i<n; i++) {

            if(array[i] != 0 && array[j] == 0) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }

            if(array[j] != 0) {
                j++;
            }
        }

        return array;
    }
}
