package Daily;

import java.util.*;

public class ConvertListToHashMap {
    public static void main(String[] args) {
        String[][] arr = new String[][]{
                {"make", "Ford"},
                {"model", "Mustang"},
                {"year", "1964"},
                {"make", "Bill"}
        };
        HashMap<String, String> output = solution(arr);
        System.out.println(output);
    }

    public static HashMap<String, String> solution(String[][] arr) {
        if (arr.length == 0 )   return new HashMap<>();

        HashMap<String, String> hashMap = new LinkedHashMap<>();
        for (String[] ele: arr) {
            if (ele.length != 0) {
                String key = ele[0];
                String value = ele[1];
                if (!hashMap.containsKey(key))  hashMap.put(key, value);
            }
        }
        return hashMap;
    }
}
