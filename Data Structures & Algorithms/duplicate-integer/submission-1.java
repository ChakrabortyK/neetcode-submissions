class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        Set<Integer> test = new HashSet<>();
        
        for(int i =0;i<nums.length;i++){
            
            if(test.contains(nums[i])){
                return true;
            }

            test.add(nums[i]);
        }

        return false;
    }
}