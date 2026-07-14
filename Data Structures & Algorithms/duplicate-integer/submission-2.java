class Solution {
    public boolean hasDuplicate(int[] nums) {

        if(nums.length<1) return false;

        Set<Integer> numsSet = new HashSet<>();

        // for(int n : nums){
        //     if(numsSet.contains(n))
        //         return true;

        //     numsSet.add(n);
        // }

        for(int n: nums)
            if(!numsSet.add(n)) return true;
        return false;


    }
}