package Daily;

public class LetterCapitalize {
    public static void main(String[] args) {
        String output1 = solution("hello world");
        System.out.println(output1); // "Hello World"
        String output2 = solution("java  is good ");
        System.out.println(output2); // "Java  Is Good "
        String output3 = solution("    ");
        System.out.println(output3); // " "
    }

    public static String solution(String str) {
        if (str.length() == 0) return str;
        if (str.trim().length() == 0) return "";

        StringBuilder check = new StringBuilder();
        StringBuilder result = new StringBuilder();
        for (int i=0; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i))) {
                if (check.length() == 0) {
                    check.append(Character.toUpperCase(str.charAt(i)));
                } else {
                    check.append(str.charAt(i));
                }
            } else {
                if (check.length() != 0) {
                    result.append(check);
                    check = new StringBuilder();
                }
                result.append(str.charAt(i));
            }
        }
        if (check.length() != 0) {
            result.append(check);
        }
        return result.toString();
    }
}