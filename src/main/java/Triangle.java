
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
        return toPrint;
    }

}
