package BinaryTree;

public interface MaxHeapADT<T> extends BinaryTreeADT<T> {

    /**
     * Adds the specified object to this heap.
     * @param obj the element to added to this head
     */
    public void addElement(T obj);

    /**
     * Removes element with the highest value from this heap.
     * @return the element with the lowest value from this heap
     */
    public T removeMax() throws BinaryTreeExceptions;

    /**
     * Returns a reference to the element with the Highest value in
     * this heap.
     *
     * @return a reference to the element with the Highest value
     * in this heap
     */
    public T findMax();
}
