package com.problem.solution;

import java.util.Arrays;

public class RainTrappingProblem {
	
	public static int getProduct(int[] arr, int elementIndex) {
		int prod = 1;
		for(int index = 0; index < arr.length; index++) {
			if(elementIndex != index) {
				prod *= arr[index];
			}
		}
		return prod;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = new int[] {1,2,3,4};
		int[] output = new int[input.length];
		
		for (int i = 0; i < input.length; i++) {
			output[i] = getProduct(input, i);
		}
		
		Arrays.stream(output).forEach(System.out::println);
	}

}
