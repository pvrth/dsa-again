class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for(char ch:s.toCharArray()){
            if(ch == '(') stack.push(ch);
            else{
                if(stack.isEmpty()) count++;
                else{
                    char top = stack.peek();
                    if(top == '(' && ch == ')'){
                        stack.pop();
                    }
                }
            }
        }

        return Math.abs(stack.size() + count);
        
    }
}