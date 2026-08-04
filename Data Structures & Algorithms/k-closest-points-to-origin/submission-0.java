class Solution {
    public int[][] kClosest(int[][] points, int k) {
       PriorityQueue<int[]> maxheap=new PriorityQueue<>((x,y)->getDistance(y)-getDistance(x));
       for(int[] point:points){
        maxheap.offer(point);

        if(maxheap.size()>k){
            maxheap.poll();
        }
       }

       int[][] result=new int[k][2];
       int index=0;
       while(!maxheap.isEmpty()){
        result[index++]=maxheap.poll();
       }
        return result;
    }
    private int getDistance(int[] point) {
        return point[0] * point[0] + point[1] * point[1];
    }
}

     