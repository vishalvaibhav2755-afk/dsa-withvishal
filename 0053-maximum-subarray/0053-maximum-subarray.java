class Solution {
    public int maxSubArray(int[] nums) {
        int i =0;
        int n = nums.length;
        int sum = 0;
        int maxsum = Integer.MIN_VALUE;
        
        while(i<n){
            sum +=nums[i];
            if(sum>maxsum){
                maxsum=sum;
            } 

            if(sum<0){
                sum = 0;
            }
        i++;
        }    
    return maxsum;
    }
}