class Solution {
    public String clearDigits(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i)>='0' && s.charAt(i)<='9') stack.pop();
            else stack.push(s.charAt(i));
        }

        String ans = "";

        while(!stack.isEmpty()){
            ans = stack.pop() + ans;
        }
        return ans;
    }
}