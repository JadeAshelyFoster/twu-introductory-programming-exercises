
public class TrianglePrinter {

    public static void main(String[] args) {
        TrianglePrinter tPrinter = new TrianglePrinter();
        //Print out Triangle exercises:
        System.out.println(tPrinter.getAsterisk());
        System.out.println(tPrinter.getAsterisksHorizontal(8));
        System.out.println(tPrinter.getAsterisksVertical(3));
        System.out.println(tPrinter.getRightHandedTriangle(3));
    }

    public String getAsterisk() {
        return "*";
    }

    public String getAsterisksHorizontal(int n) {
        String asterisks = "";
        for (int i =0; i < n; i++) {
            asterisks += getAsterisk();
        }
        return asterisks;
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
        for(int i = 1; i < n +1; i++) {
            triangle += getAsterisksHorizontal(i) + "\n";
        }
        return triangle;
    }

}
