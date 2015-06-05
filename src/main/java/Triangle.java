
public class Triangle {

    public static void main(String[] args) {

    }

    public String printAsterisksHorizontal(int n) {
        String toPrint = "";
        for (int i = 1; i < n + 1; i++) {
            toPrint = toPrint + "*";
        }
        System.out.println(toPrint);
        return toPrint;
    }

    public String printAsterisksVertical(int n) {
        String toPrint = "";
        for (int i = 0; i < n; i++) {
            String asterisk = printAsterisksHorizontal(1);
            toPrint = toPrint + asterisk + "\n";
        }
        System.out.println(toPrint);
        return toPrint;
    }

    public String printRightTriangle(int n) {
        String toPrint = "";
        for (int i = 1; i < n + 1; i++) {
            String asterisks = printAsterisksHorizontal(i);
            toPrint = toPrint + asterisks + "\n";
        }
        System.out.println(toPrint);
        return toPrint;
    }

    public String printIsoscelesTriangle(int n) {
        String toPrint = "";
        for (int i = 0; i < n; i++) {
            String indent = "";
            for (int j = 0; j < n - i -1; j++) {
                indent = indent + " ";
            }
            String asterisks = printAsterisksHorizontal(1 + (2 * i));
            toPrint = toPrint + indent + asterisks + indent + "\n";
        }
        System.out.println(toPrint);
        return toPrint;
    }

    public String printDiamond(int n) {
        String toPrint = printIsoscelesTriangle(n);
        for (int i = 0; i < n -1; i ++) {
            String indent = "";
            for (int j = 0; j < n - 1; j ++) {
                indent = indent + " ";
            }
            String asterisks = printAsterisksHorizontal((n + 1) - (i * 2));
            toPrint = toPrint + indent + asterisks + indent + "\n";
        }
        System.out.println(toPrint);
        return toPrint;
    }

}
