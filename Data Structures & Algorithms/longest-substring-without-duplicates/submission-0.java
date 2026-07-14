class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        HashSet<Character> set=new HashSet<>();
        int maxlength=1;
        int length=1;
        int left=0;
        int right=1;
        set.add(s.charAt(left));
        while(right<s.length()){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                length++;
                maxlength=Math.max(maxlength,length);
            }
            else{

               while(s.charAt(left)!=s.charAt(right)){
                set.remove(s.charAt(left));
                left++;
               }
               left++;
               length=right-left+1;
            }
            right++;
        }
        return maxlength;
    }
}
