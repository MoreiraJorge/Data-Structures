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
            size++;
        } else {

            boolean found = false;
            Iterator<T> itr = iterator();

            while (current != this.tail && found == false) {

                if (itr.next().compareTo(newNode.getElement()) > 0) {
                    found = true;
                } else {
                    current = current.getNext();
                }

            }

            System.out.println("");

            if (found == false) {
            }

            size++;
        }
    }
}
