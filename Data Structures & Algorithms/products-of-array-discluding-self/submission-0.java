class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prefix[]=new int[nums.length];
        int suffix[]=new int[nums.length];
        prefix[0]=1;
        suffix[nums.length-1]=1;
        int product1=1;
        int product2=1;
        for(int i=1;i<nums.length;i++){
           product1=product1*nums[i-1]; 
           prefix[i]=product1;
        }
        for(int j=nums.length-2;j>=0;j--){
           product2=product2*nums[j+1]; 
           suffix[j]=product2;
        }
        System.out.println(Arrays.toString(prefix)+" "+Arrays.toString(suffix));
        int[] arr=new int[nums.length];
        for(int y=0;y<nums.length;y++){
            arr[y]=prefix[y]*suffix[y];
        }
        return arr;
    }
}  
