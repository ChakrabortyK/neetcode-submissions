class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();

        for(String s : strs ){
            int arr[] = new int[26];

            for(char c : s.toCharArray()){       // iterating each character of current string
                arr[c-'a']++; // count at c-97 -> +1
            }
            String key = Arrays.toString(arr); //[0,0,0,0,1,0,0,1,1,1,0,0] in string form
            map.putIfAbsent(key, new ArrayList<>());  // key is [0,1,0,2,1] value is empty List<>
            map.get(key).add(s); // add s to the empty list
        }

        return new ArrayList<>(map.values());
    }
}


