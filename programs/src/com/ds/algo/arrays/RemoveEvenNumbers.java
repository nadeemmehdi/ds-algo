package com.ds.algo.arrays;

public class RemoveEvenNumbers {

    public static void main(String[] args) {

        RemoveEvenNumbers removeEvenNumbers = new RemoveEvenNumbers();

        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] result = removeEvenNumbers.removeOdd(array);

        System.out.print("The array after removing even numbers: ");
        for(int i=0; i<result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println(" ");
    }

    private int[] removeOdd(int[] array) {

        int n = array.length;
        int oddCount = 0;
        int index = 0;

        for(int i=0; i<n; i++) {
            if(array[i]%2 != 0) {
                oddCount++;
            }
        }

        int[] oddArray = new int[oddCount];

        for(int i=0; i<n; i++) {
            if(array[i]%2 != 0) {
                oddArray[index] = array[i];
                index++;
            }
        }

        return oddArray;
    }
}
