package com.mp.linked.list.custom;

import java.util.Arrays;

public class CustomLinkedListExample {
    public static void main(String[] args) {
        var list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addFirst(5);

//        System.out.println(list.indexOf(10));
//        System.out.println(list.indexOf(200));

//        System.out.println(list.contains(10));
//        System.out.println(list.contains(100));

        //list.removeFirst();
        //System.out.println(list.contains(5));
        //list.reverse();
        //System.out.println(Arrays.toString(list.toArray()));
        System.out.println(list.findKthFromTheEnd(1));


    }
}
