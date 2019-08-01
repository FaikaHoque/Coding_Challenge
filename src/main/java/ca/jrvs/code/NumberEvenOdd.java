package ca.jrvs.code;
/**
 * This program find whether the input is even or odd
 */

public class NumberEvenOdd {
    /**
     * This function find whether the number is even or odd using modulus function
     * @param input
     */

    public void CheckEVenOdd(int input)
    {

        if((input % 2) == 0)
            System.out.println("The input is even");
        else
            System.out.println("The input is odd");
    }

    /**
     * This function find whether the number is even or odd usinf bit operation
     * @param input
     */

    public void CheckEvenOddBit(int input)
    {
        if(input!=0 && (input & 1) == 0)
        {
            System.out.println("The number is even");
        }
        else System.out.println("The number is odd");
    }

    public static void main(String[] args)
    {
        NumberEvenOdd numberEvenOdd = new NumberEvenOdd();
        numberEvenOdd.CheckEVenOdd(4);
        numberEvenOdd.CheckEvenOddBit(4);
    }


}
