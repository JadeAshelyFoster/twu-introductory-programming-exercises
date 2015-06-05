
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
        for (int i = 0; i < n; i++) {
            toPrint = toPrint + printMultipleAsterisksHorizontal(i+1) + "\n";
            System.out.println();
        }
        return toPrint;
    }

    public String printIsoscelesTriangle(int n) {
        String toPrint = "";
        for (int i = 0; i < n; i++) {
            String indent = getIndent(n-i-1);
            String line = indent + printMultipleAsterisksHorizontal((i*2) + 1);
            System.out.println(line);
            toPrint = toPrint + line +"\n";
        }
        return toPrint;
    }

    public String printDiamond(int n) {
        String toPrint = printIsoscelesTriangle(n);
        for (int i = 0; i > n-1; i--) {
            String indent = getIndent(i + 2);
            String line = indent + printMultipleAsterisksHorizontal();
        }
    }

    private String getIndent(int n) {
        String indent = "";
        for (int i = 0; i < n; i++) {
            indent = indent + " ";
        }
        return indent;
    }

}
