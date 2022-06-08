package Daily;

public class InsertDash {
    public static void main(String[] args) {
        String output = solution("454793");
        System.out.println(output); // --> 4547-9-3
    }

    public static String solution(String str) {
        if (str.equals(""))   return null;
        StringBuilder sb = new StringBuilder();
        for (int i=1; i < str.length(); i++) {
            int j = str.charAt(i-1) -'0';
            int k = str.charAt(i) -'0';
            sb.append(j);
            if (j % 2 == 1 && k % 2 == 1)
                sb.append("-");
        }
        sb.append(str.charAt(str.length()-1));
        return sb.toString();
    }
}
