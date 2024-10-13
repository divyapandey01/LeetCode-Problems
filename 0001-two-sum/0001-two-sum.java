class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer,Integer> numsMap = new HashMap<>();
       int n=nums.length-1;
       int[] arr = new int[2];
       for(int i=0;i<=n;i++){
        if(numsMap.containsKey(target-nums[i])) {
            arr[0]=i;
            arr[1] = numsMap.get(target-nums[i]);
            break;
        }
        numsMap.put(nums[i],i);
       }
       return arr;
    }
}