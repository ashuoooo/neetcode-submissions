class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        target=target;
        for(int i=0;i<numbers.length;i++){
            int diff=target-numbers[i];
            if(map.containsKey(diff)){
                int value=map.get(diff);
                return new int[]{value+1,i+1};
            }
            map.put(numbers[i],i);
        }
        return new int[]{-1,-1};
    }
}
