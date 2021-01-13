package com.leetcode.ds.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WidestGap {
    public static void main(String[] args) {
        //System.out.println("Widest gap: " + widestGap(10, Arrays.asList(1, 2, 5, 8), Arrays.asList(2, 2, 6, 10)));
        System.out.println("Widest gap: " + widestGap(10, Arrays.asList(4,1,2,6,6), Arrays.asList(4,4,4,10,8)));
        /*
          1 2 3 4 5 6 7 8 9 10

         */
    }

    public static int widestGap(int n, List<Integer> start, List<Integer> finish) {

        List<Integer> givenLane = new ArrayList<>();
        for (int i = 0 ; i < n ; i++){
            givenLane.add(i,i+1);
        }

        System.out.println("Lane array: "+ givenLane.toString());
        for (int i = 0; i < start.size(); i++){
            for(int j = start.get(i)-1; j < finish.get(i); j++){
                givenLane.set(j,0);
            }
            System.out.println(givenLane.toString());
        }

        int biggestNum = 0;
        int count = 0;
        for (int li: givenLane) {

            if (li != 0){
                count = count+1 ;
            }else {
                count = 0;
            }
            if (biggestNum < count){
                biggestNum = count;
            }
        }

        System.out.println("Widest gap from new logic: "+ biggestNum);

        int widestGap = 0;
        for (int i = 0; i < (start.size() - 1); i++) {
            int dif = Math.abs(finish.get(i) - start.get(i + 1));
            if (dif > 0) {
                int biggestNumber = dif - 1;
                if (widestGap < biggestNumber) {
                    widestGap = biggestNumber;
                }
            }
        }

        return widestGap;
    }
}
