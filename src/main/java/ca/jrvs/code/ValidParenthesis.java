package ca.jrvs.code;
/**
 * Given a string containing just the characters '(', ')', '{", "}', '[', ']', determine if the input string is valid
 */

import java.util.HashMap;
import java.util.Stack;

public class ValidParenthesis {

    public HashMap<Character,Character> hashMap = new HashMap<>();

    public ValidParenthesis(HashMap<Character, Character> hashMap) {
        this.hashMap = hashMap;
        hashMap.put('(',')');
        hashMap.put('{','}');
        hashMap.put('[',']');
    }

    public boolean stackString(String string)
    {
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<string.length();i++)
        {
            char ch = string.charAt(i);

            if(hashMap.containsKey(ch))
            {
                char topelement = stack.lastElement();

                if (topelement==ch)
                    stack.pop();
                else if (topelement!=hashMap.get(ch))
                    return false;
                else {
                    stack.push(ch);
                }

            }

        }
        return stack.empty();

    }

}
