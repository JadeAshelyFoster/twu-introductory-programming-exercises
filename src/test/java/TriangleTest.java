import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TriangleTest {

    @Test
    public void printOneAsterikToTheConsole() {
        Triangle testTriangle = new Triangle();
        String output = testTriangle.printAsterisks(1);
        assertEquals("*", output);
    }

    @Test
    public void printNAsterisks() {
        Triangle testTriangle = new Triangle();
        String output = testTriangle.printAsterisks(8);
        assertEquals("********", output);
        String output2 = testTriangle.printAsterisks(3);
        assertEquals("***", output2);
    }


}
