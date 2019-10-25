package Exceptions;

public class WrongKeyInputException extends Exception{
    public static String MESSAGE = "Wrong Key Input";

    public WrongKeyInputException() {
    }

    public WrongKeyInputException(String message) {
        super(message);
    }
}
