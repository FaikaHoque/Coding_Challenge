package ca.jrvs.code;
/**
 * This program find the middle element in the linked list
 */
import java.util.Iterator;
import java.util.LinkedList;

public class MiddleElement {

    int[] a = new int[100];

    public void method(LinkedList<Integer> linkedList)
    {
        int middle_index = linkedList.size()/2;

    }
    public static void main(String[] args)
    {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(8);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(7);

       // System.out.println(linkedList.size());

        int size = linkedList.size();
        int middle = size/2;
        System.out.println(linkedList.get(middle));


    }


}
