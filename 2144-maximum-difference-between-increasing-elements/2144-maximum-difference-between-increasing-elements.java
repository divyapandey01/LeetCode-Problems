class Solution {
    public int maximumDifference(int[] nums) {
      int max=-1;
      for(int i=0;i<=nums.length-1;i++){
        for(int j=i+1;j<=nums.length-1;j++){
            if((nums[j]-nums[i])> max && (nums[j]-nums[i])>0){
                max=nums[j]-nums[i];
            }
        }
      } 
      return max; 
    }
}