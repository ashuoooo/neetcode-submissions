class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list=new ArrayList<>();
        HashMap<String,ArrayList<Integer>> map=new HashMap<>();
        HashMap<Integer,String> map2=new HashMap<>();
        for(int i=0;i<strs.length;i++){
          char ch[]=strs[i].toCharArray();
          Arrays.sort(ch);
          String str=new String(ch);
          if(!map.containsKey(str)){
            map.put(str, new ArrayList<>());
          }
          map.get(str).add(i);
          map2.put(i,strs[i]);
          System.out.println(Arrays.toString(ch)+" "+str);
        }
        for(String key:map.keySet()){
          List<String> list1=new ArrayList<>();
          for(int k:map.get(key)){
            String value=map2.get(k);
            list1.add(value);
          }
          list.add(list1);
        }
        return list;
    }
}

     