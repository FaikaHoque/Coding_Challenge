package ca.jrvs.code;
/**
 * This program find if a string is a number or not
 * or if a string contains any non digit character
 */

import java.util.regex.Pattern;

public class StringContainsDigit {

    public boolean PatterenMatchDigit(String string)
    {
        Pattern pattern = Pattern.compile(".*[^0-9]].*");
        if (pattern.matcher(string).matches()==false)
            System.out.println("true");

        return false;
   }
   public static void main(String[] args)
   {
       String string = "1234";
       StringContainsDigit stringContainsDigit = new StringContainsDigit();
       stringContainsDigit.PatterenMatchDigit(string);
   }

}
