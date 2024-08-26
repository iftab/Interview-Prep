package com.interview.problem;

public class Problem2 {
	
	/*
	 * Q2:
		Maximum and minimum of an array using minimum number of comparisons
		Input: arr[] = {3, 5, 4, 1, 9}
		Output: Minimum element is: 1
		        Maximum element is: 9
		
		Input: arr[] = {22, 14, 8, 17, 35, 3}
		Output:  Minimum element is: 3
		         Maximum element is: 35
	 * */

	public static void main(String[] args) {
		int arr[] = {22, 14, 8, 17, 35, 3};
		
		int min = arr[0];
		int max = arr[1];
		
		if(max < min) {
			min = max;
		}else {
			max = min;
		}
		
		for(int start_index = 2 ; start_index < arr.length; start_index ++) {
			if(arr[start_index] > max) 
				max = arr[start_index];
			if (arr[start_index] < min)
				min = arr[start_index];
		}
		System.out.print("Max: " +max+" Min: "+min);
	}

}
