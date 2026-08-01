class Solution {
    public int thirdMax(int[] nums) {
        Integer max1=null;
        Integer max2=null;
        Integer max3=null;

        for(int i = 0;i<nums.length; i++){
            int current = nums[i];
            if((max1!=null&& max1==current)||
              (max2!=null && max2==current)||
              (max3!=null && max3==current)){
                continue;
              }

              else if(max1==null ||current > max1){
                max3=max2;
                max2=max1;
                max1=current;
              }

           else if(max2==null ||current>max2){
            max3 = max2;
            max2 = current;
           }

           else if(max3==null||current>max3){
            max3 = current;
           }
           }
         if (max3==null){
          return max1;
           }
          

        return max3;
    }
}