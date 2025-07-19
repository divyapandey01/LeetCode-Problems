class Solution {
    public int removeDuplicates(int[] nums) {
       int i=0, j=1,n=nums.length;
       while(j<n) {
        if(nums[i] != nums[j]){
            nums[i+1] = nums[j];
            i++;
            j++;
        } else{
            j++;
        }
       }
       return i+1;
    }
}