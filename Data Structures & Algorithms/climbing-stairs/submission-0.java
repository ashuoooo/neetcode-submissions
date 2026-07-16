class Solution {
    int arr[];
    public int climbStairs(int n) {
       arr=new int[n+1];
       Arrays.fill(arr,-1);
       return helper(n,arr);
    }
    public int helper(int n , int[] arr){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        if(arr[n]!=-1){
            return arr[n];
        }
        arr[n]=helper(n-1,arr)+helper(n-2,arr);
        return arr[n];
    }
}
