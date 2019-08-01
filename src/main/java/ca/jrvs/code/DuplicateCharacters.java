package ca.jrvs.code;
/**
 * This program find repeated characters in a String
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacters {

    public void Countduplicate(String string)
    {
            //convert string to arrayofcharacters

            char[] stringToCharArray = string.toCharArray();

            for (char output : stringToCharArray) {
                System.out.println(output);
            }
            //**** inner lopps to check duplicate****
        /**
         * Since we are comparing every elemnts with every other element
         * the time complexity is O(n^2)
         */
            for (int i = 0; i < stringToCharArray.length; i++) {
                int count = 1;

                for (int j = i + 1; j < stringToCharArray.length; j++) {
                    if (stringToCharArray[i] == stringToCharArray[j]) {
                        count = count + 1;
                    }
                }
                if (count > 1)
                    System.out.println("Found duplicate: " + stringToCharArray[i] + " number of time " + count);

            }

            //*******Hashmap to check duplicate*****
        /**
         * We are going through array just one time
         * So, the time complexity is O(n)
         */
            //create an object for Hashmap with character and integer type

            HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
            for (char character : stringToCharArray) {
                if (hashMap.containsKey(character)) {
                    //increase the value of the key if there is duplicate
                    hashMap.put(character, hashMap.get(character) + 1);
                }
                // store the character into hashmap with a value
                else {
                    hashMap.put(character, 1);
                }

            }
            //print duplicate elements from array

            Set<Map.Entry<Character, Integer>> entrySet = hashMap.entrySet();
            for (Map.Entry<Character, Integer> entry : entrySet) {
                if (entry.getValue() > 1) {
                    System.out.println("Found the duplicate " + entry.getKey() + " " + entry.getValue());
                }
            }
        }


    public static void main(String[] args)
    {
        DuplicateCharacters duplicateCharacters = new DuplicateCharacters();
        duplicateCharacters.Countduplicate("javaprogramming");
    }
}
