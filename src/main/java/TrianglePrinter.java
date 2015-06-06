
public class TrianglePrinter {

    public static void main(String[] args) {
        TrianglePrinter tPrinter = new TrianglePrinter();
        //Print out Triangle exercises:
        System.out.println(tPrinter.getAsterisk());
        System.out.println(tPrinter.getAsterisksHorizontal(8, 0));
        System.out.println(tPrinter.getAsterisksVertical(3));
        System.out.println(tPrinter.getRightHandedTriangle(3));
        //Print out diamond exercises:
        System.out.println(tPrinter.getIsoscelesTriangle(3));
        System.out.println(tPrinter.getDiamond(3));
        System.out.println(tPrinter.getDiamondWithName(3, "Bill"));
    }

    public String getAsterisk() {
        return "*";
    }

    public String getAsterisksHorizontal(int n, int indentLength) {
        String asterisks = "";
        for (int i =0; i < n; i++) {
            asterisks += getAsterisk();
        }
        return getIndent(indentLength) + asterisks;
    }

    private String getIndent(int indentLength) {
        String indent = "";
        for (int i = 0; i < indentLength; i++) {
            indent += " ";
        }
        return indent;
    }

    public String getAsterisksVertical(int n) {
        String asterisks = "";
        for (int i =0; i < n; i++) {
            asterisks += getAsterisk() + "\n";
        }
        return asterisks;
    }

    public String getRightHandedTriangle(int n) {
        String triangle = "";
        for(int i = 1; i <= n; i++) {
            triangle += getAsterisksHorizontal(i, 0) + "\n";
        }
        return triangle;
    }

    public String getIsoscelesTriangle(int n) {
        String triangle = "";
        for (int i = 1; i <= n; i++) {
            triangle += getAsterisksHorizontal(i+(i-1), n-i) + "\n";
        }
        return triangle;
    }

    public String getDiamond(int n) {
        String diamond = getIsoscelesTriangle(n);
        for (int i = n-1; i > 0; i--) {
            diamond += getAsterisksHorizontal(i+(i-1), n-i) + "\n";
        }
        return diamond;
    }

    public String getDiamondWithName(int n, String name) {
        String diamond = "";
        for (int i = 1; i <= n-1; i++) {
            diamond += getAsterisksHorizontal(i+(i-1), n-i) + "\n";
        }
        diamond += name + "\n";
        for (int i = n-1; i > 0; i--) {
            diamond += getAsterisksHorizontal(i+(i-1), n-i) + "\n";
        }
        return diamond;
    }
}
