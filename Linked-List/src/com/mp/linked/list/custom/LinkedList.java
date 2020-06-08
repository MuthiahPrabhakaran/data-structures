package com.mp.linked.list.custom;

public class LinkedList {

    private class Node {
        private int value;
        private Node next;

        Node(int value){
            this.value = value;
        }
    }

    Node first; //head
    Node last; //tail

    public void addFirst(int item){
        var node = new Node(item);
        if(first == null)
            first = last = node;
        else {
            last.next = node;
            last = node;
        }
    }
}
