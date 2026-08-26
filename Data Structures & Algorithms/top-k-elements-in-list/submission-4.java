class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> freqMap = new HashMap<>();

        for(int n : nums){
            freqMap.put(n, freqMap.getOrDefault(n, 0)+1);
        }

        List<Integer>[] freq = new List[nums.length+1];
        for(int i=0;i<freq.length;i++){
            freq[i] = new ArrayList<>();
        }
        for(Map.Entry<Integer,Integer> entry : freqMap.entrySet()){
           freq[entry.getValue()].add(entry.getKey());
        }



       

        int[] res = new int[k];
        int resultIndex = 0;
        for(int i =freq.length-1;i>0 && resultIndex<k;i--){
            for(int n:freq[i]){
                res[resultIndex++] = n;
                if(resultIndex == k) return res;
            }
        }
    return res;
    }

}

