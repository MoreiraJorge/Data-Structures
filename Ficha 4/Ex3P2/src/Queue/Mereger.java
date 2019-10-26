package Queue;

public class Mereger<T extends Comparable> {

    private SortedLinkedQueue<T> a = new SortedLinkedQueue<>();
    private SortedLinkedQueue<T> b = new SortedLinkedQueue<>();
    private SortedLinkedQueue<T> c = new SortedLinkedQueue<>();

    public Mereger(SortedLinkedQueue<T> a, SortedLinkedQueue<T> b) {
        this.a = a;
        this.b = b;
    }

    public SortedLinkedQueue merger(SortedLinkedQueue a, SortedLinkedQueue b){
        while(!a.isEmpty() || !b.isEmpty()){
            if (!a.isEmpty())
                this.c.enqueue(a.dequeue());
            if (!b.isEmpty())
                this.c.enqueue(b.dequeue());
        }
        return this.c;
    }

}
