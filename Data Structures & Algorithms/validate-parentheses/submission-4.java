class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                st.push(c);
            }
            else if(!st.isEmpty() && c == ')'){
                if(st.pop() != '(') {
                    return false;
                }
            }
            else if(!st.isEmpty() && c == '}'){
                if(st.pop() != '{'){
                    return false;
                }
            }
            else if(!st.isEmpty() && c == ']'){
                if(st.pop() != '['){ 
                    return false;
                }
            }
            else st.push(c);
        }
        return st.isEmpty();
    }
}
