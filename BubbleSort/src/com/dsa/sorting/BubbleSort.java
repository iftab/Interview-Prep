package com.dsa.sorting;

import java.util.Arrays;

public class BubbleSort {
	/*In-place sorting algorithm
	 * Takes O(n^2)
	 * */
	
	public static void swap(int[] arr, int startIndex, int endIndex) {
		int temp = arr[startIndex];
		arr[startIndex] = arr[endIndex];
		arr[endIndex] = temp;
	}

	public static void main(String[] args) {
		int[] input = {1,32,4,2,1,223,43,9};
		
		for(int i = input.length -1 ; i > 0; i--) {
			for(int j = 0 ; j < i; j++) {
				if(input[ j+1 ] < input[ j ]) {
					swap(input, j+1, j);
				}
			}
		}
		
		Arrays.stream(input).forEach(s -> System.out.print(s+"\t"));
	}

}
