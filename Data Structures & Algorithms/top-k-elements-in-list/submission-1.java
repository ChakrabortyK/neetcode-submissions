class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> freqMap = new HashMap<>();

        for(int n : nums){
            freqMap.put(n,freqMap.getOrDefault(n, 0)+1);
        }

        PriorityQueue<int []> pq = new PriorityQueue<>((a,b)->a[1]-b[1]);

        for(Map.Entry<Integer,Integer> entry : freqMap.entrySet()){
            pq.add(new int[]{entry.getKey(),entry.getValue()});
            if(pq.size()>k) pq.poll();
        }


  
        int[] res = new int[k];
        for(int i=0;i<k;i++){
            res[i] = pq.poll()[0];
        }

    return res;


    }
}
