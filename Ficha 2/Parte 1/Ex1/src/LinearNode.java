
public class LinearNode<T> {

    private T data;
    private LinearNode<T> next;
    private LinearNode<T> previous;

    /**
     *
     */
    public LinearNode() {
    }

    /**
     *
     * @param data
     */
    public LinearNode(T data) {
        this.data = data;
    }

    /**
     * @return
     */
    public LinearNode<T> getNext() {
        return next;
    }

    /**
     * @param next
     */
    public void setNext(LinearNode<T> next) {
        this.next = next;
    }

    /**
     *
     * @return
     */
    public LinearNode<T> getPrevious() {
        return previous;
    }

    /**
     *
     * @param previous
     */
    public void setPrevious(LinearNode<T> previous) {
        this.previous = previous;
    }

    /**
     *
     * @return
     */
    public T getData() {
        return data;
    }

    /**
     *
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     *
     * @return
     */
    public String toString(){
        return data.toString();
    }
}
