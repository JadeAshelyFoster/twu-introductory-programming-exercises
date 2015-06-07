import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    FizzBuzz testFizzBuzz;

    @Before
    public void setUp() {
        testFizzBuzz = new FizzBuzz();
    }

    @Test
    public void testFizzBuzz() {
        String output = testFizzBuzz.go(15);
        assertEquals("1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n14\nFizzBuzz\n", output);
    }

}
