class Solution {
    int arr1[];
    int arr2[];
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        arr1=new int[n];
        arr2=new int[n];
        Arrays.fill(arr1,-1);
        Arrays.fill(arr2,-1);
        int max1=helper(1,nums,arr1, n);
        int max2=helper(0,nums,arr2,n-1);
        return Math.max(max1,max2);
        
    }
    public int helper(int index , int[] nums , int[] arr , int end){
        if(index>=end){
            return 0;
        }
        if(arr[index]!=-1){
            return arr[index];
        }
        int take=nums[index]+helper(index+2,nums,arr,end);
        int skip=helper(index+1,nums,arr,end);
        arr[index]=Math.max(take,skip);
        return arr[index];
    }
}
