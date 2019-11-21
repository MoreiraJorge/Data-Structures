package MyExceptions;

public class NodeNotFoundException extends Exception {
    public NodeNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}
