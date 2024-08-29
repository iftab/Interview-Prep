package com.dsa.sorting;

public class InsertionSort {
	/*
	 * 1. Insertion sort is an in-place Algorithm.
	 * 2. Big O(n^2) quadratic time complexity.
	 * 3. Stable Algorithm.
	 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input = new int[] {12, 1, 4, 12, 11,0};
		
		for(int firstUnsortedIndex = 1; firstUnsortedIndex < input.length; firstUnsortedIndex++) {
			
			int i;
			int newElement = input[firstUnsortedIndex];
			
			for(i = firstUnsortedIndex; i > 0 && input[i - 1] > newElement; i--) {
				input[ i ] = input[i - 1];
			}
			input[ i ] = newElement;
		}
		
		for(int element : input) {
			System.out.print("\t" + element);
		}

	}

}
