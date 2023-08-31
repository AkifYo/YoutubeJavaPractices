package P10_Mountain_Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A02_Count_The_Letters {
    public static void main(String[] args) {
        // in this chapter we are gonna make an function that counts how much a letters in the text
        Scanner scan = new Scanner(System.in);
        System.out.println("Please type an text.");
        String uText= scan.nextLine();
        findTheLetter(uText);
    }

    private static void findTheLetter(String uText) {
        List<String> listCharacter= new ArrayList<>();
        int count=0;
        for (int i = 0; i < uText.length(); i++) {
            for (int j = i+1; j < uText.length(); j++) {
                if (uText.charAt(i)==uText.charAt(j)){
                    count++;
                }
            }
            if (count>0 && !listCharacter.contains(uText.substring(i,i+1)) &&
                    !uText.substring(i,i+1).contains(" ")) {
                listCharacter.add(uText.substring(i,i+1));

            }
            count=0;

        }
        System.out.println(listCharacter);
    }
}
