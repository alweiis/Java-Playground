package Daily;

import java.util.*;

public class HeapSort {
    public static void main(String[] args) {
        int[] output = solution(new int[]{5, 4, 3, 2, 1});
        System.out.println(Arrays.toString(output)); // --> [1, 2, 3, 4, 5]

        output = solution(new int[]{3, 1, 21});
        System.out.println(Arrays.toString(output)); // --> [1, 3, 21]

        output = solution(new int[]{4, 10, 3, 5, 1});
        System.out.println(Arrays.toString(output)); // --> [1, 3, 4, 5, 10]
    }

    public static int[] solution(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int n = arr.length;
        int[] result = new int[n];

        for (int i : arr) {
            pq.add(i);
        }

        int i = 0;
        while (!pq.isEmpty()) {
            Integer num = pq.poll();
            result[i] = num;
            i++;
        }
        return result;
    }
}
