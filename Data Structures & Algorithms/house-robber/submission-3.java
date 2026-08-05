class Solution {
    int arr[];
    public int rob(int[] nums) {
        arr=new int[nums.length];
        Arrays.fill(arr,-1);
       return helper(0,nums);
    }
    public int helper(int index , int[] nums){
        if(index>=nums.length){
            return 0;
        }
        if(arr[index]!=-1){
            return arr[index];
        }
       int take=nums[index]+helper(index+2,nums);
       int skip=helper(index+1,nums);
       arr[index]=Math.max(take,skip);
       return arr[index];
    }
}
