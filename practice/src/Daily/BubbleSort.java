package Daily;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] output = solution(new int[]{2, 1, 3});
        System.out.println(Arrays.toString(output)); // --> [1, 2, 3]
    }

    public static int[] solution(int[] arr) {
        int arrLength = arr.length;
        for (int i=0; i < arrLength-1; i++) {
            int flag = 1;
            for (int j=0; j <= arrLength-2; j++) {
                if (arr[j] > arr[j+1]) {
                    swap(arr, j,j+1);
                    flag = 0;
                }
            }
            if (flag == 1) break;
        }
        return arr;
    }

    static void swap(int[] arr, int x, int y) {
        int tmp;
        tmp = arr[x];
        arr[x] = arr[y];
        arr[y] = tmp;
    }
}
