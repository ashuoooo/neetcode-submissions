class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        result.add(new ArrayList<>());
        System.out.println(result);
        for(int num:nums){
            int n=result.size();
            for(int i=0;i<n;i++){
                List<Integer> newsubset=new ArrayList<>(result.get(i));
                newsubset.add(num);
                result.add(newsubset);
            }
            
        }
       return result;
    }
}

