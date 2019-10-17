package MyExceptions;

public class EmptyListException extends Exception{
    public EmptyListException(String errorMessage) {
        super(errorMessage);
    }
}