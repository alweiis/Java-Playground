package Daily;

public class SuperIncreasing {
    public static void main(String[] args) {
        boolean output = solution(new int[]{1, 3, 6, 13, 54});
        System.out.println(output); // --> true

        output = solution(new int[]{1, 3, 5, 9});
        System.out.println(output); // --> false
    }

    public static boolean solution(int[] arr) {
        // 배열의 두번째 원소부터 이전 원소들의 합(sum)과 비교한다.
        // 비교해서 원소의 합(sum)보다 크면 합계에 해당 원소를 더한다.
        //     해당 원소가 합보다 작거나 같으면 false를 리턴한다.
        // 반복문이 종료되기 전까지 false를 리턴하지 않으면 반복문이 종료되고 true를 리턴한다.
        int sum = arr[0];
        for (int i=1; i<arr.length; i++) {
            if (sum >= arr[i]) return false;
            sum += arr[i];
        }
        return true;
    }
}
