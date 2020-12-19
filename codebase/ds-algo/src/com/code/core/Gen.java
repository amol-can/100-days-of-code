package com.code.core;

public class Gen {
    public static void main(String[] args) {
        Demo<String> integerDemo = new Demo<>("This is String");
        integerDemo.printType();
    }
}


class Demo<E>{
    E obj;

    Demo(E e){
        this.obj = e;
    }

    E getObj(){
        return obj;
    }

    void printType(){
        System.out.println("Type: "+ obj.getClass().getName());
    }

}
