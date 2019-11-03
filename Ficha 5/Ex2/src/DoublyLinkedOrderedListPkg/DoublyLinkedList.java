package DoublyLinkedOrderedListPkg;

import Interfaces.ListADT;

import java.util.Iterator;

public class DoublyLinkedList<T> implements ListADT<T> {

    private class DoublyLinkedListIterator<T> implements Iterator<T> {

        private DoubleNode<T> current = (DoubleNode<T>) head;

        @Override
        public boolean hasNext() {
            if (current.getNext() != null) {
                return true;
            }
            return false;
        }

        @Override
        public T next() {
            if (hasNext()) {
                T tmp = (T) current.getElement();
                current = current.getNext();
                return tmp;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    protected DoubleNode<T> head, tail;
    protected int size = 0;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    @Override
    public T removeFirst() {

        if(isEmpty()){
            return null;
        } else if(size() == 1){
            T tmp = (T) this.head;
            this.head = null;
            this.tail = null;
            size--;
            return tmp;
        } else {
            T tmp = (T) this.head;
            this.head = this.head.getNext();
            this.head.setPrevious(null);
            size--;
            return tmp;
        }

    }

    @Override
    public T removeLast() {
        if(isEmpty()){
            return null;
        } else if(size() == 1){
            T tmp = (T) this.head;
            this.head = null;
            this.tail = null;
            size--;
            return tmp;
        } else {
            T tmp = (T) this.tail;
            this.tail = tail.getPrevious();
            tail.setNext(null);
            size--;
            return tmp;
        }

    }

    @Override
    public T remove(T element) {

        DoubleNode<T> tmp = search(element);

        if (isEmpty() == true) {
            return null;
        }


        if (this.head.getElement() == tmp.getElement()) {
            return removeFirst();
        } else if (this.tail.getElement() == tmp.getElement()) {
            return removeLast();
        } else {
            tmp.getNext().setPrevious(tmp.getPrevious());
            tmp.getNext().getPrevious().setNext(tmp.getNext());

            return (T) tmp;
        }

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
        return (search(target) == target);
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
        DoublyLinkedListIterator itr = new DoublyLinkedListIterator<T>();
        return itr;
    }

    /**
     * Search a specific element and returns its Node
     *
     * @param target
     * @return i, -1
     */
    private DoubleNode<T> search(T target) {

        DoubleNode<T> current = this.head;
        if (isEmpty() == true) {
            return null;
        }

        while (current != null) {

            if (current.getElement() == target) {
                return current;
            } else {
                current = current.getNext();
            }

        }

        return null;
    }

    @Override
    public String toString() {

        Iterator<T> it = iterator();
        String text = "";

        if (isEmpty()) {
            return null;
        }

        while (it.hasNext()) {
            text += it.next().toString() + "\n";
        }

        text += this.tail.getElement().toString() + "\n";
        return text;
    }

}