class Solution {
    public String encode(List<String> strs) {
       StringBuilder result = new StringBuilder();
       for(int i=0;i<strs.size();i++){
            int n=strs.get(i).length();
            result.append(n);
            result.append("#");
            result.append(strs.get(i));
       }
       return result.toString();
    }

    public List<String> decode(String str) {
        char ch[]=str.toCharArray();
        List<String> list=new ArrayList<>();
        for(int m=0;m<ch.length;m++){
            StringBuilder new1 = new StringBuilder();
            int value = 0;
            while(ch[m] != '#'){
            value = value * 10 + (ch[m] - '0');
            m++;
            }
            m++;
            while(value>0){
                new1.append(ch[m]);
                m++;
                value--;
            }
            String new2 = new1.toString();
            list.add(new2);
            m--;
        }
        return list;
    }
}
