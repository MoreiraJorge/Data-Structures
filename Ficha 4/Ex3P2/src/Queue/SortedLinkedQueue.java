package Queue;

import Interfaces.QueueADT;

public class SortedLinkedQueue<T extends Comparable> implements QueueADT {

    private LinearNode<T> front, rear;
    private int size = 0;

    public SortedLinkedQueue() {
        this.front = null;
        this.rear = null;
    }

    @Override
    public void enqueue(Object element) {

        if (size() == 0) {
            this.front = new LinearNode(element);
            this.front.setNext(null);
            this.rear = this.front;
        } else {

        }

    }

    @Override
    public Object dequeue() {
        T tmp = null;

        if (size() == 0) {
            return null;
        } else if (size() == 1) {
            tmp = this.front.getData();
            this.front = this.rear = null;
            size--;
            return tmp;
        } else {
            tmp = this.front.getData();
            this.front = front.getNext();
            size--;
            return tmp;
        }
    }

    @Override
    public Object first() {
        if (size() == 0) {
            return null;
        } else {
            return this.front.getData();
        }
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public String toString() {

        String text = "";
        LinearNode Node = this.front;

        if (Node != null) {
            while (Node != null) {
                text += "\n" + Node.toString();
                Node = Node.getNext();
            }
        } else {
            System.out.println("Empty QUEUE");
        }

        return text;
    }

}
