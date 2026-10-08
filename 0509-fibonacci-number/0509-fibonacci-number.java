class Solution {
    public int fib(int n) {
        int a = 0;
        int b = 1;
        int count = 2;
    if(n == 0){
        return 0;
    }
    while(count <= n){
        int temp = b;
        b += a;
        a = temp;
        count++;
    }
        return b;
    }
}