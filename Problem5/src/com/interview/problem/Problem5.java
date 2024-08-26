package com.interview.problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problem5 {
	/*
	 * Move all negative numbers to beginning and positive to end with constant
	 * extra space Input: -12, 11, -13, -5, 6, -7, 5, -3, -6 Output: -12 -13
	 * -5 -7 -3 -6 11 6 5
	 * 
	 */

	public static void swap(int[] a, int swapping_this, int swapping_with_this) {
		int temp = a[swapping_this];
		a[swapping_this] = a[swapping_with_this];
		a[swapping_with_this] = temp;
	}

	public static void main(String[] args) {
		int[] input_arr = { -12, 11, -13, -5, 6, -7, 5, -3, -6 };
		// Using Stream
		List<Integer> sorted = Arrays.stream(input_arr).sorted().mapToObj(i -> (Integer) i)
				.collect(Collectors.toList());
		// System.out.println(sorted);

	
		List result = new ArrayList<>();

		for (int j = 0; j < input_arr.length; j++) {
			if (input_arr[j] < 0) {
				result.add(input_arr[j]);
			} 
		}
		
		for (int j = 0; j < input_arr.length; j++) {
			if (input_arr[j] > 0) {
				result.add(input_arr[j]);
			} 
		}
		
		System.out.println(result);
	
		
		

	}

}
