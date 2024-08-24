package com.interview.problem;

public class Problem3 {
	/*
	 * Q3: Kth smallest element. Given an array arr[] and an integer k where k is
	 * smaller than the size of the array, the task is to find the kth smallest
	 * element in the given array. It is given that all array elements are distinct.
	 * Input: n = 6 arr[] = 7 10 4 3 20 15 k = 3 l=0 r=5
	 * 
	 * 
	 */

	public static int kthmin(int[] arr, int k) {
		if(k == 0 || k > arr.length) {
			return arr[0];
		}
		if (k < arr.length && k > 0) {
			for (int index = arr.length - 1; index > 0; index--) {
				for (int i = 0; i < arr.length - 1; i++) {
					if (arr[i] > arr[i + 1]) {
						int temp = arr[i];
						arr[i] = arr[i + 1];
						arr[i + 1] = temp;
					}
				}
			}
		}
		
		return arr[k - 1];
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, -1,3};
		int k = 5;
		System.out.println(kthmin(arr, k));

	}

}
