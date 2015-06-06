import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    FizzBuzz testFizzBuzz;

    @Before
    public void setUp() {
        testFizzBuzz = new FizzBuzz();
    }

    @Test
    public void testPrint1To10() {
        String output = testFizzBuzz.printNumberListVertically(1, 10);
        assertEquals("1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n", output);
    }

}
