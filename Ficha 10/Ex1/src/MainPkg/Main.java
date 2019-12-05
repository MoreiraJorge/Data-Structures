package MainPkg;


import Exceptions.ElementNotFoundException;
import Exceptions.EmptyListException;
import Tree.LinkedBinarySearchTree;

import java.util.Iterator;

public class Main {

    public static void test(int num) throws EmptyListException, ElementNotFoundException {
        LinkedBinarySearchTree<Integer> tree = new LinkedBinarySearchTree();
        Iterator<Integer> itr;

        switch(num){
            case 1:

                tree.addElement(3);
                tree.addElement(4);
                tree.addElement(2);
                tree.addElement(5);
                tree.addElement(1);
                tree.addElement(6);

                 itr = tree.iteratorInOrder();
                while(itr.hasNext()){
                    System.out.println(itr.next());
                }

                break;
            case 2:

                tree.addElement(3);
                tree.addElement(4);
                tree.addElement(2);
                tree.addElement(5);
                tree.addElement(1);
                tree.addElement(6);

                tree.removeElement(3);

                itr = tree.iteratorInOrder();
                while(itr.hasNext()){
                    System.out.println(itr.next());
                }

                break;
            default:
                break;
        }


    }


    public static void main(String[] args) throws EmptyListException, ElementNotFoundException {
        test(2);
    }
}
