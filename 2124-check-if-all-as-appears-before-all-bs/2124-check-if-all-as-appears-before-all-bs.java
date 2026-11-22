class Solution {
    public boolean checkString(String s) {
        int count = 0;
        boolean bOcc = false;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == 'b'){
                bOcc = true;
                continue;
            } 
            if(s.charAt(i) == 'a' && count == 0 && bOcc) count++;
            if(count == 1 && s.charAt(i) == 'a') return false;
        }
        return true;
    }
}