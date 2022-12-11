package P09_String_Manupulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A02_String_Count {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a text : ");
        String userText= scan.nextLine();

        String[] wordArr = userText.split(" ");
        List<String> wordList= new ArrayList<>();
        for (int i = 0; i < wordArr.length ; i++) {
            int count=0;
            for (int j = 0; j < wordArr.length; j++) {
                if (wordArr[i].equals(wordArr[j])) {
                    count++;
                }

            }
            if (!wordList.contains(wordArr[i]+"="+count)){
                wordList.add(wordArr[i]+"="+count);

            }

        }
        for (int i = 0; i < wordList.size(); i++) {
            if (i<wordList.size()-1){
                System.out.println(wordList.get(i)+",");
            }else {
                System.out.println(wordList.get(i));
            }

        }


    }


}
