
public class TrianglePrinter {

    public static void main(String[] args) {
        TrianglePrinter tPrinter = new TrianglePrinter();
        System.out.println(tPrinter.getAsterisk());
        System.out.println(tPrinter.getAsterisksHorizontal(8));
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

}
