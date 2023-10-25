package Task;

import java.util.Scanner;

public class OccuranceOfSubString {


    void occuranceOfSubString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String");
        String string = scanner.nextLine();
        System.out.println("Enter the Sub String");
        String subString = scanner.nextLine();
        int lengthString = string.length(), lengthSubString = subString.length(), count = 0;

        for (int i = 0; i <= lengthString - lengthSubString; i++) {
            String compareString = string.substring(i, i + lengthSubString);
            if (compareString.equalsIgnoreCase(subString)) {
                count++;
            }
        }

        System.out.println("The substring \"" + subString + "\" appears " + count + " times in the string.");
    }

    public static void main(String[] args) {
        OccuranceOfSubString occuranceOfSubString=new OccuranceOfSubString();
        occuranceOfSubString.occuranceOfSubString();
    }
}
