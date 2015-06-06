
public class FizzBuzz {

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.printNumberListVertically(1, 100);
    }

    public String printNumberListVertically(int start, int end) {
        String toPrint = "";
        for (int i = start; i <= end; i++) {
            toPrint += i + "\n";
        }
        System.out.println(toPrint);
        return toPrint;
    }

}
