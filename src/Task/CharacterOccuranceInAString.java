package Task;

import java.util.Scanner;

public class CharacterOccuranceInAString {
    void characterOccuranceInAString(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string:");
        String string=scanner.nextLine();
        System.out.println("Enter the character to find:");
        char charaToFine=scanner.next().charAt(0);
        int stringLength=string.length();
        int count=0;
        for(int i=0;i<stringLength;i++){
            if(string.charAt(i)==charaToFine){
                count++;
            }
        }
        System.out.println("Occurance of character a: "+count);

    }

    public static void main(String[] args) {
        CharacterOccuranceInAString characterOccuranceInAString=new CharacterOccuranceInAString();
        characterOccuranceInAString.characterOccuranceInAString();
    }
}
