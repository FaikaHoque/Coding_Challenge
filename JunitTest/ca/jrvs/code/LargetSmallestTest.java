package ca.jrvs.code;

import org.junit.Test;

import static org.junit.Assert.*;

public class LargetSmallestTest {

    @Test
    public void findLargest() throws Exception {

        LargetSmallest largetSmallest = new LargetSmallest();
        int[] arrays = {2,11,34,1};
        assertEquals(1,largetSmallest.findSmallest(arrays));
        assertEquals(34,largetSmallest.findLargest(arrays));
    }
}