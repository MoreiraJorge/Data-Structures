
public class LinearNode<T> {

    private T data;
    private LinearNode<T> next;
    private LinearNode<T> previous;

    public LinearNode() {
    }

    /**
     * @param next
     */
    public LinearNode(T data, LinearNode<T> next) {
        this.next = next;
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

    public LinearNode<T> getPrevious() {
        return previous;
    }

    public void setPrevious(LinearNode<T> previous) {
        this.previous = previous;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String toString(){
        return data.toString();
    }
}
