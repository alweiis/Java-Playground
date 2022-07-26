package Daily;

public class BinarySearch {

    public static void main(String[] args) {
        int output = solution(new int[]{0, 1, 2, 3, 4, 5, 6}, 2);
        System.out.println(output); // --> 2

        output = solution(new int[]{4, 5, 6, 9}, 100);
        System.out.println(output); // --> -1
    }

    public static int solution(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int middle = (start + end) / 2;
            if (arr[middle] == target) {
                return middle;
            } else if (arr[middle] < target) {
                start = middle + 1;
            } else if (arr[middle] > target) {
                end = middle - 1;
            }
        }
        return -1;
    }
}
