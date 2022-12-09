package P09_String_Manupulation;

import java.util.Scanner;

public class A01_Reverse_String {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please type a text");
        String userText= scan.nextLine();
        reverseString(userText);
    }

    private static void reverseString(String text) {
        for (int i = text.length()-1; i >=0 ; i--) {
            //System.out.println(text.charAt(i));
            System.out.print(text.substring(i,i+1));

        }
    }
}
