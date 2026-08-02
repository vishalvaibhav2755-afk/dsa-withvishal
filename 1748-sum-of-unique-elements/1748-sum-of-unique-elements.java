class Solution {
    public int sumOfUnique(int[] nums) {
        int sum=0;
        HashMap<Integer,Integer> set = new HashMap<>();
        for (int i = 0 ; i<nums.length; i++){
            set.put(nums[i],set.getOrDefault(nums[i],0)+1);

            }
            for(int i = 0; i<nums.length;i++){
              if(set.get(nums[i])==1){
            sum=sum+nums[i];
              
        }
        }
      return sum;
    }
}