package Daily;

import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        boolean output = solution("(");
        System.out.println(output); // // -> false

        output = solution("()");
        System.out.println(output); // --> true

        output = solution("'[(]{)}'");
        System.out.println(output); // --> false
    }

    public static boolean solution(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c: str.toCharArray()) {
            if (c == '(' || c == '[' || c == '{')   {
                stack.push(c);
            }
            else {
                if (stack.isEmpty())    return false;
                Character peek = stack.peek();
                if (c == ')' && peek == '(' || c == ']' && peek == '[' || c == '}' && peek == '{')
                    stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
