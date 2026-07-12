class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        s=s.replace(" ", "");
        char ch[]=s.toCharArray();
        System.out.println(s+" "+Arrays.toString(ch));
        int left=0;
        int right=s.length()-1;
        boolean first=false;
        boolean second=false;
        while(left<right){
            char ch1=ch[left];
            char ch2=ch[right];
            if((ch1>='a' && ch1<='z') || (ch1 >= '0' && ch1 <= '9')){
                first=true;
            }
            else{
                first=false;
                left++;
            }
            if((ch2>='a' && ch2<='z') || (ch2 >= '0' && ch2 <= '9')){
                second=true;
            }
            else{
                second=false;
                right--;
            }
            if(first&&second){
                if(ch1!=ch2){
                    return false;
                }
             left++;
             right--;
            }
            
        }
        return true;
    }
}
