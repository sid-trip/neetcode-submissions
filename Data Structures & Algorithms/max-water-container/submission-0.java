class Solution {
    public int maxArea(int[] heights) {
        int i = 0, j = heights.length - 1;
        int max = 0, minh = Integer.MAX_VALUE;
        while(i < j){
            int min = Math.min(heights[i], heights[j]);
            if(min < minh){
                minh = min;
                continue;
            }
            int area = (j-i)*min;
            max = Math.max(area,max);
            if(min == heights[i]){
                i++;
            }else{
                j--;
            }
        }
        return max;
    }
}
