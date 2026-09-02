class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int[] result = new int[n];
        result[n-1] = 0;
        stack.push(n-1);
        for(int i = n-2; i>=0; i--){
            while(!stack.isEmpty() && temperatures[i] >= temperatures[stack.peek()]){
                stack.pop();
            }
            if(!stack.isEmpty()) result[i] = stack.peek()-i;
            stack.push(i);
        }
        return result;
    }
}
