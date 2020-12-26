package com.code.core.basic.lambda;

public class Greeting {

    interface Greet{
        String sayHello(String str);
    }

    public void testGreeting(String str, Greet greet){
        String result = greet.sayHello(str);
        System.out.println("result: "+ result);
    }

    public static void main(String[] args) {
        new Greeting().testGreeting("Amol", (String s) -> "Hello, "+s);
    }

}
