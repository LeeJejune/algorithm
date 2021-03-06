import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int i=0; i<scoville.length; i++){
            heap.offer(scoville[i]);
        }
        while(heap.peek() < K){
            int min1 = heap.poll();
            int min2 = heap.poll();

            heap.add(min1 + min2*2);
            answer++;

            if (heap.peek() >= K) {
                break;
            }
            if (heap.peek() < K && heap.size() == 1) {
                answer = -1;
                break;
            }

        }
        return answer;
    }
}