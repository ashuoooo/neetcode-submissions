class Solution {
    int arr[];
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        arr=new int[n];
        Arrays.fill(arr,-1);
        return Math.min(helper(0,cost),helper(1,cost));
    }
    public int helper(int index,int[] cost){
        if(index>=cost.length){
            return 0;
        }
        if(arr[index]!=-1){
            return arr[index];
        }
        int onestep=helper(index+1,cost);
        int twostep=helper(index+2,cost);
        arr[index]=cost[index]+Math.min(onestep,twostep);
        return arr[index];
    }
}
