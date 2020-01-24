package Demo;

import BinaryTree.BinaryTreeExceptions;
import BinaryTree.MaxLinkedHeap;

import java.util.Iterator;

public class Demo {

    public static void tests(int test) throws BinaryTreeExceptions {
        MaxLinkedHeap<Integer> tree = new MaxLinkedHeap();
        Iterator<Integer> itr;

        switch (test) {
            // Teste para o add
            case 1:
                tree.addElement(3);
                tree.addElement(2);
                tree.addElement(1);
                tree.addElement(6);
                tree.addElement(5);
                tree.addElement(4);
                itr = tree.iteratorLevelOrder();
                while (itr.hasNext()) {
                    System.out.println(itr.next());
                }
                break;
            case 2:
                tree.addElement(6);
                tree.addElement(4);
                tree.addElement(5);
                tree.addElement(3);
                tree.addElement(2);
                tree.addElement(1);
                System.out.println("Excpeted 1. Result : " + tree.removeMax());
                itr = tree.iteratorLevelOrder();
                while (itr.hasNext()) {
                    System.out.println(itr.next());
                }
                break;
            case 3:
                tree.addElement(6);
                tree.addElement(4);
                tree.addElement(4);
                tree.addElement(3);
                tree.addElement(2);
                tree.addElement(1);
                tree.addElement(4);
                tree.addElement(4);
                tree.addElement(4);
                tree.addElement(5);
                tree.addElement(4);
                tree.addElement(4);
                System.out.println("Excpeted 6. Result : " + tree.removeMax());
                Iterator<Integer> it = tree.iteratorLevelOrder();
                while (it.hasNext()) {
                    System.out.println(it.next());
                }
                System.out.println("Excepted : 5. Result : " + tree.findMax());
            default:
                break;
        }

    }

    public static void main(String[] args) throws BinaryTreeExceptions {
        Demo.tests(1);
    }
}
