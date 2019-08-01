package ca.jrvs.code;
/**
 * Given an array, this program remove all instances that are duplicate and
 * retrun the length of the array with remaining instances
 * Note that, we can not allocate extra space for another array
 * we must do this with O(1) extra memory
 */
public class RemoveDuplicate {

    public int removeDuplicate(int[] arrays)
    {
        int length = 0;
        for (int i=1; i<arrays.length; i++)
        {
            if(arrays[i] != arrays[length]) {
                length = length + 1;
                arrays[length] = arrays[i];
            }
            else arrays[length] = arrays[i];

        }
        return length+1;
    }
    public static void main(String[] args)
    {
        int[] arrays = {1, 1, 2};
        RemoveDuplicate removeDuplicate = new RemoveDuplicate();
        System.out.println(removeDuplicate.removeDuplicate(arrays));

    }
}
