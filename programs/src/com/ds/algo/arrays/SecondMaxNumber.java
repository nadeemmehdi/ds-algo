package com.ds.algo.arrays;

public class SecondMaxNumber {

    public static void main(String[] args) {

        SecondMaxNumber secondMaxNumber = new SecondMaxNumber();

        int[] array = {5, 7, 3, 8, 1, 3, 2, 5, 11};
        int secondMax = secondMaxNumber.findSecondMaxNumber(array);

        System.out.println("The second maximum number is: " + secondMax);
    }

    private int findSecondMaxNumber(int[] array) {

        if(array == null || array.length == 0) {
            throw new IllegalArgumentException("Invalid Input");
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i=0; i<array.length; i++) {
            if(array[i] > max) {
                secondMax = max;
                max = array[i];
            } else if (array[i] > secondMax && array[i] != max) {
                secondMax = array[i];
            }
        }

        return secondMax;
    }
}
