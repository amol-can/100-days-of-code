package com.code.core.basic;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Abst {
    public static void main(String[] args) {
      List<Integer> numbers = Arrays.asList(10, 30, 40 , 25, 90, 100, 57);

      /*numbers.forEach(new Consumer<Integer>() {
          @Override
          public void accept(Integer integer) {
              System.out.println(integer);
          }
      });*/

      //numbers.forEach(System.out::println);

        int sum = numbers.stream()
                .filter(num -> num % 2 == 0)
                .mapToInt(e -> e * 2)
                .sum();
        System.out.println(sum);

    }

}



