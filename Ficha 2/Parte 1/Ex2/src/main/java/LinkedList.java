public class LinkedList<T> {

    private int counter;

    private Node<T> head, tail;
    private Node<T> sentinel = new Node<>(null,null);


    LinkedList(){
        head.setNext(sentinel);
        sentinel.setPrevious(head);
    }

    /**
     *
     * @param data
     * @return
     */
    public void addElement(T data){

        Node newNode = new Node<>(data, null);

        if(sentinel.getNext() == null){
            sentinel.setNext(newNode);
        }
        counter++;
    }

    public void remove(T data) {
        Node current = this.head;
        Node previous = null;

        /**
         * Ciclo para verificar todos os nodes que não referenciem null
         * quando apanhar um que referencie null, o ciclo para
         */
        for (int i = 0; i <= counter; i++) {

            /**
             * Guardar o previous sempre que o current for diferente do
             * inserido pelo user
             */
            if(current.getData() != data){
                previous = current;
            }

            if(head.getData() == data){ //remover o primeiro
                head = current.getNext();
                counter--;
            } else if(current.getData() == data && current.getNext() == tail.getNext()){ //remover o ultimo
                tail = previous;
                tail.setNext(null);
                counter--;
            } else if(current.getData() == data){ //remover do meio
                previous.setNext(current.getNext());
                counter--;
            }

            /**
             * Andar para a frente com o current pra manter o ciclo a funcionar
             *
             */
            current = current.getNext();
        }
    }

    public void printList(){

        Node Node = sentinel;
        for(int i = 0; i <= counter && Node.getData() != sentinel.getData(); i++) {
            // Print da informação
            System.out.print(Node.toString() + "\n");

            Node = Node.getNext();
        }

    }
}