class Solution {
    public int lengthOfLongestSubstring(String s) {
        boolean[] seen = new boolean[128];
        int left = 0, len = 0;
        for(int right = 0; right < s.length(); right++){
            char c = s.charAt(right);
            while(seen[c] && left < right){
                seen[s.charAt(left)] = false;
                left++;
            }
            seen[c] = true;
            len = Math.max(len, right - left+1);
        }
        return len;
    }
}
