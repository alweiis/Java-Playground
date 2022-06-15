package Daily;

public class Modulo {

    public static void main(String[] args) {
        Integer output = solution(25, 4);
        System.out.println(output); // --> 1

        output = solution(25, 0);
        System.out.println(output); // --> null
    }

    public static Integer solution(int num1, int num2) {
        if (num2 == 0)	return null;
        while (num1 - num2 >= 0) {
            num1 = num1 - num2;
        }
        return num1;
    }

}
