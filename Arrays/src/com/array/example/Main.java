package com.array.example;

public class Main {
    public static void main(String[] args) {
        IntegerList array = new IntegerList(3);
        array.add(10);
        array.add(20);
        array.add(30);
        array.add(40);
        //array.removeAt(2);
        //System.out.println(array.indexOf(40));
        //System.out.println(array.max());

        //System.out.println(Arrays.toString(array.reverse()));
        //array.print();

        for(int item : array){
            System.out.println(item);
        }
    }
}
