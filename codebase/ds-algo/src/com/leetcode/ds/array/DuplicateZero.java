package com.leetcode.ds.array;

/**
 * https://leetcode.com/explore/learn/card/fun-with-arrays/525/inserting-items-into-an-array/3245/
 */
public class DuplicateZero {
    public static void main(String[] args) {
        int[] array = {1, 0, 2, 3, 0, 4, 5, 0};
        duplicateZeros(array);
       // insertInMiddle(array);
    }

    public static void insertInMiddle(int[] arr) {
        for(int i = arr.length-1; i > 1 ; i--){
            arr[i] = arr[i-1];
        }
        printArray(arr);
    }

    public static void duplicateZeros(int[] arr) {
        //found -> shift to right from that index -> i+1 = 0
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                for (int j = arr.length-1; j > i; j--) {
                    arr[j] = arr[j - 1];
                }
                i +=1;
            }
        }
        printArray(arr);
    }

    private static void printArray(int[] array) {
        for (int val : array) {
            System.out.printf(val + " ");
        }
    }

}
