package Task;

import java.util.Scanner;

public class FibonacciSeries {
    void fibonacciSeries(){
        Scanner scanner = new Scanner(System.in);
        int n1=0,n2=1,n3,count;
        System.out.println("Enter the count:");
        count=scanner.nextInt();
        System.out.print(n1+" "+n2+" ");
        for(int i=2;i<count;i++){
            n3=n1+n2;
            System.out.print(n3+" ");
            n1=n2;
            n2=n3;
        }

    }

    public static void main(String[] args){
        FibonacciSeries fibonacciSeries=new FibonacciSeries();
        fibonacciSeries.fibonacciSeries();
    }
}
