class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder string = new StringBuilder();
        boolean endFlag = false;
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for(char c : word.toCharArray()){
            if(!endFlag){
                if(c == ch){
                    stack.push(c);
                    endFlag = true;
                    count++;
                } 

                else{
                    stack.push(c);
                    count++;
                } 
            }
        }
        if(!endFlag) return word;
        while(!stack.isEmpty()){
            string.append(stack.pop());
        }

        for(int i = count ; i < word.length() ; i++){
            string.append(word.charAt(i));
        }

        return string.toString();
    }
}