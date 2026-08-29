class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        //for every operand, pop the last 2 elements, integer.parseint both and the operator, and keep that shi in an element
        for(String s : tokens){
            switch (s) {
                case "+":{
                    int a = st.pop();
                    int b = st.pop();
                    st.push(a+b);
                    break;
                }
                case "-":{
                    int a = st.pop();
                    int b = st.pop();
                    st.push(b-a);
                    break;
                }
                case "*":{
                    int a = st.pop();
                    int b = st.pop();
                    st.push(a*b);
                    break;
                }
                case "/":{
                    int a = st.pop();
                    int b = st.pop();
                    st.push(b/a);
                    break;
                }
                default:
                    st.push(Integer.parseInt(s));
                    break;
            }
        }
        return st.pop();
    }
}
