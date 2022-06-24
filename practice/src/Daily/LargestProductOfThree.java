package Daily;

import java.util.Arrays;

public class LargestProductOfThree {
    public static void main(String[] args) {
        int output = solution(new int[]{2, 1, 3, 7});
        System.out.println(output); // --> 42 (= 2 * 3 * 7)

        output = solution(new int[]{-1, 2, -5, 7});
        System.out.println(output); // --> 35 (= -1 * -5 * 7)
    }

    public static int solution(int[] arr) {
        Arrays.sort(arr);
        int arrLength = arr.length;
        int candidate1 = arr[arrLength - 1] * arr[arrLength - 2] * arr[arrLength - 3];
        int candidate2 = arr[arrLength - 1] * arr[0] * arr[1];
        return Math.max(candidate1, candidate2);
    }
}
