import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jade on 07/06/15.
 */
public class PrimeFactorsTest {
    PrimeFactors testPrimeFactors;

    @Before
    public void setUp() {
        testPrimeFactors = new PrimeFactors();
    }

    @Test
    public void testGeneratePrimeFactorsInput1() {
        String output = testPrimeFactors.generate(1);
        assertEquals("", output);
    }

    @Test
    public void testGeneratePrimeFactorsInput30() {
        String output = testPrimeFactors.generate(30);
        assertEquals("2,3,5,", output);
    }

    @Test
    public void testGeneratePrimeFactorsInput100() {
        String output = testPrimeFactors.generate(100);
        assertEquals("2,5,", output);
    }

}
