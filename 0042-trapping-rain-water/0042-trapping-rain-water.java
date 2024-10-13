class Solution {
    public int trap(int[] height) {
        int count=0;
        int n = height.length;
        int [] leftMax = new int[n];
        int [] rightMax = new int[n];
        leftMax[0] = height[0];
        for(int i = 1; i<n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        rightMax[n-1] = height[n-1];
        for(int i = n-2; i>=0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }
        for(int i = 0; i<height.length; i++){
            int left = leftMax[i];
            int right = rightMax[i];
            count = count + Math.min(left, right)- height[i];
        }
        return count;
    }
}