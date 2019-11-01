package arrayList;

import Interfaces.OrderedListADT;

import java.util.Iterator;

public class OrderedList<T extends Comparable> extends ArrayList<T>
        implements OrderedListADT<T> {

    public OrderedList() {
    }

    @Override
    public void add(T element) {

        if (isEmpty()) {
            array[0] = element;
            size++;
            rear++;
        } else {

            boolean found = false;
            Iterator<T> itr = iterator();
            int current = 0;

            while (current < size && found == false) {
                if (itr.next().compareTo(element) > 0) {
                    found = true;
                } else {
                    current++;
                }
            }

            if(found = true){
                for (int i = rear - 1; i >= current; i--) {
                    array[i + 1] = array[i];
                }
                array[current] = element;
            } else {
                array[rear] = element;
            }
            rear++;
            size++;
            modCount++;
        }
    }

}
