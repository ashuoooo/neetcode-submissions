class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        if (s.length() % 2 != 0) {
            return false;
        }
        for(int i=0;i<s.length();i++){
            if (!stack.isEmpty()) {
            char ch=stack.peek();
            if(ch=='[' && s.charAt(i)==']'){
                stack.pop();
                continue;
            }
            if(ch=='{' && s.charAt(i)=='}'){
                stack.pop();
                continue;
            }
            if(ch=='(' && s.charAt(i)==')'){
                stack.pop();
                continue;
            }
            }
            stack.push(s.charAt(i));
            
            
        }
        return stack.isEmpty();
    }
}
