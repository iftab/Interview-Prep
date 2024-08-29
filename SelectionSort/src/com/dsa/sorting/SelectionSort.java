package com.dsa.sorting;

import java.util.Arrays;

public class SelectionSort {
	/*
	 * 1. Does not require any swapping as Bubble sort.
	 * 2. In-place algorithm.
	 * 3. Unstable Algorithm. 
	 * 4. Big O(n^2) is the quadratic Algorithm.
	 * 5. It takes 10,000 i.e., 100^2 steps to sort 100 elements
	 * 6. Large elements move to an end
	 * 
	 * 
	 * Find max index then swap with last Sorted Index.
	 * */
	
	/* Method to swap element in array*/
	public static void swap(int[] arr, int index_1, int index_2) {
		int temp = arr[index_1];
		arr[index_1] = arr[index_2];
		arr[index_2] = temp;
	}

	public static void main(String[] args) {
		
		int[] intArray = new int[]{12, 11, 34, 56, 0, -1};
		 
		for(int lastSortedIndex = intArray.length - 1; lastSortedIndex > 0 ; lastSortedIndex--) {
			
			int maxIndex = 0;
			
			for(int j = 1; j <= lastSortedIndex; j++) {
				if(intArray[ maxIndex ] < intArray[j]) {
					maxIndex = j;
				}
			}
			swap(intArray, lastSortedIndex, maxIndex);
		}
		
		/*Print Elements in Array*/
		Arrays.stream(intArray).forEach( e ->
		         System.out.print(e+"\t")
				);

	}
}
