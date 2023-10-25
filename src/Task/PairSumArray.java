package Task;

import java.util.Scanner;

public class PairSumArray {
    void findPair() {
        Scanner scanner = new Scanner(System.in);
        boolean pairFound = false;
        System.out.println("Enter the size of the array:");
        int sizeOfArray = scanner.nextInt();
        int[] array = new int[sizeOfArray];
        System.out.println("Enter the " + sizeOfArray + "values of the array:");
        for (int i = 0; i < sizeOfArray; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter the sum value:");
        int sumValue = scanner.nextInt();

        for (int i = 0; i < sizeOfArray - 1; i++) {
            for (int j = i + 1; j < sizeOfArray; j++) {
                if (array[i] + array[j] == sumValue) {
                    pairFound = true;
                }
            }
        }

        if (pairFound == true) {
            System.out.println("Result: " + pairFound);
        } else {
            System.out.println("Result: " + pairFound);
        }


    }

    public static void main(String[] args) {

        PairSumArray pairSumArray = new PairSumArray();
        pairSumArray.findPair();


    }
}
