package com.design.common;

public class Sample extends Animal {
    public static void main(String[] args){
        Sample sample = new Sample();
        sample.justPrint();
    }
    @Override
    public void soSomeStuff() {
        System.out.println("Just in override method");
    }
}

abstract class Animal{
    public abstract void soSomeStuff();
    public void justPrint(){
        System.out.println("Just printing the stuff");
    }
}
