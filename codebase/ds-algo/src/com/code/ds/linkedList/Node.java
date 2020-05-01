package com.code.ds.linkedList;

public class Node {
    private int data;
    private Node next;

    public Node(int data){
        this.data = data;
    }

    public void setData(int data){
        this.data = data;
    }
    public int getData(){
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}
