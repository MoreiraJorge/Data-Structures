public class Node<T> {

    private T data;
    private Node<T> next;
    private Node<T> previous;

    public Node() {
    }

    /**
     * @param next
     */
    public Node(T data, Node<T> next) {
        this.next = next;
        this.data = data;
    }

    /**
     * @return
     */
    public Node<T> getNext() {
        return next;
    }

    /**
     * @param next
     */
    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getPrevious() {
        return previous;
    }

    public void setPrevious(Node<T> previous) {
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
