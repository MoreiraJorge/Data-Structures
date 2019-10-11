public class LinkedList<T> {

    private int counter;

    private LinearNode<T> head, tail;


    LinkedList(){
        this.head = null;
        this.tail = null;
    }

    /**
     *
     * @param data
     * @return
     */
    public boolean addElement(T data){

        LinearNode newNode = new LinearNode<>(data, null);

        if(this.head == null){
            this.head = newNode;
            this.tail = head;
            return true;
        } else{ //se ja existir 1 elemento
            LinearNode<T> current = this.tail;
            current.setNext(newNode);
            this.tail = newNode;
        }
        counter++;
        return false;
    }

    public void remove(T data) {
        LinearNode current = this.head;
        LinearNode previous = null;

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

        LinearNode Node = this.head;
        do {
            // Print da informação
            System.out.print(Node.toString() + "\n");

            Node = Node.getNext();

        }while (Node != null);
    }
}
