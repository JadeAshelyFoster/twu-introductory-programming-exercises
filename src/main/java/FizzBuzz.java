public class FizzBuzz {

    public static void main(String[] args) {
        FizzBuzz fb = new FizzBuzz();
        //FizzBuzz exercise
        String fbOutput = fb.go(100);
    }

    public String go(int end) {
        String toPrint = "";
        for (int i = 1; i <= end; i++) {
            if (i % 3 == 0 && i % 5 ==0) {
                toPrint += "FizzBuzz\n";
            } else {
                if (i % 3 == 0) {
                    toPrint += "Fizz\n";
                } else if (i % 5 == 0) {
                    toPrint += "Buzz\n";
                } else {
                    toPrint += i + "\n";
                }
            }
        }
        System.out.println(toPrint);
        return toPrint;
    }
    

}
