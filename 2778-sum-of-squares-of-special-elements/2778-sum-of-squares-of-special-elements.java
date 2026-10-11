class Solution {
    public int sumOfSquares(int[] nums) {
        int sum = 0;
        for(int i = 0 ; i < nums.length ; i++){
            int position = i + 1;
            if(nums.length % position == 0){
                sum += Math.pow(nums[i], 2);
            }
        }
        return sum;
    }
}