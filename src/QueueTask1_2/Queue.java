package QueueTask1_2;

interface Queue {

    void enqueue (Object element);
    Object element();
    Object dequeue();
    int size();
    boolean isEmpty();
    void clear();

}
