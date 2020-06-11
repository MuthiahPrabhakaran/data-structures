package com.mp.linked.list.custom;

import java.util.NoSuchElementException;

public class LinkedList {

    private class Node {
        private int value;
        private Node next;

        Node(int value){
            this.value = value;
        }
    }

    Node first; // head
    Node last; // tail

    public void addLast(int item){
        var node = new Node(item);
        if(isEmpty())
            first = last = node;
        else {
            last.next = node;
            last = node;
        }
    }

    public void addFirst(int item){
        var node = new Node(item);
        if(isEmpty())
            first = last = node;
        else {
            node.next = first;
            first = node;
        }
    }

    public int indexOf(int item) {
        var current = first;
        int index = 0;
        while(current != null){
            if(current.value == item)
                return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int item){
        return indexOf(item) != -1;
    }

    public void removeFirst(){
        // If the list is empty
        if(isEmpty())
            throw new NoSuchElementException();

        // If the list has only one node
        if(first == last){
            first = last = null;
            return;
        }

        var second = first.next;
        first = second;
    }

    private boolean isEmpty(){
        return first == null;
    }
}
