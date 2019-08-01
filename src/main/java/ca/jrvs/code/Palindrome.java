package ca.jrvs.code;
/**
 * Given a string, this program determine if it is a palindrome,
 */

public class Palindrome {

    public void palindrome(String string)
    {
        char[] charsToString = string.toCharArray();
        char[] reverseChar = new char[charsToString.length];
        int j = charsToString.length-1;
        int count = 0;
        System.out.println("Given string is palindrome:");

        //reverse the array of characters

        for(int i = 0; i<charsToString.length; i++)
        {
            reverseChar[i] = charsToString[j];
            j = j-1;
        }
       // System.out.println(reverseChar);
        /**
         * check every elements of the charracter arrays with reversearrays
         */

        for (int k = 0; k<charsToString.length; k++)
        {
            if(charsToString[k] == reverseChar[k])
            {
               count = count+1;
            }
        }
        if(count == charsToString.length)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }

    }
    //*****check if string is palindrome using recursion****

       public boolean PalRecursion(String string, int starch, int endch)
        {
            //if there are only one character
            if(starch==endch)
                return true;

            // if there are only two characters
           if(string.charAt(starch) != string.charAt(endch))
               return false;

           if(starch <= endch)
               return PalRecursion(string,starch+1,endch-1);

           return true;
        }
    public boolean isPlanidrive(String string)
    {
        int n = string.length();
        if (n==0)
            return true;
        return PalRecursion(string, 0,n-1);
    }

    public static void main(String[] args)
    {
        Palindrome palindrome = new Palindrome();

        palindrome.palindrome("mam");
        if(palindrome.isPlanidrive("mam"))
            System.out.println("yes");
        else
            System.out.println("No");

    }
}
