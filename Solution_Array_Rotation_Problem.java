class Solution {
    public void rotate(int[] nums, int k) {
        if(k > nums.length -1 ){
            k = k % nums.length;
        }
        // Reversing Array from start and end of Array
        reverseFromIndex(nums, 0, nums.length - 1);
        // Reversing Array from start and k place.
        reverseFromIndex(nums, 0, k - 1);
        // Reversing Array from k place and till end.
        reverseFromIndex(nums, k , nums.length - 1);
    }

    public void reverseFromIndex(int[] input, int fromIndex, int endIndex){
        if(fromIndex >= endIndex){ 
            return;
        }
        // Swapping logic
        while(fromIndex < endIndex){
            int temp = input[ endIndex ];
            input[ endIndex ] = input[ fromIndex ];
            input[ fromIndex ] = temp;
            fromIndex++;
            endIndex--;
        }

    }
}
