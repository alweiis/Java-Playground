package Daily;

public class NumberSearch {
    public static void main(String[] args) {
        int output = solution("Hello6 ");
        System.out.println(output); // --> 1

        output = solution("Hello6 9World 2,");
        System.out.println(output); // --> 2

        output = solution("Hello6 9World 2, Nic8e D7ay!");
        System.out.println(output); // --> 2
    }

    public static int solution(String str) {
        if (str.equals(""))	return 0;

        double answer = 0;
        int strLength = 0;
        for (int i=0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                answer += Character.getNumericValue(str.charAt(i));
            }
            if (Character.isAlphabetic(str.charAt(i))) {
                ++strLength;
            }
        }
        answer /= strLength;
        return (int) Math.round(answer);
    }
}
