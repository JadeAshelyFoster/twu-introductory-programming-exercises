/**
 * Created by jade on 07/06/15.
 */
public class PrimeFactors {

    public static void main(String[] args) {
        PrimeFactors pf = new PrimeFactors();
        //Print out prime factors exercise;
        System.out.println(pf.generate(1));
        System.out.println(pf.generate(30));
    }

    public String generate(int n) {
        String factors = "";
        for (int i = 2; i < n; i++) {
            if (isPrimeNumber(i) && n % i == 0) {
                factors += i + ",";
            }
        }
        return factors;
    }

    private boolean isPrimeNumber(int x) {
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }


}
