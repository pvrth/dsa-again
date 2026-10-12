class Solution {
    public boolean threeFibonacciSum(int n) {
        int num1 = 0 ;
        int num2 = 1 ;
        int num3 = 1 ;

        while(true){
            int sum = num1 + num2 + num3 ;

            if(sum == n){
                return true;
            }
            if( sum > n){
                return false;
            }

            int nextFibo = num2 + num3;
            num1 = num2 ; 
            num2 = num3 ;
            num3 = nextFibo;
        } 
    }
}