package com.array.example;

public class CustomArray {

    private int[] items;
    private int count = 0;

    public CustomArray(int size){
        items = new int[size];
    }

    public void add(int item){

        // Resize the array if it is full
        if(items.length == count){
            //Create a new array(maybe twice the size)
            int[] newItems = new int[count * 2];

            //Copy the existing array into new one
            for(int i=0;i<count;i++){
                newItems[i] = items[i];
            }

            //Set the new array to the items
            items = newItems;
        }

        /*
         * Add a new item to the end
         * elements[count] = item;
         * count++; // We can replace with below one
        */
        items[count++] = item;
    }

    public void removeAt(int index){
        //Validate the index
        if(index < 0 || index >= count)
            throw new IllegalArgumentException();

        //If the index is valid, Shift the items to the left
        for(int i = index; i < count-1; i++){
            items[i] = items[i+1];
        }

        //Remove the last element
        count--;
    }

    public int indexOf(int item){
        for(int i = 0; i < count; i++){
            if(items[i] == item)
                return i;
        }
        return -1;
    }

    public int[] reverse(){
        int[] anotherItem = new int[count];
        int temp = 0;
        for(int i = count-1; i < 0 ; i--){
            anotherItem[temp] = items[i];
            temp++;
        }
        return anotherItem;
    }

    public int max(){
        int max = 0;
        for(int i = 0;i < count;i++){
            if(items[i]>max)
                max = items[i];
        }
        return max;
    }

    public void print(){
        for(int i=0;i<count;i++) {
            System.out.println(items[i]);
        }
    }
}
