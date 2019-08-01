package ca.jrvs.code;
/**
 * GIven an input string, this program reverse the string word by word
 */
import java.util.StringJoiner;

public class ReverseWords {

    public void reverse(String string)
    {
        String words[] = string.split("\\s");
        String[] reverse = new String[words.length];

        int j= 0;

        for(int i= words.length-1; i>=0; i--)
        {
            reverse[j] = words[i];
            j++;
        }
      //  System.out.println(reverse[0]);
        StringJoiner stringJoiner = new StringJoiner(" ");
        for(int k=0; k<reverse.length; k++)
            stringJoiner.add(reverse[k]);

        System.out.println(stringJoiner);

    }

    public static void main(String[] args)
    {
        ReverseWords reverseWords = new ReverseWords();
        reverseWords.reverse("Hello world");

    }
}
