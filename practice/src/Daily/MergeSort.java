package Daily;

import java.util.Arrays;

public class MergeSort {
    static int[] buff;

    public static void main(String[] args) {
        int[] output = solution(new int[]{5, 7, 11, 22, 30, 32, 68, 120});
        System.out.println(Arrays.toString(output)); // --> [5, 11, 22, 32, 68, 70, 120]
    }
    public static int[] solution(int[] arr) {
        int n = arr.length;
        buff = new int[n];
        mergeSort(arr, 0, n-1);
        return arr;
    }

    static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int i;
            int center = (left + right) / 2;
            int p = 0;
            int j = 0;
            int k = left;

            mergeSort(arr, left, center);
            mergeSort(arr, center + 1, right);

            for (i=left; i <= center; i++)
                buff[p++] = arr[i];

            while (i <= right && j < p)
                arr[k++] = (buff[j] <= arr[i]) ? buff[j++] : arr[i++];

            while (j < p)
                arr[k++] = buff[j++];
        }
    }
}
