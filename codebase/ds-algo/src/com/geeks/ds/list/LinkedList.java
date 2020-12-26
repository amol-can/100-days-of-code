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


        //print traverse linkedList
        printLinkedinList(ls.head);


    }

   public static void printLinkedinList(LinkedList_.Node node){
        while (node != null){
            System.out.println(node.data);
            node = node.next;
        }
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
}
