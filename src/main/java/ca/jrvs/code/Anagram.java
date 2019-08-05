package ca.jrvs.code;
/**
 * This program validates whether two strings are Anagram of each other.
 */
public class Anagram {
    /**
     * Given two strings, following function determines if string1 is anagram of string2
     * @param string1
     * @param string2
     * @return
     */
    public boolean AnagramCheck(String string1, String string2) {
        char[] chars = string1.toCharArray();

        if (string1.length() != string2.length())
            return false;
        for (char ch : chars) {
            int index = string2.indexOf(ch);
            // System.out.println(index);
            if (index != -1) {
                string2 = string2.substring(0, index) + string2.substring(index + 1);
            } else {
                return false;
            }
        }
        return true;
    }
}
