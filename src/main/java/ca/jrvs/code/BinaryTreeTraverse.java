package ca.jrvs.code;
/**
 * Binary search tree Traversals
 * Inorder: Left, Root, Right
 * Preorder: Root,Left, Right
 * Postorder: Left, Right, Root
 */

public class BinaryTreeTraverse {

    class Node
    {
        int key;
        Node left, right;

        public Node(int key) {
            this.key = key;
            left = right = null;
        }
    }

    Node node;

    public BinaryTreeTraverse() {
    }

     void insert(int key)
    {
        node = insertRec(key);
    }

    Node insertRec(int key)
    {
        if(node == null)
            return node;
        if(key < node.key)
            node.left = insertRec(key);
        else if (key > node.key)
            node.right = insertRec(key);
        return node;

    }

    /**
     * tre traversal for preorder
     */
    void preorder(int key)
    {
        preRec(node);
    }

    void preRec(Node node)
    {
        if(node!=null)
            System.out.println(node.key);
        preRec(node.left);
        preRec(node.right);
    }

    /**
     * inorder traversal
     * @param key
     */
    void inroder(int key)
    {
        inrderRec(node);
    }

    void inrderRec(Node node)
    {
        if(node!=null)
            inrderRec(node.left);
        System.out.println(node.key);
        inrderRec(node.right);
    }

    /**
     * postorder traversal
     * @param key
     */

    void postorder(int key)
    {
        postRec(node);
    }

    void postRec(Node node)
    {
        if(node!=null)

        preRec(node.left);
        preRec(node.right);
        System.out.println(node.key);
    }
public static void main(String[] args)
{
    BinaryTreeTraverse binaryTreeTraverse = new BinaryTreeTraverse();
}

}
