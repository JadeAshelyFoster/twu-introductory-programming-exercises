import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class TrianglePrinterTest {
    TrianglePrinter testTrianglePrinter;

    @Before
    public void setUp() {
        testTrianglePrinter = new TrianglePrinter();
    }

    @Test
    public void testPrintOneAsterisk() {
        String output = testTrianglePrinter.printAsterisk();
        assertEquals("*", output);
    }

    @Test
    public void testPrintMultipleAsterisks() {
        String output = testTrianglePrinter.printMultipleAsterisksHorizontal(3);
        assertEquals("***", output);
        String output2 = testTrianglePrinter.printMultipleAsterisksHorizontal(8);
        assertEquals("********", output2);
    }

    @Test
    public void testPrintMultipleAsterisksVertically() {
        String output = testTrianglePrinter.printMultipleAsterisksVertical(3);
        assertEquals("*\n*\n*\n", output);
        String output2 = testTrianglePrinter.printMultipleAsterisksVertical(8);
        assertEquals("*\n*\n*\n*\n*\n*\n*\n*\n", output2);
    }

    @Test
    public void testPrintRightTriangle() {
        String output = testTrianglePrinter.printRightTriangle(3);
        assertEquals("*\n**\n***\n", output);
        String output2 = testTrianglePrinter.printRightTriangle(8);
        assertEquals("*\n**\n***\n****\n*****\n******\n*******\n********\n", output2);
    }

    @Test
    public void testPrintIsoscelesTriangle() {
        String output = testTrianglePrinter.printIsoscelesTriangle(3);
        assertEquals("  *\n ***\n*****\n", output);
        String output2 = testTrianglePrinter.printIsoscelesTriangle(4);
        assertEquals("   *\n  ***\n *****\n*******\n", output2);
    }

    @Test
    public void testPrintDiamond() {
        String output = testTrianglePrinter.printDiamond(3);
        assertEquals("  *\n ***\n*****\n ***\n  *\n", output);
        String output2 = testTrianglePrinter.printDiamond(4);
        assertEquals("   *\n  ***\n *****\n*******\n *****\n  ***\n   *\n", output2);
    }



}
