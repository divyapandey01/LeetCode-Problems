class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        arrRotate(nums, n-k, n-1);
        arrRotate(nums, 0, n-k-1);
        arrRotate(nums, 0, n-1);
    }

    public void arrRotate(int[] nums, int l, int r) {
        while(l<=r) {
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
    }
}