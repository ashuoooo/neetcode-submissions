class Solution {
    public String longestPalindrome(String s) {
      int n=s.length();
      String ans="";
      for(int i=0;i<n;i++){
        String odd=helper(s,i,i);
        String even=helper(s,i,i+1);
        if(ans.length()<odd.length()){
            ans=odd;
        }
        if(ans.length()<even.length()){
            ans=even;
        }
      }
        return ans;
    }
    public String helper(String s , int start , int end){
        while(start>=0 && end<s.length() && s.charAt(start)==s.charAt(end)){
            start--;
            end++;
        }
        return s.substring(start+1,end);
    }
}
