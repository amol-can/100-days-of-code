package com.geeks.ds.binarytree;

/**
 *       tree
 *       ----
 *        1    <-- root
 *      /   \
 *     2     3
 *    /
 *   4
 */
public class SampleTree {
    public static void main(String[] args){
        BinaryTree binaryTree = new BinaryTree(String.valueOf(1));
        binaryTree.root.left = new Node("2");
        binaryTree.root.right = new Node("3");
        binaryTree.root.left.left = new Node("4");

        System.out.printf("Root node of tree: %s, left: %s, right: %s and left of left: %s ", binaryTree.root.data,
                binaryTree.root.left.data, binaryTree.root.right.data, binaryTree.root.left.left.data);
    }
}

class Node{
    String data;
    Node left, right;
    Node(String data){
        this.data = data;
        left = right = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data='" + data + '\'' +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}

class BinaryTree{
    Node root;

    public BinaryTree(String data){
        this.root = new Node(data);
    }

    public BinaryTree(){
        this.root = null;
    }



}
