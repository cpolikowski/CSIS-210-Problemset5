import javafx.scene.Node;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Write a description of class Tree here.
 *
 * @author Cameron Polikowski & Kade Garrison
 * @version 4/26/22
 */
public class BST <T extends Comparable>
{
    private Node root;

    /**
     * Constructs an empty binary search tree (BST).
     */
    public BST() 
    {
        root = null;
    }

    /**
     * Inner class representing one node in a BST.
     */
    private class Node <T extends Comparable>
    {
        private T data;
        private Node left;
        private Node right;

        /**
         * Constructs a node with a value and left and right
         * references.
         * 
         * @param data The data value for the node.
         * @param left A reference to the child of the node or
         * null if this node has no left child.
         * @param right A reference to the right child of the
         * node or null if this node has no right child.
         */
        private Node(T data, Node left, Node right) 
        {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    // We should throw these into arrays and use pre order to compare the numbers. Using pre order if the numbers match in the array 
    // with their data at matching indexes then that means their shape is correct as well. 
    // For equals, all we would need to do is see if the every number is found in both arrays.

    public ArrayList<T> preOrder(Node node, ArrayList<T> array){
        if (node == null) {
            return array;
        }
        array.add((T)node.data);
        preOrder(node.left, array);
        preOrder(node.right, array);
        return array;
    }

    // not sure what to use for the tree part of the first array that involves the original tree
    public boolean equals(BST treeCompare){
        // stores all the data of the first tree in an array for comparing
        ArrayList<T> array1 = new ArrayList<T>();
        preOrder(root, array1);

        // stores all the data of the second tree into an array so we can compare it to the first
        ArrayList<T> array2 = new ArrayList<T>();
        treeCompare.preOrder(treeCompare.root, array2);

        boolean flagForLoop = false;

        if (root == null && treeCompare.root == null) {
            return true;
        }

        for(int i = 0; i < array1.size(); i++){
            for (int j = 0; j < array2.size(); j++){
                if (array1.get(i).equals(array2.get(j))) {
                    flagForLoop = true;
                    j = array2.size() + 1;
                } else if (flagForLoop == false && j == array2.size() - 1)  {
                    flagForLoop = false;
                    i = array1.size() + 1;
                }
            }
            if (flagForLoop = true && i != array1.size() - 1) {
                flagForLoop = false;
            } else {
                flagForLoop = true;
            }
        }
        return flagForLoop;
    }

    public boolean shapeEquals(BST treeCompare){
        // stores all the data of the first tree in an array for comparing
        ArrayList<T> array1 = new ArrayList<T>();
        preOrder(root, array1);

        // stores all the data of the second tree into an array so we can compare it to the first
        ArrayList<T> array2 = new ArrayList<T>();
        treeCompare.preOrder(treeCompare.root, array2);

        for (int i = 0; i < array1.size(); i++){
            if(!(array1.get(i).equals(array2.get(i)))){
                return false;
            }
        }

        return true;
    }

    /**
     * Adds the value to the tree maintianing the BST
     * property that for every tree node n, all values in n's left
     * subtree are less than or equal to n's data value and all values
     * in n's right subtree are larger.
     * 
     * @param value The value to be added to the BST.
     */ 

    public void add(T value) 
    {
        if (root == null) {
            root = new Node(value, null, null);
        } else {
            recursiveAdd(value, root);
        }
    }

    /**
     * Recursive method to add a value to a BST with root n.
     * 
     * Precondition: n is not null
     * @param value The value to be added to the BST.
     * @param n The root of the BST.
     */ 
    private void recursiveAdd(T value, Node n) 
    {
        if ((value.compareTo(n.data) >= 1) && (n.right == null)) {
            // value is added as the right child of n
            n.right = new Node(value, null, null);
        }
        else if (((value.compareTo(n.data) <= -1) || (value.compareTo(n.data) == 0)) && (n.left == null)) {
            // value is added as the left child of n
            n.left = new Node(value, null, null);
        }
        else if ((value.compareTo(n.data) >= 1) && (n.right != null)) {
            // insert value into n's right subtree
            recursiveAdd(value, n.right);
        }
        else {
            // the following is true: ((value <= n.data) && (n.left != null))
            // insert value into n's left subtree
            recursiveAdd(value, n.left);
        }
    }

    /**
     * Prints the values in the BST.
     */
    public String toString() 
    {
       if (root == null) {
           return "";
       } else {
           return toStringInOrder(root);
       }
    }

    /**
     * Recursively prints the values in the BST whose root is n.
     * 
     * @param n The root of the tree (or subtree).
     */
    
    private String toStringInOrder(Node n) 
    {
        if (n == null) {
            return "";
        }
        
        String toString = "";
        toString = toString + toStringInOrder(n.left);
        toString = toString + n.data + " ";
        toString = toString + toStringInOrder(n.right);
        
        return toString;
    }
    

    /**
     * Returns the number of leaves in the BST.
     * 
     * @return The number of leaves in the BST.
     */
    public int numLeaves() 
    {    
        return numLeaves(root);
    }

    /**
     * Returns the number of leaves in the BST whose
     * root is node n.
     * 
     * @param The root of the BST (or subtree).
     * @return The number of leaves in the BST whose
     * root is node n.
     */
    private int numLeaves(Node n) 
    {
        //YOUR CODE HERE.

        if (n != null){
            if (n.left != null && n.right == null){
                return numLeaves(n.left);
            }

            if (n.right != null && n.left == null){
                return numLeaves(n.right);
            }

            if (n.left == null && n.right == null){
                return 1;
            }

            if (n.left != null && n.right != null){
                return (numLeaves(n.left) + numLeaves(n.right));
            }
        }
        return -1;
    }

    /**
     *  Returns true if the value exists in the BST and false
     *  otherwise.  Finds the value recursively.
     *  Call the recursive method appropriately.
     *
     * @param value The value to search for in the BST.
     * @return true If the value is found and false otherwise.
     */
    public boolean contains(T value) 
    {
        //YOUR CODE HERE.
        return contains(root, value);
    }

    /**
     *  Returns true if the value exists in the BST whose root
     *  is n and false otherwise.  Finds the value recursively.
     *
     * @param value The value to search for in the BST (or subtree)
     * whose root is n.
     * @return true If the value is found and false otherwise.
     */    
    private boolean contains(Node n, T value) 
    {
        if(n != null)
        {
            if(((T)(n.data)).compareTo((T)value) == 0){
                return true;
            }
            if(contains(n.left, value)){
                return true;
            }
            if(contains(n.right, value)){
                return true;
            }
        }
        return false;
    }

    /**
     * Returns the smallest value in the BST.
     * 
     * Precondition:  There is at least one node in the BST.
     * @return The smallest value in the BST.
     */
    public T getSmallest() 
    {
        return getSmallest(root);
    }

    /**
     * Returns the smallest value in the BST 
     * whose root is n.
     * 
     * @return The smasses value in the BST (or
     * subtree) whose root is n.
     */
    private T getSmallest(Node n) 
    {
        T small = (T)n.data; 
        if(n.left != null)
        {
            small = getSmallest(n.left);
        }
        return small;
    }

    /**
     * Adds the value to the BST. Uses an iterative
     * algorithm.
     * 
     * @param value The value to insert into the BST.
     */
    public void addIterative(T value) 
    {
        Node n = root;
        if (root == null) {
            root = new Node(value, null, null);
            return;
        }
        while (2 > 1) {
            if ((value.compareTo((T)n.data) > 0) && (n.right.equals(null))) {
                n.right = new Node(value, null, null);
                return;
            }
            else if ((value.compareTo(n.data) < 0) || (value.compareTo(n.data) == 0) && (n.left.equals(null))) {
                n.left = new Node(value, null, null);
                return;
            }
            else if ((value.compareTo(n.data) > 0) && (!(n.right.equals(null)))) {
                n = n.right;
            }
            else {
                n = n.left;
            }
        }
    }

    /**
     * Returns the largest value in the BST. Assumes the BST 
     * contains at least one value. 
     * 
     * @return the largest value in the (non-empty) BST.
     */
    public T getLargestIterative() {
        return getLargestIterative(root);
    }

    /**
     * Returns the largest value in the BST (or subtree) 
     * whose root is n. Uses an iterative algorithm.
     * 
     * Precondition:  The BST contains at least one value.  
     * @param n The root of BST being searched. 
     * @return The largest value in the BST (or subtree) whose
     * root is n.
     */
    private T getLargestIterative(Node n) 
    {
        Node temp = n;
        if (n.right.equals(null)) {
            return (T)n.data;
        }
        while (!(temp.right.equals(null))) {
            temp = temp.right;
        } 
        return (T)temp.data;
    }

    /**
     * Removes the largest value in the BST.  Uses an
     * iterative algorithm. 
     */
    public void removeLargestIterative() 
    {
        // Case 1 - removing from empty tree - do nothing

        if(!(root.equals(null))){
            if (root.right.equals(null)) {
                // Case 2 - root node stores largest value
                root = root.left;
            } else {
                // Case 3 - largest is not at the root
                removeLargestIterative(root);
            }
        }
    }

    /**
     * Removes the largest value in the BST whose root is n using
     * an iterative algorithm.
     * 
     * Precondition:  n is not null and n itself does not contain the 
     * largest value in its subtree. In other words, n.right != null. 
     * 
     * @param n The root of the BST (or subtree) whose largest value is 
     * removed.
     */
    private void removeLargestIterative(Node n) {
        Node temp = n;
        while (!(temp.right.right.equals(null))) {
            temp = temp.right;
        }

        if (temp.right.right.equals(null) && !(temp.right.left.equals(null))) {
            temp.right = temp.right.left;
        }
        else{
            temp.right = null;
        }
    }

    /**
     * Removes one copy of the value from the tree. If value is
     * not in tree, it does nothing.
     * 
     * @param value the value being removed
     */
    public void remove(T value) {
        // Step 1: Find a node containing the value - do this  
        // by moving current down the tree until it points to
        // a node containing the value is found, with 
        // parentOfCurrent trailing behind it.
        Node current = root;
        Node parentOfCurrent = null;

        //YOUR CODE FOR STEP 1 HERE.
        while (!(current.data.equals(value))){
            if (current.data.compareTo((T)value) < 0){
                parentOfCurrent = current;
                current = current.right;
            }

            if (current.data.compareTo((T)value) > 0){
                parentOfCurrent = current;
                current = current.left;
            }
        }
        //Step 2: Remove the node
        //At this point, current should refer to a node containing
        //the value, or it is null if the value is not in the tree.
        //And parentOfCurrent should refer to..well, the
        //parent of current:-)
        //

        //Case 1 - current is null, meaning the value is not in 
        //the tree - do nothing

        if(!(current.equals(null))){
            if (current.left.equals(null) && current.right.equals(null)) {
                //Case 2 - current node has no children
                //REMOVE THE SINGLE LINE COMMENTS AND COMPLETE THE MISSING CODE
                if (current.equals(root)) {
                    root = null;
                } else if (parentOfCurrent.left.equals(current)) {
                    parentOfCurrent.left = null;
                } else {
                    parentOfCurrent.right = null;
                }
            } else if (current.left.equals(null) || current.right.equals(null)) {
                //Case 3 - current node has only 1 child
                if (current.equals(root)) {
                    //YOUR CODE HERE.
                    if (!(current.right.equals(null))){
                        root = current.right;
                    }else if (!(current.left.equals(null))){
                        root = current.left;
                    }

                }
                else if (parentOfCurrent.left.equals(current)) {
                    //YOUR CODE HERE.
                    if (!(current.right.equals(null))){
                        parentOfCurrent.left = current.right;
                    }else{
                        parentOfCurrent.left = current.left;
                    }

                }
                else {
                    //YOUR CODE HERE.
                    if (!current.right.equals(null)){
                        parentOfCurrent.right = current.right;
                    }else{
                        parentOfCurrent.right = current.left;
                    }

                }
            } else if (!(current.left.equals(null)) && (!(current.right.equals(null)))) {
                // Case 4 - current has 2 children
                T temp = getLargestIterative(current.left);
                current.data = temp;
                removeLargestIterative(current.left);
            }
        }
    }
}
