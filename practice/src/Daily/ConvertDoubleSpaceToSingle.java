package Daily;

public class ConvertDoubleSpaceToSingle {
    public static void main(String[] args) {
        String output = solution("string  with  double  spaces");
        System.out.println(output); // --> "string with double spaces"
    }

    public static String solution(String str) {
        return str.replaceAll("  ", " ");
    }
}
