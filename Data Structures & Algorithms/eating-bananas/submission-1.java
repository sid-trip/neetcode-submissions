class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int m = 0;
        for(int x : piles){
            m = Math.max(x,m);
        }
        int smallest = 0;
        int l = 1, r = m;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(canEat(piles,mid,h)){
                smallest = mid;
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return smallest;
    }
    public boolean canEat(int[] piles, int n, int h){
        long count = 0;
        for(int i=0; i<piles.length; i++){
            if(piles[i] <= n) count++;
            else if(piles[i]%n == 0) count+=(piles[i])/n;
            else count+=((piles[i])/n) + 1;
            if(count>h) return false;
        }
        return true;
    }
}
