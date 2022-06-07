package Daily;

import java.util.ArrayList;

public class ABCheck {

    public static void main(String[] args) {
        boolean output = solution("HK9J6YjrAcMbq8qKrbS3EaPRT");
        System.out.println(output);
    }

    public static boolean solution(String str) {
        // 1. 'a'로 시작해서 'b'로 끝나는 길이 5의 문자열
        // 2. 'b'로 시작해서 'a'로 끝나는 길이 5의 문자열
        // 1번과 2번의 문자열이 입력값이 포함하고 있는지 체크

        str = str.toLowerCase();
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i=0; i < str.length(); i++) {
            if ((str.charAt(i) == 'a' || str.charAt(i) == 'b') && i+5 < str.length()) {
                arrayList.add(str.substring(i, i+5));
            }
        }
        for (String chk : arrayList) {
            if (chk.startsWith("a") && chk.endsWith("b") || chk.startsWith("b") && chk.endsWith("a")) {
                return true;
            }
        }
        return false;
    }
}
