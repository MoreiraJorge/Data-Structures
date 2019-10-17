package Exceptions;

public class EmptyCollectionException extends Exception {

    public static String MESSAGE = "Stack Vazia!!";

    public EmptyCollectionException() {
    }

    public EmptyCollectionException(String message) {
        super(message);
    }
}
