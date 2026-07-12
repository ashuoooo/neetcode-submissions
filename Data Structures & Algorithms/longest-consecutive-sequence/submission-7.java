class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int max=0;
        int count=1;
        if(nums.length==1){
            return 1;
        }
        System.out.println(Arrays.toString(nums));
        for(int i=1;i<nums.length;i++){
            max=Math.max(max,count);
            if(Math.abs(nums[i-1]-nums[i])==1){
                count++;
            }
            else if(Math.abs(nums[i-1]-nums[i])==0){
                continue;
            }
            else{
                count=1;
            }
            max=Math.max(max,count);
        }
        return max;
    }
}
