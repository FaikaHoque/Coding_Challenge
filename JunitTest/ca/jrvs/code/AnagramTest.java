package ca.jrvs.code;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {


    @Test
    public void AnagramCheck() throws Exception{
        Anagram anagramTest = new Anagram();


       // boolean test = anagramTest.anagramCheck(string1,string2);
        assertEquals(true,anagramTest.AnagramCheck("word", "dowd"));

    }
}