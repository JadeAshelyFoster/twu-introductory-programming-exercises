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
    public void printOneAsterisk() {
        String output = testTrianglePrinter.printAsterisk();
        assertEquals("*", output);
    }



}
