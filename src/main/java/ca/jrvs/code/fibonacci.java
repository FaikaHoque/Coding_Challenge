package ca.jrvs.code;

public class fibonacci {

    /**
     * Fibonacci number contains Fibonacci sequence
     * Fibonacci sequence: F(N) = F(N-1)+F(N-2) where N>1
     * F(0) = 0 and F(1) = 1
     */
    //*****Method Dynamic program*****

    public void fibonacciNumber(int number)
    {
        int fibonacci;
        int fibonacArrray[] = new int[number+1];
        if(number==0)
            System.out.println(0);
        else if (number==1)
            System.out.println(1);
        else
        {
            fibonacArrray[0]=0;
            fibonacArrray[1]=1;
            for(int i=2; i<=number; i++)
            {
               fibonacArrray[i] = fibonacArrray[i-1]+fibonacArrray[i-2];
            }
            System.out.println(fibonacArrray[number]);
        }

    }
    /**
     * Method: recursive method
     * @param number
     * @return
     */

    public int fibonacciRecursion(int number)
    {
        if(number<=1)
            return number;
        else
            return (fibonacciRecursion(number-1)+fibonacciRecursion(number-2));
    }


    public static void main(String[] args)
    {

        fibonacci fibonacci = new fibonacci();
        fibonacci.fibonacciNumber(4);
        System.out.println(fibonacci.fibonacciRecursion(4));
    }

}
