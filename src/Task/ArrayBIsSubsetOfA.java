package Task;

import java.util.Scanner;

public class ArrayBIsSubsetOfA {
    void arrayBIsSubsetOfA() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array A");
        int n = scanner.nextInt();

        System.out.println("Enter the size of array B");
        int m = scanner.nextInt();
        int[] arrayA = new int[n];
        int[] arrayB = new int[m];

        System.out.println("Enter " + n + " for array A:");
        for (int i = 0; i < n; i++) {
            arrayA[i] = scanner.nextInt();
        }

        System.out.println("Enter " + m + " for array B:");
        for (int i = 0; i < m; i++) {
            arrayB[i] = scanner.nextInt();
        }

        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arrayB[i] == arrayA[j]) {
                    count++;
                }
            }
        }
        System.out.println("Result:");
        if (count == m) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }

    public static void main(String[] args) {
        ArrayBIsSubsetOfA arrayBIsSubsetOfA = new ArrayBIsSubsetOfA();
        arrayBIsSubsetOfA.arrayBIsSubsetOfA();
    }
}
