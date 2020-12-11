package com.code.core;

import java.util.ArrayList;
import java.util.List;

public class Gen {
    public static void main(String[] args) {
        genIntent();
    }

    public static void genIntent() {
        List<Integer> li = new ArrayList();
        li.add(12);
        //li.add("15");

        Integer x = li.iterator().next();
        System.out.println(x);

    }
}


interface List_<E> {
    void add(E x);
    Iterator_<E> iterator();
}

interface Iterator_<E> {
    E next();
    boolean hasNext();
}
