class Solution {
    public String finalString(String s) {
        StringBuilder string = new StringBuilder();
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == 'i') string.reverse();
            else string.append(s.charAt(i));
        }
        return string.toString();   
    }
}