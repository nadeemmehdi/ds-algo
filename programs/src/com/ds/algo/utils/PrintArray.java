package com.ds.algo.utils;

public class PrintArray {

    public static void printIntArray(int[] array, String optionalMessage) {

        if(array == null || array.length == 0)
            throw new IllegalArgumentException("Invalid Array Input");

        System.out.print(optionalMessage);

        for(int i=0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.println("Size of the array: " + array.length);
        System.out.println();
    }
}
