package com.leetcode.ds.array;

import java.util.Arrays;

/**
 * https://leetcode.com/explore/learn/card/fun-with-arrays
 */
public class InsertDemo {
    private static int length = 0;

    public static void main(String[] args) {
        int[] array = insertIntoArray(10,15,30,53,24,65);
        System.out.printf("Initial size: %d, actual length: %d ", array.length, length);
        printArray(array);
        array[length] = 100;
        System.out.println("New array");
        printArray(array);
    }

    public static int[] insertIntoArray(int capacity, int... values) {
        int[] customArray = new int[capacity];
        for (int i = length; i < values.length; i++) {
            customArray[i] = values[i];
            length++;
        }
        return customArray;
    }

    private static void printArray(int[] array){
        for (int val: array) {
            System.out.printf(val+ " ");
        }
    }
}


