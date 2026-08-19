class Solution {
    public boolean isPalindrome(String s) {
        char[] chars = (s.replaceAll("[^a-zA-Z0-9]", "")).toLowerCase().toCharArray();

        int l = 0, r = chars.length-1;
        while(l<r){
            if(chars[l] != chars[r]) return false;
            l++;
            r--;
        }
        return true;
    }
}
