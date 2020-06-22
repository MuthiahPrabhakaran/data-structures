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

    public void reverse(){
        if(isEmpty())
            return;

        var previous = first;
        var current = first.next;
        while(current != null){
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        last = first;
        last.next = null;
        first = previous;
    }

    public int findKthFromTheEnd(int k){

        if(isEmpty())
            throw new IllegalStateException();

        // if we know the size
        /*if(k > size)
            throw new IllegalArgumentException();*/

        // 10-20-30-40-50-60
        var a = first;
        var b = first;

        // To find the 2nd pointer(50) from the end, the distance between two pointers should be one
        // To find the 3rd pointer(40) from the end, the distance between two pointers should be two, mean k-1
        for(int i = 0; i < k-1; i++) {
            b = b.next;
            //if k is more than the size of the list
            if(b == null)
                throw new IllegalArgumentException();
        }

        // Now the distance between the pointer is k-1, lets move it. Once the b hits last, we can fetch the value of a
        while(b != last){
            a = a.next;
            b = b.next;
        }

        return a.value;
    }

    public void findMiddleValue(){
        var a = first;
        var b = first;
        while(b != last && b.next != last){
            b = b.next.next;
            a = a.next;
        }

        if(b == last)
            System.out.println(a.value);
        else
            System.out.println(a.value +","+ a.next.value);
    }

    public boolean hasLoop(){
        var a = first;
        var b = first.next.next;
        boolean isCyclic = false;
        while(a!=null && b!=null){
            if(a == b){
                isCyclic = true;
                break;
            }
            a = a.next;
            b = b.next.next;
        }
        return isCyclic;
    }

    public void createListWithLoop(){
        Node node = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);

        node.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node4;

        first = node;
        last = node6;
    }
}
