class Solution {
    public int[] productExceptSelf_1(int[] nums) {
        int[] productOfleft = new int[nums.length];
        int[] productOfright = new int[nums.length];
        
        productOfleft[0] = 1;
        for(int i = 1 ; i < nums.length; i++){ // [1,2,3,4]
            productOfleft[i] = nums[i-1] * productOfleft[i - 1]; // left Prefix [1,1,2,6]
        }

        productOfright[nums.length - 1] = 1;
        for(int k = nums.length - 2; k >= 0; k--){
            productOfright[k] = productOfright[k + 1] * nums[k+1]; // Right Prefix [24,12,4,1]
        }

        for(int i = 0; i < nums.length; i++){
            nums[i] = productOfleft[i] * productOfright[i];
        }
        return nums;
    }
  
  public int[] productExceptSelf_2(int[] nums) {   // Space Complexity Reduced.
        int n = nums.length;
        int ans[] = new int[n];
        Arrays.fill(ans, 1);
        int curr = 1;
        for(int i = 0; i < n; i++) {
            ans[i] *= curr;
            curr *= nums[i];
        }
        curr = 1;
        for(int i = n - 1; i >= 0; i--) {
            ans[i] *= curr;
            curr *= nums[i];
        }
        return ans;
    }
}
