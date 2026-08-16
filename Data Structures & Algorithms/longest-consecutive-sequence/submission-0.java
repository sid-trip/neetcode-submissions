class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int x : nums){
            set.add(x);
        }
        int longest = 0;
        for(int x : set){
            int count = 1;
            if(!set.contains(x-1)){
                while(set.contains(x+1)){
                    count++;
                    x++;
                }
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }
}
