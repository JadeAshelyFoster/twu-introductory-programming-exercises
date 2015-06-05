import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TriangleTest {
    Triangle testTriangle;

    @Before
    public void setUp() {
        testTriangle = new Triangle();
    }

    @Test
    public void printOneAsterikToTheConsole() {
        String output = testTriangle.printAsterisksHorizontal(1);
        assertEquals("*", output);
    }

    @Test
    public void printNAsterisks() {
        String output = testTriangle.printAsterisksHorizontal(8);
        assertEquals("********", output);
        String output2 = testTriangle.printAsterisksHorizontal(3);
        assertEquals("***", output2);
    }

    @Test public void printNAsterisksVertial() {
        String output = testTriangle.printAsterisksVertical(3);
        assertEquals("*\n*\n*\n", output);
        String output2 = testTriangle.printAsterisksVertical(8);
        assertEquals("*\n*\n*\n*\n*\n*\n*\n*\n", output2);
    }

    @Test public void printRightTriangle() {
        String output = testTriangle.printRightTriangle(3);
        assertEquals("*\n**\n***\n", output);
        String output2 = testTriangle.printRightTriangle(8);
        assertEquals("*\n**\n***\n****\n*****\n******\n*******\n********\n", output2);
    }

    @Test
    public void printIsoscelesTriangle() {
        String output = testTriangle.printIsoscelesTriangle(3);
        assertEquals("  *  \n *** \n*****\n", output);
        String output2 = testTriangle.printIsoscelesTriangle(4);
        assertEquals("   *   \n  ***  \n ***** \n*******\n", output2);
    }

    @Test
    public void printDiamond() {
        String output = testTriangle.printDiamond(3);
        assertEquals("  *  \n *** \n*****\n *** \n  *  \n", output);
    }

}
