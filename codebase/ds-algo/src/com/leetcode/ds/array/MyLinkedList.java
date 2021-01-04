package com.leetcode.ds.array;

public class MyLinkedList {
    Node head;
    Node tail;
    public int size = 0;

    /**
     * Create Node
     */
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    /**
     * Initialize your data structure here.
     */
    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    /**
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    public int get(int index) {
        if (index < size) {
            Node node = head;
            for (int i = 0; i < index; i++) {
                node = node.next;
                if (i == index - 1) {
                    return node.data;
                }
            }
        }
        return -1;
    }

    /**
     * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        Node node = new Node(val);
        if (head != null) {
            node.next = head; // 40, 10, 20, 30    40
        }
        head = node;
        size = size + 1;
        if (tail == null) {
            tail = node;
        }
    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if (tail != null) {
            tail = tail.next = newNode;
        } else {
            tail = newNode;
        }
        size = size + 1;
    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
     */
    public void addAtIndex(int index, int val) {
        Node newNode = new Node(val);
        // 40, 30, 20, 10
        // 40, 30, 25, 20, 10
        if (index <= size) {
            // index 2
            Node temp = head;
            for (int i = 0; i <= index; i++) {
                if (index == 0){
                    newNode.next = head;
                    head = newNode;
                }
                else if (i == (index - 1)) {
                    newNode.next = temp.next;
                    temp.next = newNode;
                }
                temp = temp.next;
            }
        }

    }

    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {

    }

    public void printArrayList() {
        Node node = head;
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */