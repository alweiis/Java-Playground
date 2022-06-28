package Daily;

public class IsSubsetOf {
    public static void main(String[] args) {
        int[] base = new int[]{1, 2, 3, 4, 5};
        int[] sample = new int[]{1, 3};
        boolean output = solution(base, sample);
        System.out.println(output); // --> true

        sample = new int[]{6, 7};
        output = solution(base, sample);
        System.out.println(output); // --> false

        base = new int[]{10, 99, 123, 7};
        sample = new int[]{11, 100, 99, 123};
        output = solution(base, sample);
        System.out.println(output); // --> false
    }

    public static boolean solution(int[] base, int[] sample) {
        boolean answer = true;
        for (int k : sample) {
            int flag = 0;
            for (int i : base) {
                if (k == i) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                answer = false;
                break;
            }
        }
        return answer;
    }
}
