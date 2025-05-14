package com.ds.algo.arrays;

public class MinimumNumber {

    public static void main(String[] args) {

        MinimumNumber minimumNumber = new MinimumNumber();

        int[] array = {5, 7, 3, 8, 1, 3, 2, 5, 11};
        int minimum = minimumNumber.findMinimumNumber(array);

        System.out.println("The minimum number is: " + minimum);
    }

    private int findMinimumNumber(int[] array) {

        if(array == null || array.length == 0) {
            throw new IllegalArgumentException("Invalid Input");
        }

        int minimum = array[0];

        for(int i=1; i<array.length; i++) {

            if(array[i] < minimum) {
                minimum = array[i];
            }
        }

        return minimum;
    }
}
