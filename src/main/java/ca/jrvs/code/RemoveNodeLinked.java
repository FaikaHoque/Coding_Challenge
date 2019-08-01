package ca.jrvs.code;
/**
 * Given a linked list, this program remove the nth node from the end of list and return its head
 */
public class RemoveNodeLinked {

    class Node{
        int key;
        Node next;

        public Node(int key) {
            this.key = key;
            next = null;
        }
    }
    Node head;

    void printNthFromLast(int n)
    {
        int len = 0;
        Node temp = head;
        while(temp != null)
        {
            temp = temp.next;
            len++;
        }

        if(len<n)
            return;

        temp = head;
        for (int i=1;i<=len-n; i++)
        {
            temp = temp.next;

        }
        System.out.println(temp.key);
    }
    public void insert(int key)
    {
        Node new_node = new Node(key);
        new_node.next = head;
        head = new_node;
    }

}
