package com.dsa.sorting;

import java.util.Arrays;

public class BubbleSort {
	/*In-place sorting algorithm
	 * Takes O(n^2)
	 * */
	
	public static void swap(int[] arr, int index_1, int index_2) {
		int temp = arr[index_1];
		arr[index_1] = arr[index_2];
		arr[index_2] = temp;
	}

	public static void main(String[] args) {
		int[] input = {1, 32, 4, 2, 1, 223, 43, 9};
		
		for(int unsortedIndex = input.length -1 ; unsortedIndex > 0; unsortedIndex--) {
			for(int j = 0 ; j < unsortedIndex; j++) {
				if(input[ j+1 ] < input[ j ]) {
					swap(input, j+1, j);
				}
			}
		}
		// Printing Output
		Arrays.stream(input).forEach(s -> System.out.print(s+"\t"));
	}

}
