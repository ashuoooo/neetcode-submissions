class Solution {
    public int countSubstrings(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            int leftlen=helper(s,i,i);
            int rightlen=helper(s,i,i+1);
            sum=sum+leftlen+rightlen;
        }
        return sum;
    }
    public int helper(String s , int left , int right){
        int count=0;
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            count++;
            left--;
            right++;
        }
        return count;
    }
}
