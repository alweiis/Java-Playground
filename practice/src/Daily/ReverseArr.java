package Daily;

import java.util.Arrays;

public class ReverseArr {
    public static void main(String[] args) {
        int[] output = solution(new int[]{1, 2, 3});
        System.out.println(Arrays.toString(output)); // --> [3, 2, 1]
    }

    public static int[] solution(int[] arr){
        if(arr.length == 0) return new int[]{};
        int[] head = Arrays.copyOfRange(arr, arr.length-1, arr.length);
        int[] tail = solution(Arrays.copyOfRange(arr, 0, arr.length-1));

        int[] dest = new int[head.length + tail.length];
        System.arraycopy(head, 0, dest, 0, head.length);
        System.arraycopy(tail, 0, dest, head.length, tail.length);
        return dest;
    }
}
