package ca.jrvs.code;
/**
 * This program merge two arrays into one array
 * Given two sorted integer arrays array1 and array2 into array1 as one sorted array
 * It is assumed one array is big enough two store the data of second array
 */

public class MergerTwoArrays {

    public void Merged(int[] array1, int[] array2)
    {
        int j=0;
        // check which array is largest
        if(array1.length > array2.length)
        {
            for(int i=0; i<array1.length; i++)
            {
                if(array1[i]==0)
                {
                        array1[i] = array2[j];
                        j=j+1;

                }
                System.out.println(array1[i]);
            }
        }
        else
        {
            for(int i=0; i<array2.length; i++)
            {
                if(array2[i]==0)
                {
                    array1[i] = array1[j];
                    j=j+1;

                }
            }
        }
    }

    public static void main(String[] args)
    {
        int[] arr1 = {1, 2, 3, 0, 0, 0};
        int[] arr2 = {4, 5, 6};
        MergerTwoArrays mergerTwoArrays = new MergerTwoArrays();
        mergerTwoArrays.Merged(arr1,arr2);
    }
}
