package DS;

import java.util.*;
import java.util.stream.Collectors;

public class QueuePrinter {
    public int main(int bufferSize, int capacities, int[] documents) {
        LinkedList<Integer> buffer = new LinkedList<>();
        for (int i = 0; i < bufferSize; i++) {
            buffer.add(0);
        }
        int second = 0;
        LinkedList<Integer> document = Arrays.stream(documents).boxed().collect(Collectors.toCollection(LinkedList::new));
        while (!document.isEmpty()) {
            second++;
            buffer.removeFirst();
            int bufferCapacity = 0;
            for (int capacity : buffer) {
                bufferCapacity += capacity;
            }
            if (bufferCapacity + document.element() <= capacities) {
                buffer.add(document.removeFirst());
            } else {
                buffer.add(0);
            }
        }
        second += bufferSize;
        return second;
    }
}