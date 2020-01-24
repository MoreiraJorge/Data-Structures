package Demo;


import BinaryTree.MinLinkedHeap;

import java.util.Iterator;

public class Main {

    public static void test(int test) throws EmptyListException, ElementNotFoundException, EmptyCollectionException {
        MinLinkedHeap<Integer> tree = new MinLinkedHeap();
        Iterator<Integer> itr;

        switch (test) {
            // Teste para o add
            case 1:
                tree.addElement(3);
                tree.addElement(5);
                tree.addElement(4);
                tree.addElement(8);
                tree.addElement(7);
                tree.addElement(9);

                itr = tree.iteratorLevelOrder();
                while (itr.hasNext()) {
                    System.out.println(itr.next());
                }
                break;
            case 2:
                tree.addElement(3);
                tree.addElement(5);
                tree.addElement(4);
                tree.addElement(8);
                tree.addElement(7);
                tree.addElement(9);
                System.out.println("Excpeted 3. Result : " + tree.removeMin());
                itr = tree.iteratorLevelOrder();
                while (itr.hasNext()) {
                    System.out.println(itr.next());
                }
                break;
            case 3:
                tree.addElement(6);
                tree.addElement(4);
                tree.addElement(5);
                tree.addElement(3);
                tree.addElement(2);
                tree.addElement(1);
                tree.addElement(5);
                tree.addElement(4);
                tree.addElement(6);
                tree.addElement(5);
                tree.addElement(4);
                tree.addElement(6);
                System.out.println("Excpeted 1. Result : " + tree.removeMin());
                Iterator<Integer> it = tree.iteratorLevelOrder();
                while (it.hasNext()) {
                    System.out.println(it.next());
                }
                System.out.println("Excepted : 2. Result : " + tree.findMin());
            default:
                break;
        }


    }

    public static void main(String[] args) throws EmptyListException, ElementNotFoundException, EmptyCollectionException {
        test(3);
    }
}
