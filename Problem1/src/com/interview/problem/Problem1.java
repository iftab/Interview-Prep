package com.interview.problem;

public class Problem1 {
	
	/*
	 * Given an array (or string), the task is to reverse the array/string.
		Input: original_array[] = {4, 5, 1, 2}
		Output: array_reversed[] = {2, 1, 5, 4}
	 * 
	 * */
	
	public static void swap(int[] array, int swap_index_1, int swap_index_2) {
		int temp = array[swap_index_1];
		array[swap_index_1] = array[swap_index_2];
		array[swap_index_2] = temp;
	}

	public static void main(String[] args) {
		int[] original = {4, 5, 1, 2};
        
		int pointer_start = 0;
		int pointer_end = original.length -1;
		
		while(pointer_start <= pointer_end) {
			swap(original, pointer_start,pointer_end);
			pointer_start++;
			pointer_end--;
		}
		for(Integer i : original) {
			System.out.print("\t"+i);
		}
	}

}
