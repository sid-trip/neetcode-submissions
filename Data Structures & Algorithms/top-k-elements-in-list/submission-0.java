class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x : nums){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        List<Integer>[] buckets = new List[nums.length + 1];
        for(int x : map.keySet()){
            int freq = map.get(x);
            if(buckets[freq]== null){
                buckets[freq] = new ArrayList();
            }
            buckets[freq].add(x);
        }
        int[] ans = new int[k];
        int idx = 0;
        for(int freq = buckets.length - 1; freq >=0 && idx < k; freq--){
            if(buckets[freq] != null){
                for(int x : buckets[freq]){
                    ans[idx++] = x;
                    if(idx == k) break;
                }
            }
        }
        return ans;
    }
}
