class Solution {
    public int[][] kClosest(int[][] points, int k) {
      PriorityQueue<int[]> pq=new PriorityQueue<>((x,y)->getDistance(y)-getDistance(x));
      for(int[] point:points){
        pq.offer(point);
        if(pq.size()>k){
            pq.poll();
        }
      }
      int[][] result=new int[k][2];
      int index=0;
      while(!pq.isEmpty()){
        result[index++]=pq.poll();
      }
      return result;
    }
    public int getDistance(int[] point){
        return point[0]*point[0] + point[1]*point[1];
    }
}

     