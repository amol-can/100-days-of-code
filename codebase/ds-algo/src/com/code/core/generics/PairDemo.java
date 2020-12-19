package com.code.core.generics;

public class PairDemo {
    public static void main(String[] args) {
        OrderPair<String,Integer> myOrder = new OrderPair<>("T-Shirt",500);
        OrderPair<String,Integer> myOrder2 = new OrderPair<>("T-Shirt",500);
        System.out.println(myOrder.getKey());
        System.out.println(myOrder.getValue());

        boolean same = Utils.compare(myOrder,myOrder2);
        System.out.println(same);

    }
}

class Utils{
    public static <K,V> boolean compare(Pair<K,V> p1, Pair<K,V> p2){
        return p1.getKey().equals(p2.getKey()) &&
                p1.getValue().equals(p2.getValue());
    }
}

interface Pair<K,V> {
    K getKey();
    V getValue();
}

class OrderPair<K,V> implements Pair<K,V>{
    private final K key;
    private final V value;

    public OrderPair(K key,V value){
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey(){
        return key;
    }

    @Override
    public V getValue(){
        return value;
    }
}
