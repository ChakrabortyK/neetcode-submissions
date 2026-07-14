class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> setofno = new HashSet<>();

        for(int i : nums){
            if(!setofno.add(i)) return true;
        }
        return false;
    }
}