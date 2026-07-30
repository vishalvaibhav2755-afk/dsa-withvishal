class Solution {
    public int[] sortedSquares(int[] nums) {

        int[] neg = new int [nums.length];
         int [] pos = new int[nums.length];
         int poscount = 0;
         int negcount = 0;
         

         for(int i=0; i<nums.length; i++){
            if(nums[i]>=0){
                 pos[poscount]=nums[i]*nums[i];
                 poscount++;
            }
           else  {
            neg[negcount] = nums[i]*nums[i];
            negcount++;
           }
         }
         int left=0;
        int right = negcount-1;

        while(left<right){
            int temp = neg[left];
            neg[left]= neg[right];
            neg[right]= temp;
            left++;
            right--;
        }


    if(negcount==0){
        return pos;
    }

    
     if(poscount==0){
      
        return neg;
    }
    int i = 0 ;
    int k = 0;
    int j = 0;

    int [] b = new int[nums.length] ;
    
     while(i<negcount && j<poscount){

        if(neg[i]<pos[j]){
            b[k]=neg[i];
            i++;
            k++;
        }

        else{
            b[k]=pos[j];
            j++;
            k++;
        }
     
     }

     while(i<negcount){
        b[k]=neg[i];
        i++;
        k++;

     }
     while(j<poscount){
        b[k]=pos[j];
        j++;
        k++;

     

    }
    return b;

    }
}