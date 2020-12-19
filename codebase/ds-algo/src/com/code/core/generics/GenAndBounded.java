package com.code.core.generics;

public class GenAndBounded {

    public static void main(String[] args) {
        int[] ar = {10,20,30,4,5};
        //countGreaterThan(ar,9);
    }

    public static <T extends Comparable> int countGreaterThan(T[] numArray, T elem){
        int counter = 0;
        for (T e: numArray){
            if (e.compareTo(elem) > 0){
                ++counter;
            }
        }
        return counter;
    }

}

interface Comparable<T>{
    public int compareTo(T o);
}


