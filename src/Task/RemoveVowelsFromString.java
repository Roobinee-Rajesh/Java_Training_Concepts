package Task;

import java.util.Scanner;

public class RemoveVowelsFromString {
    void removeVowelsFromString() {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int stringLength = string.length();
        for (int i = 0; i < stringLength; i++) {
            if (string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i'
                    || string.charAt(i) == 'o' || string.charAt(i) == 'u') {
                string=string.replace("string.charAt(i)","");
            }
        }
        //replace a the value with null
//        string = string.replaceAll("[aeiouAEIOU]", "");
        System.out.println(string);

    }

    public static void main(String[] args) {
        RemoveVowelsFromString removeVowelsFromString = new RemoveVowelsFromString();
        removeVowelsFromString.removeVowelsFromString();
    }
}
