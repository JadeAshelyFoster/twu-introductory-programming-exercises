import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrianglePrinterTest {
    TrianglePrinter testTrianglePrinter;

    @Before
    public void setUp() {
        testTrianglePrinter = new TrianglePrinter();
    }

    @Test
    public void testGetAsterisk() {
        String output = testTrianglePrinter.getAsterisk();
        assertEquals("*", output);
    }

    @Test
    public void testGetHorixontalLineOfNAsterisks() {
        String output = testTrianglePrinter.getAsterisksHorizontal(8);
        assertEquals("********", output);
        String output2 = testTrianglePrinter.getAsterisksHorizontal(3);
        assertEquals("***", output2);
    }

    @Test
    public void testGetHorizontalLineOfNAsterisks() {
        String output = testTrianglePrinter.getAsteriskVertical(8);
        assertEquals("*\n*\n*\n*\n*\n*\n*\n*", output);
        String output2 = testTrianglePrinter.getAsteriskVertical(3);
        assertEquals("*\n*\n*\n", output2);
    }
}
