class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int count = 0;
        int sum = 0;
        for(int i = 0 ; i < n*n ; i++){
            if(sum+w>maxWeight){
                break;
            }
            else{
                count++;
                sum+=w;
            }
        }
        return count;
    }
}