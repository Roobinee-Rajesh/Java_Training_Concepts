package Task;

import java.util.Arrays;

public class FindPrimeNumber {

    void findPrimeNumber() {
        System.out.println(1);
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        FindPrimeNumber findPrimeNumber=new FindPrimeNumber();
        findPrimeNumber.findPrimeNumber();
    }

}
