class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int maxLen = 0;
        int left = 0;

        // 'right' scans through the string character by character
        for (int right = 0; right < s.length(); right++) {
            // If we hit a duplicate, shrink the window from the left
            // until the duplicate character is kicked out of the set
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            
            // Add the current character to our window
            set.add(s.charAt(right));
            
            // Calculate the current window size: (right - left + 1)
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}