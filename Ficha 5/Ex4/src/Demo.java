import Interfaces.UnorderedArrayListADT;
import UnorderedArrayListpkg.UnorderedArrayList;

public class Demo {

    /**
     * Static method to test everything, by giving a test number
     *
     * @param test
     */
    public static void test(int test) {
        UnorderedArrayListADT<Integer> olist = new UnorderedArrayList<>();

        switch (test) {
            case 1: //Ordered Add Test
                System.out.println(olist.toString());
                break;
            case 2: //Remove First test

                System.out.println(olist.toString());
                System.out.println("Remove First:" + "\n");
                olist.removeFirst();
                System.out.println(olist.toString());
                break;
            case 3: //Remove last test with 1 object

                System.out.println(olist.toString());
                System.out.println("Remove Last:" + "\n");
                olist.removeLast();
                System.out.println(olist.toString());
                break;
            case 4: //Remove last

                System.out.println(olist.toString());
                System.out.println("Remove Last:" + "\n");
                olist.removeLast();
                System.out.println(olist.toString());
                break;
            case 5://Remove chosen element (first)

                System.out.println(olist.toString());
                System.out.println("Remove Chosen(first):" + "\n");
                olist.remove(1);  //element to remove!!
                System.out.println(olist.toString());
                break;
            case 6://Remove chosen element (last)

                System.out.println(olist.toString());
                System.out.println("Remove Chosen(last):" + "\n");
                olist.remove(5); //element to remove!!
                System.out.println(olist.toString());
                break;
            case 7://Remove chosen element (Anyone in the middle)

                System.out.println(olist.toString());
                System.out.println("Remove Chosen(middle):" + "\n");
                olist.remove(3); //element to remove!!
                System.out.println(olist.toString());
                break;
            case 8: //Remove First test (1 object only)

                System.out.println(olist.toString());
                System.out.println("Remove First:" + "\n");
                olist.removeFirst();
                System.out.println(olist.toString());
            default:
                break;
        }

    }

    /**
     * Main method
     *
     * @param args
     */
    public static void main(String[] args) {
        test(1);
    }

}
