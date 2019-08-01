package ca.jrvs.code;
/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target
 * for example: given array = {2,7, 11, 15} and target = 9
 * because array[0]+ array[1] = 2+7 = 9
 * return [0.1]
 */
import java.util.HashMap;

public class TwoSum {

    public int[] arrays;
    public int target;

    public TwoSum(int[] arrays, int target) {
        this.arrays = arrays;
        this.target = target;
    }

    /**
     * method using loops to find the indices
     * time complexity is O(n^2)
     */
    public void IndicesOfTwo()
    {
        for(int i=0; i<arrays.length;i++)
        {
            for(int j=i+1; j<arrays.length;j++)
            {
                int sum = arrays[i]+arrays[j];
                if(sum==target)
                    System.out.println("Found the indices: "+ i +  " " + j);
            }
        }

    }

    /**
     * method using Hashtag Solution
     * time complexity O(n)
     */
    public void IndicesOfTwoMap()
    {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i=0;i<arrays.length;i++)
        {
            hashMap.put(arrays[i],i);
        }
        for(int i=0;i<arrays.length;i++)
        {
            int complement = target - arrays[i];
            if(hashMap.containsKey(complement) && hashMap.get(complement) != i)
            {
                System.out.println("Found the indices: "+ i + " " + hashMap.get(complement));

           }
        }
    }

    public static void main(String[] args)
    {
        int[] arrays = {2,15,11,7};
        int target = 9;
        TwoSum twoSum = new TwoSum(arrays,target);
        twoSum.IndicesOfTwo();
        twoSum.IndicesOfTwoMap();
    }
}
