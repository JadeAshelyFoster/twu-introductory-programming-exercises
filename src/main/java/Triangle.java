
public class Triangle {

    public static void main(String[] args) {

    }

    public String printAsterisks(int n) {
        String toPrint = "";
        for (int i = 1; i < n + 1; i++) {
            toPrint = toPrint + "*";
        }
        System.out.println(toPrint);
        return toPrint;
    }

}
