package ca.jrvs.code;
/**
 * Given an array of integers, this program validate if the array contains any duplicate elements
 */
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    /**
     * Function return true if any value appears at least twice in the array
     * and it should return false if every element is distinct
     * @param array
     * @return
     */

    public boolean containsDuplicate(int[] array)
    {
        Set<Integer> set = new HashSet<>(array.length);
        for (int i : array) {
            if (set.contains(i))
                System.out.println("true");
            set.add(i);
        }
            return false;
    }


    public static void main(String[] args)
    {
        int[] array = {2, 3, 4, 1, 2};
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        containsDuplicate.containsDuplicate(array);
    }
}
