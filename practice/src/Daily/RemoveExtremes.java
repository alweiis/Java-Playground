package Daily;

import java.util.*;

public class RemoveExtremes {
    public static void main(String[] args) {
        String[] output = solution(new String[]{"a", "b", "c", "def"});
        System.out.println(Arrays.toString(output)); // --> ["a"', "b"]

        String[] output2 = solution(new String[]{"iAmLongest", "iAmNotShortest", "iAmLongest", "long"});
        System.out.println(Arrays.toString(output2)); // --> ["iAmLongest", "iAmLongest"]
    }

    public static String[] solution(String[] arr) {
        if(arr.length == 0)	return null;
        ArrayList<String> check = new ArrayList<>();

        int shortestLen = 20;
        int longestLen = 0;
        int shortestIdx = 0;
        int longestIdx = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() >= longestLen) {
                longestLen = arr[i].length();
                longestIdx = i;
            }
            if (arr[i].length() <= shortestLen) {
                shortestLen = arr[i].length();
                shortestIdx = i;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (i != shortestIdx && i != longestIdx)
                check.add(arr[i]);
        }
        String[] ans = check.toArray(new String[check.size()]);
        return ans;
    }
}



