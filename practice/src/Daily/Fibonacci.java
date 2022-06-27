package Daily;

public class Fibonacci {
    public static void main(String[] args) {
        int output = solution(0);
        System.out.println(output); // --> 0

        output = solution(1);
        System.out.println(output); // --> 1

        output = solution(5);
        System.out.println(output); // --> 5

        output = solution(9);
        System.out.println(output); // --> 34
    }

    static int[] memo;
    public static int solution(int num) {
        memo = new int[num+1];
        return recursive(num);
    }

    private static int recursive(int n) {
        if (n <= 1) {
            return n;
        } else if (memo[n] != 0)  {
            return memo[n];
        } else {
            return memo[n] = recursive(n - 1) + recursive(n - 2);
        }
    }
}
