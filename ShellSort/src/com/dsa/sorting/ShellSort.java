package com.dsa.sorting;

public class ShellSort {
	
	/*
	 * 1. Variation of insertion sort.
	 * 2. Insertion sort chooses which element to insert using a gap of 1.
	 * 3. As the algorithm runs, the gaps is reduced.
	 * 4. The last gap will always be one.
	 * 5. A gap value 1 is always equivalent to an insertion sort.
	 * 6. By the time we get to insertion sort, the array has been partially sorted. So, there is less shifting required.
	 * 7. Gap is calculated using ((3^k)-1)/2.
	 * 8. we set k based on the length of the array.
	 * 9. In-place algorithm.
	 * 10. Worst time complexity O(n).
	 * 11. Unstable Algorithm.
	 * */

	public static void main(String[] args) {
		int[] input =  new int[] {32, 43, 45, 5, 454};
		
		int n = input.length;
		for(int gap = n/2 ; gap > 0; gap/=2) {
				for(int i = gap; i < n; i++) {
					 int temp = input[i];

		                // shift earlier gap-sorted elements up until
		                // the correct location for a[i] is found
		                int j;
		                for (j = i; j >= gap && input[j - gap] > temp; j -= gap)
		                    input[j] = input[j - gap];

		                // put temp (the original a[i]) in its correct
		                // location
		                input[j] = temp;
				}
			}
		
		for(int element : input) {
			System.out.print("\t" + element);
		}
		}

}
