package DS;

import java.util.*;

public class PaveBox {
    public int main(Integer[] boxes) {
        LinkedList<Integer> queue = new LinkedList<>(Arrays.asList(boxes));
        int maxCount = 0;
        while (!queue.isEmpty()) {
            LinkedList<Integer> check = new LinkedList<>();
            for (Integer box: queue) {
                check.add(box - 1);
            }
            queue.clear();
            queue.addAll(check);
            int count = 0;
            while (!queue.isEmpty() && queue.element() <= 0) {
                queue.remove();
                count += 1;
            }
            if (count > maxCount) {
                maxCount = count;
            }
        }
        return maxCount;
    }
}