package ca.jrvs.code;
/**
 * This program swap two integers without using temporary variable
 */
public class SwapNumber {

    int x, y;

    public SwapNumber(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void swapNumber(){
        System.out.println("Before swapping: "+"x= "+ x+ " y= "+y);
        y=y+x;
        x=y-x;
        y=y-x;
        System.out.println("After swapping: "+"x= "+ x+ " y= "+y);
    }
    public static void main(String[] args)
    {
        SwapNumber swapNumber = new SwapNumber(2,4);
        swapNumber.swapNumber();
    }
}
