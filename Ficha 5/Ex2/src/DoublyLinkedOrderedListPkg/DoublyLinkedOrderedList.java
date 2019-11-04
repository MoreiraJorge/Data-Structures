package DoublyLinkedOrderedListPkg;

import Interfaces.OrderedListADT;

import java.util.Iterator;

public class DoublyLinkedOrderedList<T extends Comparable> extends DoublyLinkedList<T>
        implements OrderedListADT<T> {

    public DoublyLinkedOrderedList() {
    }

    @Override
    public void add(T element) {
        DoubleNode<T> newNode = new DoubleNode<>(element);
        DoubleNode<T> current = this.head;

        if (isEmpty()) {
            this.head = newNode;
            this.tail = this.head;

        } else {

            boolean found = false;
            Iterator<T> itr = iterator();

            while (found == false) {

                if (itr.next().compareTo(newNode.getElement()) > 0) {
                    found = true;
                } else {
                    current = current.getNext();
                }

            }

            if (found = true) {
                if (current == this.head) {

                    DoubleNode<T> olderHead = this.head;
                    this.head = newNode;
                    this.head.setNext(olderHead);
                    olderHead.setPrevious(this.head);

                } else {
                    DoubleNode<T> previous = current.getPrevious();

                    previous.setNext(newNode);
                    current.setPrevious(newNode);

                    newNode.setPrevious(previous);
                    newNode.setNext(current);
                }

            } else {
                DoubleNode<T> olderTail = this.tail;
                this.tail = newNode;
                this.tail.setPrevious(olderTail);
                olderTail.setNext(this.tail);
            }

        }
        size++;
    }
}
