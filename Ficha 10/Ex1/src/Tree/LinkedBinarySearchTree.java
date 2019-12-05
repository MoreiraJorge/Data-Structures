package Tree;

import Exceptions.ElementNotFoundException;
import Exceptions.EmptyListException;
import Interfaces.BinarySearchTreeADT;

import java.util.Iterator;

/**
 * @author morei
 */
public class LinkedBinarySearchTree<T> extends LinkedBinaryTree<T> implements BinarySearchTreeADT<T> {

    /**
     * Creates an empty binary search tree.
     */
    public LinkedBinarySearchTree() {
        super();
    }

    /**
     * Creates a binary search with the specified element as its root.
     *
     * @param element the element that will be the root of the new
     *                binary search tree
     */
    public LinkedBinarySearchTree(T element) {
        super(element);
    }

    @Override
    public void addElement(T element) {

        BinaryTreeNode<T> temp = new BinaryTreeNode<T>(element);
        Comparable<T> comparableElement = (Comparable<T>) element;

        if (isEmpty()) {
            root = temp;
        } else {

            BinaryTreeNode<T> current = root;
            boolean added = false;

            while (!added) {
                if (comparableElement.compareTo(current.element) < 0) {

                    if (current.left == null) {
                        current.left = temp;
                        added = true;
                    } else {
                        current = current.left;
                    }

                } else {

                    if (current.right == null) {
                        current.right = temp;
                        added = true;
                    } else {
                        current = current.right;
                    }

                }
            }
        }
        count++;
    }

    @Override
    public T removeElement(T targetElement) throws ElementNotFoundException, EmptyListException {
        T result = null;
        if (!isEmpty()) {

            if (((Comparable) targetElement).equals(root.element)) {
                result = root.element;
                root = replacement(root);
                count--;
            } else {
                BinaryTreeNode<T> current, parent = root;
                boolean found = false;

                if (((Comparable) targetElement).compareTo(root.element) < 0) {
                    current = root.left;
                } else {
                    current = root.right;
                }

                while (current != null && !found) {

                    if (targetElement.equals(current.element)) {

                        found = true;
                        count--;
                        result = current.element;

                        if (current == parent.left) {
                            parent.left = replacement(current);
                        } else {
                            parent.right = replacement(current);
                        }
                    } else {
                        parent = current;

                        if (((Comparable) targetElement).compareTo(current.element) < 0) {
                            current = current.left;
                        } else {
                            current = current.right;
                        }
                    }
                } //while

                if (!found) {
                    throw new ElementNotFoundException("Not found in binary search tree");
                }
            }
        } else {// end outer if
            throw new EmptyListException("list is empty");
        }
        return result;
    }

    /**
     * Returns a reference to a node that will replace the one
     * specified for removal. In the case where the removed node has
     * two children, the inorder successor is used as its replacement.
     *
     * @param node the node to be removeed
     * @return a reference to the replacing node
     */
    private BinaryTreeNode<T> replacement(BinaryTreeNode<T> node) {
        BinaryTreeNode<T> result = null;
        if ((node.left == null) && (node.right == null)) {
            result = null;

        } else if ((node.left != null) && (node.right == null)) {
            result = node.left;

        } else if ((node.left == null) && (node.right != null)) {
            result = node.right;

        } else {

            BinaryTreeNode<T> current = node.right;
            BinaryTreeNode<T> parent = node;

            while (current.left != null) {
                parent = current;
                current = current.left;
            }

            if (node.right == current) {
                current.left = node.left;

            } else {
                parent.left = current.right;
                current.right = node.right;
                current.left = node.left;
            }

            result = current;
        }
        return result;
    }

    @Override
    public void removeAllOccurrences(T targetElement) throws ElementNotFoundException, EmptyListException {
        Iterator itr = iteratorInOrder();
        int ocurrences = 0;

        while(itr.hasNext()){
            if(itr.next() == targetElement){
                ocurrences++;
            }
        }

        for(int i = 0; i < ocurrences; ++i){
           removeElement(targetElement);
        }
    }

    @Override
    public T removeMin() {
        return null;
    }

    @Override
    public T removeMax() {
        return null;
    }

    @Override
    public T findMin() {
        return null;
    }

    @Override
    public T findMax() {
        return null;
    }
}
