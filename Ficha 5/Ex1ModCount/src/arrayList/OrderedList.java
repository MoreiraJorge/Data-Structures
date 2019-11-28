package arrayList;

import Interfaces.OrderedListADT;

import java.util.Iterator;

public class OrderedList<T> extends ArrayList<T>
        implements OrderedListADT<T> {

    public OrderedList() {
    }

    @Override
    public void add(T element) {
        if(element instanceof Comparable) {

            if (isEmpty()) {
                array[0] = element;

            } else {

                boolean found = false;

                int current = 0;

                while (current < size() && found == false) {
                    Comparable<T> tmp = (Comparable<T>) array[current];
                    if (tmp.compareTo(element) > 0) {
                        found = true;
                    } else {
                        current++;
                    }
                }

                if (found = true) {
                    for (int i = rear - 1; i >= current; i--) {
                        array[i + 1] = array[i];
                    }
                    array[current] = element;
                } else {
                    array[rear] = element;
                }
            }
            rear++;
            modCount++;
        } else {
            System.out.println("Elemento não é comparable!!!");
        }
    }

}
