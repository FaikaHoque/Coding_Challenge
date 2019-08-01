package ca.jrvs.code;
/**
 * Given an array and a value, this program remove all instances of that value inplace and
 * retrun the length of the array with remaining instances
 * Note that, we can not allocate extra space for another array
 * we must do this with O(1) extra memory
 */
public class RemoveElement {

    public int Removeelement(int[] arrays, int value)
    {
        int length = 0;

        for (int i=0; i<arrays.length; i++)
        {
            if(arrays[i]!=value) {
                arrays[length] = arrays[i];
                length = length+1;
            }

        }

        return length;
    }

    public static void main(String[] args)
    {
        int[] arrays = {3, 2, 2, 3, 3, 2, 3};
        int value = 3;
        RemoveElement removeElement = new RemoveElement();
        System.out.println(removeElement.Removeelement(arrays,value));
    }
}
