class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int [] arr = new int[2];
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1; j<nums.length;j++){
                if(nums[i] == nums[j] && count!=1){
                    arr[0] = nums[i];
                    count++;
                } else if(count==1 && nums[i] == nums[j]){
                    arr[1] = nums[i];
                }
            }
        }
        return arr;
    }
}