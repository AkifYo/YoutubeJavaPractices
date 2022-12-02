package P05_Taximeter;

import java.util.Random;
import java.util.Scanner;

public class A02_Guess_The_Number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        Random random= new Random();
        int userNumber;
        int compNumber;
        do {
            System.out.print("Please guess the number the computer choose from 0 to 10 randomly?  Say a Number: ");
            userNumber= scan.nextInt();
            compNumber= random.nextInt(10);
            System.out.println("=Your number = *** " + userNumber + "   Computer Choices= *** "+compNumber);
            if (userNumber==compNumber){
                System.out.println("===You guessed the right number===");
            }
        } while (!(userNumber==compNumber));



    }
}
