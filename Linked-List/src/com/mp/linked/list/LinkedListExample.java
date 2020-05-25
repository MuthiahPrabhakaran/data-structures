package com.mp.linked.list;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.addFirst(1);
        list.addLast(50);
        System.out.println(list);
        System.out.println(list.size());

        System.out.println(list.contains(51));
        System.out.println(list.indexOf(50));

        var array = list.toArray();
        System.out.println(Arrays.toString(array));
    }
}
