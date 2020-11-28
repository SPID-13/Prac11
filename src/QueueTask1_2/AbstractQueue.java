package QueueTask1_2;

abstract public class AbstractQueue implements Queue {

    public int size;
    public int head;
    public int tail;

    @Override
    abstract public void enqueue (Object element);

    @Override
    abstract public Object element();

    @Override
    abstract public Object dequeue();

    @Override
    abstract public int size();

    @Override
    abstract public boolean isEmpty();

    @Override
    abstract public void clear();

}
