class Solution {
  
    public int[] twoSum(int[] nums, int target) {
        int[] resultantArray = new int[2];
        resultantArray[0] = -1;
        resultantArray[1] = -1;

        HashMap<Integer, Integer> hasMap = new HashMap();

        for(int index = 0 ; index < nums.length; index++){
            int requiredSum = target - nums[index];
            if(hasMap.containsKey(requiredSum)){
                resultantArray[0] = index;
                resultantArray[1] = hasMap.get(requiredSum);
            }
            hasMap.put(nums[index], index);
        }

        return resultantArray;
}
}
