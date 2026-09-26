class Solution {
    public String reverseWords(String s) {
        String str = "";
        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == ' '){
                while (!stack.isEmpty()) {
                    str += stack.pop();
                }
                str += " ";
            }
            else{
                stack.push(s.charAt(i));
            }

        }

        while (!stack.isEmpty()) {
                str += stack.pop();
        }
        return str;
    }
}