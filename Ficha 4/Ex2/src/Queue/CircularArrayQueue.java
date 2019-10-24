package Queue;

import Interfaces.QueueADT;

public class CircularArrayQueue<T> implements QueueADT<T> {

    private final int DEFAULT_CAPACITY = 10;
    private T[] circular;
    private int front, rear;
    private int size = 0;

    CircularArrayQueue(){
        circular = (T[])(new Object[DEFAULT_CAPACITY]);
        front = rear = 0;
    }

    @Override
    public void enqueue(T element) {

    }

    @Override
    public T dequeue() {
        return null;
    }

    @Override
    public T first() {
        if()
        return circular[front];
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public int size() {
        return size;
    }

}
