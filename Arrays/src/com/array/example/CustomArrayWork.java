package com.array.example;

import java.util.Arrays;

public class CustomArrayWork {
    public static void main(String[] args) {
        CustomArray array = new CustomArray(3);
        array.add(10);
        array.add(20);
        array.add(30);
        array.add(40);
        array.removeAt(2);
        //System.out.println(array.indexOf(40));
        //System.out.println(array.max());

        System.out.println(Arrays.toString(array.reverse()));
        //array.print();
    }
}
