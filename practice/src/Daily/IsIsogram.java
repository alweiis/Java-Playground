package Daily;

public class IsIsogram {
    public static void main(String[] args) {
        boolean output = solution("aba");
        System.out.println(output); // false

        output = solution("Dermatoglyphics");
        System.out.println(output); // true
    }

    public static boolean solution(String str) {
        if ("".equals(str))	return true;
        str = str.toLowerCase();
        for (int i=0; i < str.length()-1; i++) {
            for (int j=i+1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) return false;
            }
        }
        return true;
    }
}
