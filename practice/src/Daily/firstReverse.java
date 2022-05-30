package Daily;

public class firstReverse {
    public static void main(String[] args) {
        String output = solution("monday");
        System.out.println(output);
    }

    public static String solution(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
}