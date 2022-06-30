package Daily;

public class Power {
    public static void main(String[] args) {
        long output = solution(3, 40);
        System.out.println(output % 94906249) ; // --> 19334827
    }

    public static long solution(int base, int exponent) {
        if (exponent == 0)	return 1;

        long answer = 1;
        for (int i=1; i<= exponent; i++) {
            answer = (answer * base) % 94906249;
        }
        return answer;
    }
}
