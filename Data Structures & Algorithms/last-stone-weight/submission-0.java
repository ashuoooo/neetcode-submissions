class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int num:stones){
            pq.offer(num);
        }
        while(pq.size()>1){
            int highest=pq.poll();
            int secondhighest=pq.poll();
            if(highest!=secondhighest){
                int diff=Math.abs(highest-secondhighest);
                pq.offer(diff);
            }
            
        }
        return pq.isEmpty() ? 0 : pq.peek();

    }
}
