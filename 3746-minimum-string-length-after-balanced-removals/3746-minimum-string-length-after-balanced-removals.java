class Solution {
    public int minLengthAfterRemovals(String s) {
        int aCount = 0; 
        int bCount = 0; 
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == 'a') aCount++;
            else bCount++;
        }

        return Math.max(aCount,bCount) - Math.min(aCount,bCount);
    }
}