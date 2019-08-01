package ca.jrvs.code;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MissingNumber {
    /**
     * Given an array containing n distinct numbers.
     * Numbers are expected to be series of squares from o to 5
     * Need to find which number is missing in the gievn array
     */

     public int limit;
     public int[] array;

    public MissingNumber(int limit, int[] array) {
        this.limit = limit;
        this.array = array;
    }

    /**
     * Following method: time complexity is O(n)
     */

    public void FindMissingNumber()
    {

        Arrays.sort(array);


       for (int i=0; i<array.length; i++)
       {
               if(array[i] != i*i)
               {

                           System.out.println("Found the missing number: " + i*i);

               }
       }

    }

    /**
     * The following method has time complexity O(n)
     */

    public void FindmissingHash()
    {
        Set<Integer> hashset = new HashSet<>();
        for(int i : array) hashset.add(i);
        for(int i=0; i<array.length; i++)
        {
            if(!hashset.contains(i*i))
            {
                System.out.println("Found the missing number: " + i*i);
            }
        }
    }

    public static void main(String[] args)
    {
        int[] array = {0, 1, 16, 4};
        int limit = 5;

        MissingNumber missingNumber = new MissingNumber(limit, array);
        missingNumber.FindMissingNumber();
        missingNumber.FindmissingHash();
    }
}
