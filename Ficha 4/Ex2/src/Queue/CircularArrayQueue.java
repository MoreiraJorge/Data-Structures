package Queue;

import Interfaces.QueueADT;

public class CircularArrayQueue<T> implements QueueADT<T> {

    private final int DEFAULT_CAPACITY = 10;
    private T[] circular;
    private int front, rear;
    private int size = 0;

    public CircularArrayQueue() {
        circular = (T[]) (new Object[DEFAULT_CAPACITY]);
        front = rear = 0;
    }

    @Override
    public void enqueue(T element) {
        if (size() == circular.length) {
            expandCapacity();
            this.front = 0;
            this.rear = size();
            circular[rear] = element;
            rear = (rear + 1) % circular.length;
            size++;
        } else {
            circular[rear] = element;
            rear = (rear + 1) % circular.length;
            size++;
        }

    }

    @Override
    public T dequeue() {
        if(size() == 0){
            System.out.println("Empty array!!");
            return null;
        } else if(size() == 1){
            T tmp = circular[front];
            this.front = this.rear = 0;
            size--;
            return tmp;
        } else {
            T tmp = circular[front];
            circular[front] = null;
            front = (front + 1) % circular.length;
            size--;
            return tmp;
        }
    }

    @Override
    public T first() {
        if (size() == 0) {
            return null;
        } else {
            return circular[front];
        }
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public int size() {
        return size;
    }

    private void expandCapacity() {
        T[] tmp = (T[]) (new Object[circular.length + DEFAULT_CAPACITY]);
        for (int i = 0; i < circular.length; ++i) {
            tmp[i] = circular[i];
        }
        circular = tmp;
    }

    public String toString() {
        String text = "";
        int start = front;

        while (start != rear) {
            text += "\n" + circular[start].toString();
            start = (start + 1) % circular.length;
        }

        return text;
    }

}
