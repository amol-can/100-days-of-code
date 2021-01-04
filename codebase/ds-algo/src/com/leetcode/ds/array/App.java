package com.leetcode.ds.array;

public class App {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addAtHead(10);
        list.addAtHead(20);
        list.addAtHead(30);
        list.addAtHead(40);
        list.printArrayList();
        System.out.println("Tail: "+ list.tail.data);

        /*list.addAtTail(9);
        System.out.println("New Tail: "+ list.tail.data);*/
        System.out.println("size: "+ list.size);
        System.out.println("node at: "+ list.get(2));

        list.addAtIndex(5,100);
        System.out.println("===== New list ===");
        list.printArrayList();


    }
}
