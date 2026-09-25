class Solution {
    public String minWindow(String s, String t) {
        int n = s.length();
        if (n < t.length())
            return "";
        String result = "";
        int[] freqt = new int[128];
        for(char c : t.toCharArray()){
            freqt[c]++;
        }
        int[] freqs = new int[128];
        int l = 0, smallest = Integer.MAX_VALUE;
        for(int r = 0; r<n; r++){
            freqs[s.charAt(r)]++;
            boolean match = true;
            for(int i=0; i<128; i++){
                if(freqt[i] > 0){
                    if(freqs[i] < freqt[i]){
                        match = false;
                        break;
                    }
                }
            }
            if(match){
                while(match){
                    if(r-l+1 < smallest){
                        smallest = r-l+1;
                        result = s.substring(l,r+1);
                    }
                    freqs[s.charAt(l)]--;
                    l++;
                    match = true;
                    for(int i=0; i<128; i++){
                        if(freqt[i] > 0 && freqt[i] > freqs[i]){
                            match = false;
                            break;
                        }
                    }
                }
            }
            
        }
        return result;
    }
}
