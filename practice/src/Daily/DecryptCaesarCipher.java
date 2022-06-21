package Daily;

public class DecryptCaesarCipher {
    public static void main(String[] args) {
        String output = solution("khoor", 3);
        System.out.println(output); // --> hello

        output = solution("zruog", 3);
        System.out.println(output); // --> world
    }

    public static String solution(String str, int secret) {
        if (str.isEmpty()) return str;

        StringBuilder sb = new StringBuilder();
        for (char c: str.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                if (c-secret < 97) {
                    c += 26;
                }
                c -= secret;
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
