package DoublyLinkedOrderedListPkg;

import Interfaces.ListADT;

import java.util.Iterator;

public class DoublyLinkedList<T> implements ListADT<T> {

    private DoubleNode<T> head, tail;
    private int size = 0;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    @Override
    public T removeFirst() {
        T tmp = (T) this.head;
        head = head.getNext();
        head.setPrevious(null);
        return tmp;
    }

    @Override
    public T removeLast() {
        T tmp = (T) this.tail;
        this.tail = tail.getPrevious();
        tail.setNext(null);
        return tmp;
    }

    @Override
    public T remove(T element) {
        return null;
    }

    @Override
    public T first() {
        return head.getElement();
    }

    @Override
    public T last() {
        return tail.getElement();
    }

    @Override
    public boolean contains(T target) {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return (size() == 0);
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }


}
