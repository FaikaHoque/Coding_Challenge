package ca.jrvs.code;

/**
 * This program find the length of a single linked list
 */

public class LengthOfLinkList {
    Node head;

    /**
     * Liked list Node created
     * Each Node has key and pointer of next node
     */
    static class Node {
        int key;
        Node next;

        public Node(int key) {
            this.key = key;
            next = null;
        }
    }
    /**
     * insert function to insert a key into the linked list
     */
    public static LengthOfLinkList Insert(LengthOfLinkList list, int key) {
        // create a new node with gicen data

        Node node = new Node(key);
        node.next = null;

        /**
         * Now if this new node is the first node
         * then make it head of the list
         */
        if (list.head == null)
            list.head = node;
        /**
         * otherwise travese the list until the last node
         * and insert the new node
         */

        else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = node;
        }

        return list;
    }

    /**
     * function to print the linked list
     */
    public int lengthOfLinked(LengthOfLinkList list) {
        int count = 1;
        Node currentNode = list.head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
            count = count + 1;
        }

        return count;
    }


    public static void main(String[] args) {
        LengthOfLinkList linkedlistImp = new LengthOfLinkList();
        linkedlistImp = Insert(linkedlistImp, 1);
        linkedlistImp = Insert(linkedlistImp, 2);
        linkedlistImp = Insert(linkedlistImp, 1);
        System.out.println(linkedlistImp.lengthOfLinked(linkedlistImp));


    }
}
