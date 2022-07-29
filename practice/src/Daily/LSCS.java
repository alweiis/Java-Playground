package Daily;

public class LSCS {
    public static void main(String[] args) {
        int output = solution(new int[]{1, 2, 3});
        System.out.println(output); // --> 6

        output = solution(new int[]{1, 2, 3, -4});
        System.out.println(output); // --> 6 ([1, 2, 3])

        output = solution(new int[]{1, 2, 3, -4, 5});
        System.out.println(output); // --> 7 ([1, 2, 3, -4, 5])

        output = solution(new int[]{10, -11, 11});
        System.out.println(output); // --> 11 ([11])
    }

    public static int solution(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i=0; i < arr.length; i++) {
            int tmp = arr[i];
            if (tmp > max)  max = tmp;
            for (int j= i + 1; j < arr.length; j++) {
                tmp += arr[j];
                if (tmp > max)  max = tmp;
            }
        }
        return max;
    }
}
