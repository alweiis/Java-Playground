package Daily;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] output = solution(new int[]{3, 1, 21, 10, 16, 27, 5, 33});
        System.out.println(Arrays.toString(output)); // --> [1, 3, 5, 10, 16, 21, 27, 33]
    }

    public static int[] solution(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
        return arr;
    }

    private static void quickSort(int[] a, int lo, int hi) {
        if (lo >= hi)   return;
        int pivot = partition(a, lo, hi);
        quickSort(a, lo, pivot);
        quickSort(a, pivot + 1, hi);
    }

    private static int partition(int[] a, int left, int right) {
        int lo = left -1;
        int hi = right + 1;
        int pivot = a[(left + right) / 2];

        while (true) {
            while (a[++lo] < pivot);
            while (a[--hi] > pivot && lo <= hi);
            if (lo >= hi)   return hi;
            swap(a, lo, hi);
        }
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
