class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        if(strs == null) return "";
        for(String s : strs){
            sb.append(s.length()).append(',');
        }
        sb.append('#');
        for(String s : strs){
            sb.append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        if(str == "") return new ArrayList<>();
        List<String> strs = new ArrayList<>();
        List<Integer> size = new ArrayList<>();
        int i = 0;
        while(str.charAt(i) != '#'){
            StringBuilder cur = new StringBuilder();
            while(str.charAt(i) != ','){
                cur.append(str.charAt(i));
                i++;
            }
            size.add(Integer.parseInt(cur.toString()));
            i++;
        }
        i++;
        for(int sz : size){
            strs.add(str.substring(i, i+sz));
            i+=sz;
        }
        return strs;
    }
}
