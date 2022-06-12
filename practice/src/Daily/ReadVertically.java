package Daily;

public class ReadVertically {
    public static void main(String[] args) {
        String[] input = new String[]{"YCDt", "oao", "unI"};
        String output = solution(input);
        System.out.println(output); // --> "YouCanDoIt"

        input = new String[]{
                "hi",
                "world",
        };
        output = solution(input);
        System.out.println(output); // --> "hwiorld"
    }

    public static String solution(String[] arr) {
        int maxLength = 0;
        for (String s : arr) {
            if (maxLength < s.length()) {
                maxLength = s.length();
            }
        }
        String[] temp = new String[maxLength];

        for (String s : arr) {
            for (int j = 0; j < s.length(); j++) {
                if (temp[j] == null) {
                    temp[j] = Character.toString(s.charAt(j));
                } else {
                    temp[j] = temp[j] + s.charAt(j);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (String s : temp) {
            sb.append(s);
        }
        return sb.toString();
    }
}
