class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        
        // Base cases
        if (n == 0) return 0;
        if (n == 1) return nums[0];
        if (n == 2) return Math.max(nums[0], nums[1]);
        
        // Strategy: Run standard House Robber on two different slices of the street
        // Option 1: Include 1st house, exclude last house -> range [0 to n-2]
        int robFirstStreet = robLinear(nums, 0, n - 2);
        
        // Option 2: Exclude 1st house, include last house -> range [1 to n-1]
        int robSecondStreet = robLinear(nums, 1, n - 1);
        
        // Return the maximum profit of both choices
        return Math.max(robFirstStreet, robSecondStreet);
    }
    
    // Our trusty old House Robber 1 logic, operating on a specific range
    private int robLinear(int[] nums, int start, int end) {
        int prev2 = 0;
        int prev1 = 0;
        
        for (int i = start; i <= end; i++) {
            int current = Math.max(prev1, prev2 + nums[i]);
            prev2 = prev1;
            prev1 = current;
        }
        
        return prev1;
    }
}