class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        
        // 1. Sort the array so duplicates sit next to each other
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length - 2; i++) {
            // Optimization: If the smallest number is > 0, three positive numbers can never sum to 0
            if (nums[i] > 0) break;
            
            // Skip duplicate values for the first element to avoid identical triplets
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            
            // 2. Set up Two Pointers
            int left = i + 1;
            int right = nums.length - 1;
            
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                
                if (sum == 0) {
                    // Found a valid triplet!
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    // Skip duplicate values for the left pointer
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    // Skip duplicate values for the right pointer
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    
                    // Move both pointers inward
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++; // Sum is too small, move left pointer to get a larger value
                } else {
                    right--; // Sum is too big, move right pointer to get a smaller value
                }
            }
        }
        
        return result;
    }
}
