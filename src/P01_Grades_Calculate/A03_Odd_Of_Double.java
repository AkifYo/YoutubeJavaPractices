package P01_Grades_Calculate;

import java.util.Scanner;

public class A03_Odd_Of_Double {
    public static void main(String[] args) {
       /*
       if a number could be divided, two this number is double.
       if not then it is odd number
        */

        Scanner scan= new Scanner(System.in);

        int count=0;
        while (count<3){

            System.out.print("Type a number : ");
            int userNumber= scan.nextInt();
            if (userNumber%2==1){
                System.out.println("Your number is odd : "+userNumber);
            } else {
                System.out.println("Your number is double : "+userNumber);
            }
            count++;
        }
    }
}
