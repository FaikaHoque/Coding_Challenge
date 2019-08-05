package ca.jrvs.code;

import org.junit.Test;

import static org.junit.Assert.*;

public class DuplicateNumberTest {

    @Test
    public void findDuplicate() {
        DuplicateNumber duplicateNumber = new DuplicateNumber();
        int[] array = {1, 3, 4, 2, 2};
        assertEquals(2,duplicateNumber.FindDuplicate(array));
    }
}