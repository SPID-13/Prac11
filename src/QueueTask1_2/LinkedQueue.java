package QueueTask1_2;

import java.util.LinkedList;

public class LinkedQueue {
    private int size;
    private int head;
    private int tail;
    private int capacity;

    private LinkedList<Object> elements = new LinkedList<>();

    public LinkedQueue(int capacity) {
        this.capacity = capacity;
    }

    public void enqueue(Object element) {
        assert (element != null);

        elements.add(element);
        tail = (tail + 1) % capacity;
        size++;
    }

    public Object element() {
        assert (size > 0);

        return elements.get(head);
    }

    public Object dequeue() {
        assert (size > 0);

        Object temp = element();
        elements.set(head, null);
        head = (head + 1) % capacity;
        size--;
        return temp;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public void clear() {
        head = 0;
        tail = 0;
        size = 0;
    }
}

