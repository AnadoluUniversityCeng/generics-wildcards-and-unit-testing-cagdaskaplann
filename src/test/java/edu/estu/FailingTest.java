package edu.estu;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class FailingTest {

    @Test(timeout = 1000)
    public void testInfiniteLoop() {
        try {
            App.infiniteLoop(Double.POSITIVE_INFINITY);
            fail(); // No Infinite Loop
        } catch (Throwable e) {
            assertTrue(true); // Infinite Loop
        }
    }
}
