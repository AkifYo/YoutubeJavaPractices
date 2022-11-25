package P04_Body_Index;

import java.util.Scanner;

public class A01_Body_Index_Calculate {
    public static void main(String[] args) {
        // take the weight of users
        System.out.print("Please type your kg: ");
        Scanner scan = new Scanner(System.in);
        double yourKg= scan.nextDouble();
        // take the tall of usera
        System.out.println("Please type your long as meter");
        double yourTall= scan.nextDouble();
        double indexOfBody= yourKg/(yourTall*yourTall);
        System.out.println("=========== Body Index======="+"\nYour kg  :"+yourKg+"\nYour tall : "
                +yourTall+"\nYour body index: "+Math.round(indexOfBody)+"\n====================");
    }
    public static double getBodyIndex(){
        System.out.print("Please type your kg: ");
        Scanner scan = new Scanner(System.in);
        double yourKg= scan.nextDouble();
        // take the tall of usera
        System.out.println("Please type your tall as meter");
        double yourTall= scan.nextDouble();
        double indexOfBody= yourKg/(yourTall*yourTall);
        return indexOfBody;
    }
}
