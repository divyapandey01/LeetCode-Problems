class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k=k%n;
        reverse(nums,n-k, n-1);
        reverse(nums, 0, n-1-k);
        reverse(nums, 0, n-1);
    }
    public void reverse(int[] nums, int i, int j){
        int temp;
        while(i<j){
            temp=nums[i];
            nums[i]=nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        for(int a=0;a<nums.length;a++){
            System.out.println("nums "+ nums[a]);
        }
    }
}