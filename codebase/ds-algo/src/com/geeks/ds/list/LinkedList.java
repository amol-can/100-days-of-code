package com.geeks.ds.list;

public class LinkedList {
    public static void main(String[] args){
        LinkedList_ ls = new LinkedList_();

        ls.head = new LinkedList_.Node("Venkatrao");

        LinkedList_.Node child1 = new LinkedList_.Node("Sakharam");
        LinkedList_.Node child2 = new LinkedList_.Node("Krishna");
        LinkedList_.Node child3 = new LinkedList_.Node("Radha");

        ls.head.next = child1;
        child2.next = child3;
        child1.next = child2;

        ls.traverseList();

        ls.push("Pundalikrao");
        System.out.println("After pushing data");
        ls.traverseList();

        //
        ls.insertAfter(child1,"Amol");
        System.out.println("After insert");
        ls.traverseList();

        System.out.println("=====");
        ls.traverseList();


    }

}

class LinkedList_{
    Node head;

    static class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    public void push(String data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAfter(Node prevNode, String data){
        Node newNode = new Node(data);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    //handle concurrency
    void traverseList(){
        Node tnode = head;
        while (tnode != null){
            System.out.println(tnode.data);
            tnode = tnode.next;
        }
    }
}
