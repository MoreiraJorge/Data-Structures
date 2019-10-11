public class LinkedList<T> {

    private int counter;
    private LinearNode<T> head, tail;

    /**
     *
     */
    LinkedList(){
        this.head = null;
        this.tail = null;
    }

    /**
     *
     * @param data
     * @return
     */
    public void addElement(T data){

        LinearNode newNode = new LinearNode<>(data);

        if(this.head == null){
            this.head = newNode;
            this.tail = this.head;
        } else{
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
        counter++;
    }

    /**
     *
     * @param data
     */
    public void remove(T data) {

        LinearNode current = this.head;
        LinearNode p = null;
        boolean found = false;

        while(current != null && found == false){

            if( current.getData() == data){
                System.out.println("Node found!");
                found = true;
            } else {
                p = current;
                current = current.getNext();
            }
        }


        if(this.head.getData().equals(data)) { //remover o primeiro
            this.head.setNext(current.getNext());
            this.head = current.getNext();
            counter--;

        }else if (current != this.tail && current.getData().equals(data)){ //remover do meio
            p.setNext(current.getNext());
            counter--;

        } else if(this.tail.getData() == data){//remover ultimo
            p.setNext(tail.getNext());
            this.tail = p;
            counter--;
        }

        /**
         * Ciclo para verificar todos os nodes que não referenciem null
         * quando apanhar um que referencie null, o ciclo para

        for (int i = 0; i <= counter; i++) {

            /**
             * Guardar o previous sempre que o current for diferente do
             * inserido pelo user

            if(current.getData() != data){
                previous = current;
            }

             else if(current.getData() == data && current.getNext() == tail.getNext()){ //remover o ultimo
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

            current = current.getNext();
        }
        */
    }

    /**
     * Imprimir todos os elementos da list
     */
    public void printList(){

        LinearNode Node = this.head;
        do {
            // Print da informação
            System.out.print(Node.toString() + "\n");

            Node = Node.getNext();

        }while (Node != null);
    }
}
