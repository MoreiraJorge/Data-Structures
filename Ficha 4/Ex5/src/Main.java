import Encoder.Encode;
import Exceptions.WrongKeyInputException;

public class Main {
    public static void main(String[] args) {
        Encode ed = new Encode();
        try {

            ed.ask();

        } catch (Exception e) {
        System.out.println(e.getMessage());;
    }
    }
}
