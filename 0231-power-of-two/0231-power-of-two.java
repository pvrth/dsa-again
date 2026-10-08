class Solution {
    public boolean isPowerOfTwo(int n) {
        long power = 2;
        if(n==2 || n==1){
            return true;
        }
        if(n%2!=0){
            return false;
        }
        while(power<n){
            power*=2;
            if(power==n){
                return true;
            }
        }
        return false;
    }
}