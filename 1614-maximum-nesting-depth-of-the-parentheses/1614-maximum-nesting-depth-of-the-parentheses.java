class Solution {
    public int maxDepth(String s) {
        int depth = 0;
        int maxDepth = 0;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == '('){
                depth++;
            }
            if(s.charAt(i) == ')'){
                depth--;
            }
            if(depth>maxDepth) maxDepth = depth;
        }

        return maxDepth;
    }
}