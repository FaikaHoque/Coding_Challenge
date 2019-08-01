package ca.jrvs.code;
/**
 * This program find the duplicate number in a given array
 */

import java.util.Arrays;

public class DuplicateNumber {

    int[] array;

    public DuplicateNumber(int[] array) {
        this.array = array;
    }

    /**
     * Method 1: Nested loop
     * The time complexity is O(n^2)
     */
    public void FindduplicateLoop()
    {
        for (int i=1; i<array.length; i++)
        {
            for(int j=i; j>0; j--)
            {
                if(array[j] == array[j-1])
                    System.out.println("Found the number with loop " + array[j]);
                break;
            }
        }
    }

    /**
     * Method 2:
     * First sort the arrays
     * compare the adjacent two values
     * time complexity O(n)
     *
     */

    public void FindDuplicate()
    {
        Arrays.sort(array);

        for(int i=1; i<array.length; i++)
        {
            if (array[i] == array[i-1])
                System.out.println("Found the number  " + array[i]);
        }
    }


    public static void main(String[] args)
    {
        int[] array = {1, 3, 4, 2, 2};
        DuplicateNumber duplicateNumber = new DuplicateNumber(array);
        duplicateNumber.FindDuplicate();
        duplicateNumber.FindduplicateLoop();

    }
}
