package Daily;

import java.util.ArrayList;

public class Tiling {
    public static void main(String[] args) {
        int output = solution(2);
        System.out.println(output); // --> 2

        output = solution(4);
        System.out.println(output); // --> 5
    }

    public static int solution(int num) {
        ArrayList<Integer> dp = new ArrayList<>();
        dp.add(0);
        dp.add(1);
        dp.add(2);
        dp.add(3);
        for (int i=4; i <= num; i++) {
            dp.add(dp.get(i - 1) + dp.get(i - 2));
        }
        return dp.get(num);
    }
}
