
public class TrianglePrinter {

    public static void main(String[] args) {

    }

    public String printAsterisk() {
        String toPrint = "*";
        System.out.print(toPrint);
        return toPrint;
    }

    public String printMultipleAsterisksHorizontal(int n) {
        String toPrint = "";
        for (int i = 0; i < n; i++) {
            toPrint = toPrint + printAsterisk();
        }
        return toPrint;
    }

    public String printMultipleAsterisksVertical(int n) {
        String toPrint = "";
        for (int i = 0; i < n; i++) {
            toPrint = toPrint + printAsterisk() + "\n";
            System.out.println();
        }
        return toPrint;
    }

    public String printRightTriangle(int n) {
        String toPrint = "";
        
        return toPrint;
    }

}
