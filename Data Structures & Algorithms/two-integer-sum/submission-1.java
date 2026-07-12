class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
          map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
          int x=nums[i];
          int diff=target-x;
          if(map.containsKey(diff)){
            int y=map.get(diff);
            if(i!=y){
              return new int[]{i,y};
            }
          }
        }
        return new int[]{-1,-1};
    }
}
