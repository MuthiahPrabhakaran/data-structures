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
    private int size;

    public void addLast(int item){
        var node = new Node(item);
        if(isEmpty())
            first = last = node;
        else {
            last.next = node;
            last = node;
        }
        size++;
    }

    public void addFirst(int item){
        var node = new Node(item);
        if(isEmpty())
            first = last = node;
        else {
            node.next = first;
            first = node;
        }
        size++;
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
        } else{
            var second = first.next;
            first = second;
        }
        size--;

    }

    private boolean isEmpty(){
        return first == null;
    }

    public void removeLast(){
        // Find the previous node to the last node and break the chain
        if(isEmpty())
            throw new NoSuchElementException();

        if(first == last){
            first = last = null;
        } else {
            var previousToLastNode = getPrevious(last);
            if(previousToLastNode == null)
                throw new NoSuchElementException();

            previousToLastNode.next = null;
            last = previousToLastNode;
        }
        size--;
    }

    public int size(){
        return this.size;
    }

    private Node getPrevious(Node node){
        var current = first;
        while(current != null){
            if(current.next == node)
                return current;
            current = current.next;
        }
        return null;
    }

    public int[] toArray(){
        int[] items = new int[size];
        var current = first;
        int index = 0;
        while(current != null){
            items[index++] = current.value;
            //index++
            current = current.next;
        }
        return items;
    }
}
