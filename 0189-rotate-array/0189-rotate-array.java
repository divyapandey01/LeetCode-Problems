class Solution {
    public void rotate(int[] nums, int k) {
        int n= nums.length;
        k=k%n;
        if(k==0){
            return;
        }
        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
    }
    public void reverse(int[] arr, int low, int high){
        int temp;
        while(low<high){
            temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
    }
}