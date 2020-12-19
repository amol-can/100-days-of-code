package com.code.core.generics;

public class BoundedType {
    public static void main(String[] args) {
        Foo<Integer> foo = new Foo<>();
        foo.setT(10);
        foo.inspect(10.10);
    }
}

class Foo<T>{
    private T t;

    public void setT(T t){
        this.t = t;
    }

    public T getT(){
        return t;
    }

    public <U extends Number> void inspect(U num){
        System.out.println("T: "+ t.getClass().getName());
        System.out.println("U: "+ num.getClass().getName());
    }

}
