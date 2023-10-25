package Task;

import java.util.Scanner;

public class SpiralMatrix {
    void spiralMatrix(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter matrix size:");
        int n=scanner.nextInt();
        int[][] matrix=new int[n][n];
        System.out.println("Enter the matrix value:");

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=scanner.nextInt();
            }
        }
    }
}
