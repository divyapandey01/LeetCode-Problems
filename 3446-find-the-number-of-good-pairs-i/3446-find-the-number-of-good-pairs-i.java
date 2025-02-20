class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int count =0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums2.length;i++){
            int x= nums2[i]*k;
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        for(int i=0; i<nums1.length; i++){
            for(int key: map.keySet()){
                if(nums1[i]%key==0){
                    count = count+map.get(key);
                }
            }
        }
        return count;
    }
}