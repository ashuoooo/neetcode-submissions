class Solution {
    public boolean isAnagram(String s, String t) {
      char ch1[]=s.toCharArray();
      char ch2[]=t.toCharArray();
      System.out.println(Arrays.toString(ch1)+" "+Arrays.toString(ch2));
      Arrays.sort(ch1);
      Arrays.sort(ch2);
      System.out.println(Arrays.toString(ch1)+" "+Arrays.toString(ch2));
      if(s.length()!=t.length()){
        return false;
      }
      for(int i=0;i<s.length();i++){
        if(ch1[i]!=ch2[i]){
            return false;
        }
      }
      return true;
    }
}
