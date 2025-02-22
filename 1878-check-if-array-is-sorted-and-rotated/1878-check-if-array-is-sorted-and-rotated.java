class Solution {
    public boolean check(int[] nums) {
        int[] arr = nums.clone();
        int x=0;
        boolean flag = true;
        Arrays.sort(arr);//1 2 3 4 5
            while(x<nums.length){
                flag=true;
                for(int i=0; i<nums.length; i++){
                if(!(arr[i] == nums[(i+x) % nums.length])) {
                    flag=false;
                }
                }
                if(flag){
                    return flag;
                }
                x++;
            }
        return flag;
    }
}