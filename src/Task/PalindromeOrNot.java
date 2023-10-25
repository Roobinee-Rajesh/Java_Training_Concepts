package Task;

import java.util.Scanner;

public class PalindromeOrNot {
    void palindromeOrNot() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = scanner.nextLine();
        String reverse="";
        int lengthOfStr=str.length();

        for(int i=lengthOfStr-1;i>=0;i--)
        {
            reverse=reverse+str.charAt(i);
        }

        if(str.equalsIgnoreCase(reverse)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }

    }

    public static void main(String[] args) {
        PalindromeOrNot palindromeOrNot = new PalindromeOrNot();
        palindromeOrNot.palindromeOrNot();
    }
}
