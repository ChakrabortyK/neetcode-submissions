class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> setofno = new HashSet<>();

        for(int i : nums){
            setofno.add(i);
        }

        return !(setofno.size() == nums.length);
    }
}