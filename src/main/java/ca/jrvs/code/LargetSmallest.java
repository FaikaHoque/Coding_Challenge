package ca.jrvs.code;
/**
 * This program find smallest and largest number in an integer array
 */

public class LargetSmallest {
    int[] array;

    public LargetSmallest(int[] array) {
        this.array = array;
    }
    /**
     * Function to find the largest value
     */
    public void findLargest()
    {
        int largest = 0;
        for(int i=1; i<array.length; i++)
        {
            if(array[i]>=array[i-1])

                largest = array[i];
            else
                largest = array[i-1];
        }
        System.out.println("Largest Number " + largest);
    }
    /**
     * Function to find the smallest value
     */
    public void findSmallest()
    {
        int smallest = 0;
        for(int i=1; i<array.length; i++)
        {
            if(array[i]<=array[i-1])

                smallest = array[i];
            else
                smallest = array[i-1];
        }
        System.out.println("Largest Number " + smallest);
    }


    public static void main(String[] args)
    {
        int[] arrays = {2, 11, 34, 1};
        LargetSmallest largetSmallest = new LargetSmallest(arrays);
        largetSmallest.findLargest();
        largetSmallest.findSmallest();
    }
}
