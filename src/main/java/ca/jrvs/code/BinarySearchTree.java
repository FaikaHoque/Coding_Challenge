package ca.jrvs.code;

/**
 * This program implement binary search tree. BST is a data strcuture which is used to store data in order
 * BST is a tree where the value of a left child is less than or equal to parent node and a value of the
 * right child is greater than or equal to parent node
 */

public class BinarySearchTree {

    /**
     * Create a class that contains left and right child of a current node
     * input is integer number
     */
    class Node{
        int key;
        Node left, right;

        public Node(int key) {
            this.key = key;
            left = null;
            right = null;
        }
    }
    // Root of binary search tree

    Node node;

   // constructor of binary search tree

    public BinarySearchTree() {
        node = null;
    }

    void insert(int key)
    {
        node = inserRec(node,key);
    }
    /**
     * inserRec funstion recursively insert an integer in a tree
     */
    Node inserRec(Node node, int key) {

        // if the node is null return s new node

        if (node == null) {
            node = new Node(key);
            return node;
        }

        // otherwise go down the tree

        if (key < node.key)
            node.left = inserRec(node.left, key);

        else if (key > node.key)
            node.right = inserRec(node.right, key);

        return node;

    }

    void inorder()
    {
        inorderTravel(node);
    }
    /**
     * funtion to traverse the tree inorder
     */
    void inorderTravel(Node node)
    {
        if(node!=null)
        {
            inorderTravel(node.left);
            System.out.println(node.key);
            inorderTravel(node.right);
        }
    }


    public static void main(String[] args)
    {
        BinarySearchTree binarySearchTree = new BinarySearchTree();

    }
}
