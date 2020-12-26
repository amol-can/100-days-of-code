package com.leetcode.ds.array;

public class ArrayDemo {
}

class DVD{
    private String name;
    private int releaseYear;
    private String director;

    public DVD(String name, String director, int releaseYear){
        this.name = name;
        this.name = director;
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "DVD{" +
                "name='" + name + '\'' +
                ", releaseYear=" + releaseYear +
                ", director='" + director + '\'' +
                '}';
    }
}
