class Solution {
    public int maxArea(int[] heights) {
        int maxwater=0;
        int product=1;
        int left=0;
        int right=heights.length-1;
        int minheight=0;
        int maxoarea=0;
        while(left<right){
            int width=right-left;
            int height1=heights[left];
            int height2=heights[right];
            minheight=Math.min(height1,height2);
            product=width*minheight;
            maxoarea=Math.max(maxoarea,product);
            if(height1<height2){
                left++;
            }
            else{
                right--;
            }
        }
        return maxoarea;
    }
}
