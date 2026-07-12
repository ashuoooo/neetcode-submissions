class Solution {
    public String encode(List<String> strs) {
        String result="";
       for(int i=0;i<strs.size();i++){
            int n=strs.get(i).length();
            result=result+n+"#"+strs.get(i);
       }
       return result;
    }

    public List<String> decode(String str) {
        char ch[]=str.toCharArray();
        List<String> list=new ArrayList<>();
        for(int m=0;m<ch.length;m++){
            String new1="";
            String number = "";
            while(ch[m] != '#'){
            number = number + ch[m];
            m++;
            }
            int value = Integer.parseInt(number);
            m++;
            while(value>0){
                new1=new1+ch[m];
                m++;
                value--;
            }
            list.add(new1);
            m--;
        }
        return list;
    }
}
