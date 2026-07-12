class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        HashSet<List<Integer>> set = new HashSet<>();
        for(int j=0;j<nums.length;j++){
            int x=nums[j];
            for(int k=j+1;k<nums.length;k++){
                if(j==k){
                    continue;
                }
                else{
                    int y=nums[k];
                    int diff=-x-y;
                    if(map.containsKey(diff)){
                        int value=map.get(diff);
                        if(value!=j && value!=k){
                            ArrayList<Integer> list1 = new ArrayList<>();
                            list1.add(nums[j]);
                            list1.add(nums[k]);
                            list1.add(diff);
                            Collections.sort(list1);
                            set.add(list1);
                        }
                    }
                }
            }
        }
        list.addAll(set);
        return list;
    }
}
        




