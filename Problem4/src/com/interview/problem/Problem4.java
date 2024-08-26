package com.interview.problem;

public class Problem4 {
	/*
	 * Q4. Sort an array of 0s, 1s and 2s Given an array of size N containing only
	 * 0s, 1s, and 2s; sort the array in ascending order. Input: N = 5 arr[]= {0 2 1
	 * 2 0} Output: 0 0 1 2 2 Explanation: 0s 1s and 2s are segregated into
	 * ascending order.
	 */
	
	public static void main(String[] args) {
		int arr[] = { 0,0};
		int count_arr[] = getCount(arr);
		
		int last_update_index = 0;
		int till_index = 0;
		
		while(last_update_index < count_arr[0]) {  //0 - 1 - O(N)
			arr[last_update_index] = 0;
			last_update_index++;
		}
		
		till_index = last_update_index + count_arr[1];
		while(last_update_index < till_index) { // 1 - 1-  O(N)
			arr[last_update_index] = 1;
			last_update_index++;
		}
		
		till_index = last_update_index + count_arr[2];
		while(last_update_index < till_index) { // 2 + 2 - -  O(N)
			arr[last_update_index] = 2;
			last_update_index++;
		}
		
		for(int i : arr) {
			System.out.print("\t"+i);
		}
	}

	public static int[] getCount(int arr[]) {
		int count_0 = 0;
		int count_1 = 0;
		int count_2 = 0;
		int sorting_order_arr[] = { 0, 1, 2 };

		for (int i = 0; i < arr.length; i++) { // Order of N 
			if (arr[i] == 0) {
				count_0++;
			} else if (arr[i] == 1) {
				count_1++;
			} else {
				count_2++;
			}
		}

		sorting_order_arr[0] = count_0;
		sorting_order_arr[1] = count_1;
		sorting_order_arr[2] = count_2;

		return sorting_order_arr;
	}
}
