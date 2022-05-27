package DS;

import java.util.ArrayList;
import java.util.Stack;

public class BrowserStack {
    public ArrayList<Stack> main(String[] actions, String start) {
        Stack<String> prevStack = new Stack<>();
        Stack<String> nextStack = new Stack<>();
        Stack<String> current = new Stack<>();
        ArrayList<Stack> result = new ArrayList<>();

        current.add(start);
        for (String action:  actions) {
            if (action.matches("[A-Z]") ) {
                prevStack.add(current.pop());
                current.add(action);
                nextStack.clear();
            } else if (action.equals("-1")) {
                if (!prevStack.empty()) {
                    nextStack.push(current.pop());
                    current.push(prevStack.pop());
                }
            } else if (action.equals("1")) {
                if (!nextStack.empty()) {
                    prevStack.push(current.pop());
                    current.push(nextStack.pop());
                }
            }
        }
        result.add(prevStack);
        result.add(current);
        result.add(nextStack);
        return result;
    }
}
