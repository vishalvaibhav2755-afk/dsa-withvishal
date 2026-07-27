class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int i;
        int max=nums[0];
        int secondmax=0;
        for(i=1; i<n; i++){

            if(nums[i]>max){
                secondmax = max;
                max = nums[i];
            }

        else if(nums[i]>secondmax){
            secondmax= nums[i];
        }


   

        }
           int val =( max-1) * (secondmax-1 ) ; 
    
    return val;
    }
}