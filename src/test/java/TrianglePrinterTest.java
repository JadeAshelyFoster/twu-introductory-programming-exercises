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
    public void testGetHorizontalLineOfNAsterisks() {
        String output = testTrianglePrinter.getAsterisksHorizontal(8, 0);
        assertEquals("********", output);
        String output2 = testTrianglePrinter.getAsterisksHorizontal(3, 0);
        assertEquals("***", output2);
    }

    @Test
    public void testGetVerticalLineOfNAsterisks() {
        String output = testTrianglePrinter.getAsterisksVertical(8);
        assertEquals("*\n*\n*\n*\n*\n*\n*\n*\n", output);
        String output2 = testTrianglePrinter.getAsterisksVertical(3);
        assertEquals("*\n*\n*\n", output2);
    }

    @Test
    public void testGetRightHandedTriangle() {
        String output = testTrianglePrinter.getRightHandedTriangle(3);
        assertEquals("*\n**\n***\n", output);
        String output2 = testTrianglePrinter.getRightHandedTriangle(8);
        assertEquals("*\n**\n***\n****\n*****\n******\n*******\n********\n", output2);
    }

    @Test
    public void testGetIsoscelesTriangle() {
        String output = testTrianglePrinter.getIsoscelesTriangle(3);
        assertEquals("  *\n ***\n*****\n", output);
        String output2 = testTrianglePrinter.getIsoscelesTriangle(8);
        assertEquals("       *\n      ***\n     *****\n    *******\n   *********\n  ***********\n *************\n***************\n", output2);
    }

    @Test
    public void testGetDiamond() {
        String output = testTrianglePrinter.getDiamond(3);
        assertEquals("  *\n ***\n*****\n ***\n  *\n", output);
        String output2 = testTrianglePrinter.getDiamond(8);
        assertEquals("       *\n      ***\n     *****\n    *******\n   *********\n  ***********\n *************\n***************\n *************\n  ***********\n   *********\n    *******\n     *****\n      ***\n       *\n", output2);
    }

    @Test
    public void testGetDiamondWithName() {
        String output = testTrianglePrinter.getDiamondWithName(3, "Bill");
        assertEquals("  *\n ***\nBill\n ***\n  *\n", output);
        String output2 = testTrianglePrinter.getDiamondWithName(8, "Jade");
        assertEquals("       *\n      ***\n     *****\n    *******\n   *********\n  ***********\n *************\nJade\n *************\n  ***********\n   *********\n    *******\n     *****\n      ***\n       *\n", output2);
    }

}
