class Solution {
    public int addDigits(int num) {
        int sum = 0;
        boolean numcheck = true;
        while(numcheck){
            sum = 0;
            while(num!=0){
                sum += num%10;
                num/=10;
            }
            if(sum<10){
                numcheck = false;
            }
            num = sum;
            
        }
        return num;
    }
    
}