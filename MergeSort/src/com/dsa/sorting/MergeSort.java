package com.dsa.sorting;

import java.util.Arrays;

public class MergeSort {
	/*
	 * 1. Divide & Conquer Technique.
	 * 2. Recursive Algorithm.
	 * 3. Two Phases : Splitting & Merging.
	 * 4. Splitting phase leads to faster sorting during the merging phase.
	 * 5. Splitting is logical.
	 * 
	 * */

	public static void main(String[] args) {
		
		int arr[] = { 12, 11, 13, 5, 6, 7, 1 };
		
		System.out.println("\nArray before sorting");
		Arrays.stream(arr).forEach((value)-> System.out.print(value+"\t"));
		
		
		MergeSort impl= new MergeSort();
		
		impl.mergeSort(arr, 0, arr.length -1);
		
		System.out.println("\nArray after sorting");
		
		Arrays.stream(arr).forEach((value)-> System.out.print(value+"\t"));

	}
	/*
	 * Merge Sort logic
	 */
    public void mergeSort(int[] arr, int start, int end) {
    	
		if(start < end) {
			int mid = (start + end) / 2;
			mergeSort(arr, start, mid);
			mergeSort(arr, mid+1, end);
			
			// Merge two halve
			merge(arr, start, mid, end);
			
		}
    	
	}
    /*
	 * Merge two sorted Arrays. Not in-place algorithm
	 */
	
	public  void merge(int[] arr, int left, int mid, int right) {
		
		
		// Finding of left and right array
		
		int left_array_size = mid - left + 1; 
		int right_array_size = right - mid;
		
		int[] left_array = new int[left_array_size];
		int[] right_array = new int[right_array_size];
		
		// Moving all data to left array
		
		for(int i = 0; i < left_array_size; i++) {
			left_array[ i ] = arr[left + i];
		} 
		
		
	
		// Moving all data to right array
		
		for(int i = 0; i < right_array_size; i++) {
			right_array[ i ] = arr[ mid + 1 + i ];
		} 
		
		
		// Start Comparing left and right array
		
		int index = left;
		int left_start_index = 0, right_start_index = 0;
		
		while(left_start_index < left_array_size && right_start_index < right_array_size ) {
			if(left_array[ left_start_index ] < right_array[ right_start_index ]) {
				arr[ index++ ] = left_array[ left_start_index++ ];
			}else {
				arr[ index++ ] = right_array[ right_start_index++ ];
			}
		}
		
		
		while(left_start_index < left_array_size){
			arr[ index++ ] = left_array[ left_start_index++ ];
		}
		
		
		while(right_start_index < right_array_size){
			arr[ index++ ] = right_array[ right_start_index++ ];
		}
		
	}

}
