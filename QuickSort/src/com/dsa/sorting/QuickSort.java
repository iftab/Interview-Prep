package com.dsa.sorting;

public class QuickSort {
	/*
	 *  1. Divide and Conquer algorithm.
	 *  2. Recursive algorithm.
	 * 	3. Uses a pivot element to partition the array into two parts.
	 *  4. Elements < pivot to its left, elements > pivot to its right.
	 *  5. Pivot will then be in its correct sorted position.
	 *  6. Process is now repeated for the left array and right array.
	 *  7. Eventually, every element has been the pivot , so every element will be in its sorted position.
	 *  8. As with merge sort, we will end up partitioning the array into a series of 1-element arrays.
	 *  9. Does this in-place(unlike merge sort).
	 *  10. In-place algorithm.
	 *  11. O(nlogn) - base 2. We are repeatedly partitioning the array into two halves. 
	 *  12. Unstable algorithm.
	 * */

	public static void main(String[] args) {
		int[] intArray = {20, 31, 3, 2, 1, -1};
		
		quickSort(intArray, 0, intArray.length);
		
		for(int i=0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}

	}
	
	public static void quickSort(int[] input, int start, int end) {
		// Base condition if array of size 1.
		if(end - start < 2) {
			return;
		}
		
		int pivotIndex = partition(input, start, end);
		quickSort(input, start, pivotIndex);
		quickSort(input, pivotIndex + 1, end);
	}

	private static int partition(int[] input, int start, int end) {
		// This is using the first element as pivot;
		int pivot = input[start];
		int i = start;
		int j = end;
		
		// NOTE: empty loop body
		while( i < j && input[--j] >= pivot);
		if(i < j) {
			input[i] = input[j];
		}
		
		// NOTE: empty loop body
		while(i < j && input[++i] <= pivot);
		if(i < j) {
			input[j] = input[i];
		}
		
		input[j] = pivot;
		return j;
	}

}
