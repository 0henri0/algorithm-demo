package sort;

import java.util.PriorityQueue;

public class HeapSort extends BaseSort {
    public Integer[] sort(Integer[] nums) {
        Integer[] numArr = nums.clone();
        int i = 0;
        Integer[] ans = new Integer[numArr.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : numArr) pq.offer(num);
        while (!pq.isEmpty()) ans[i++] = pq.poll();
        return ans;
    }
}
