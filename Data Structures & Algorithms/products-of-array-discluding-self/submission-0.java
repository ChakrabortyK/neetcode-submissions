public class Solution {
    public int[] productExceptSelf2(int[] nums) {
        int prod = 1, zeroCount = 0;
        for (int num : nums) {
            if (num != 0) {
                prod *= num;
            } else {
                zeroCount++;
                if (zeroCount > 1) {
                    return new int[nums.length];
                }
            }
        }

    

        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (zeroCount > 0) {
                res[i] = (nums[i] == 0) ? prod : 0;
            } else {
                res[i] = prod / nums[i];
            }
        }
        return res;
    }

    public int[] productExceptSelf(int[] nums) {
        int product =1;
        int count0 = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count0++;

                if(count0>1) return new int[nums.length];
                
                continue;
            }

            product *= nums[i];  

        }

        int arr[] = new int[nums.length];

        if(count0>0){
            for(int i=0;i<nums.length;i++)
                arr[i] = nums[i]==0 ? product : 0;
        }
        else{
            for(int i=0;i<nums.length;i++)
                arr[i] = product/nums[i];
        }

        return arr;



    }
}