package com.array.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BasicArray {
	public static void main(String[] args) {
		List<Integer> df= new ArrayList<>();
		int[] numbers = new int[3];
		System.out.println(numbers); //[I@3d4eac69
		System.out.println(Arrays.toString(numbers)); //[0, 0, 0]
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		System.out.println(numbers[0]); //10
		
		String[] names = {"Name1","Name2"};
		System.out.println(Arrays.toString(names)); //[Name1, Name2]

	}


}
