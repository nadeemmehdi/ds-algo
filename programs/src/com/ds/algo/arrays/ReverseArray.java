package com.ds.algo.arrays;

public class ReverseArray {

    public static void main(String[] args) {
        ReverseArray reverseArray = new ReverseArray();

        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] result = reverseArray.reverseArray(array);

        System.out.print("The reversed array is: ");
        for(int i=0; i<result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }

    private int[] reverseArray(int[] array) {

        int start = 0;
        int end = array.length-1;

        while(start < end) {

            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }

        return array;
    }
}
