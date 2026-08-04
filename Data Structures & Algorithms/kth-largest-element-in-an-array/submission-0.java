class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        int count=k;
        for(int num:nums){
            pq.offer(num);
        }
        while(count>1){
            pq.poll();
            count--;
        }
        return pq.peek();
    }
}
