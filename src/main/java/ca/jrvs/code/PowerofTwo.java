package ca.jrvs.code;
/**
 * Given an integer, this program to determine if it is a power of two
 */

public class PowerofTwo {
    /**
     * Method : using modulus solution
     * @param input
     * @return
     */
    public boolean findPowertwo(int input){

            int remainder;
            if(input!=1) {
                remainder = input % 2;
                if (remainder == 0)
                    System.out.println("This input is power of two");
            }else System.out.println(input + " is power of two");


        return false;
    }
    /**
     * Method : bit solution
     *
     */
    public boolean findPowertwobit(int input)
    {
        if(input!=0 && (input & (input-1)) == 0)
        {
            System.out.println("True");
        }

        return false;
    }

    public static void main(String[] args)
    {
        PowerofTwo powerofTwo = new PowerofTwo();
        powerofTwo.findPowertwo(1);
        powerofTwo.findPowertwobit(1);

    }
}
