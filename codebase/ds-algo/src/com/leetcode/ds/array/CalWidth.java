package com.leetcode.ds.array;

import java.util.Arrays;

public class CalWidth {
    public static void main(String[] args) {
        int arr[] = {4,5,14};
        System.out.println(getWidth(arr, 7));
    }

    public static int getWidth(int[] heights, int wallHeight) {
        int totalWidth = 0;
        for (int person : heights) {
            if (person > wallHeight) {
                totalWidth = totalWidth + 2;
            } else {
                totalWidth = totalWidth + 1;
            }
        }
        return totalWidth;
    }

}
