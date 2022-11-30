package P07_Weather_Condition;

import java.util.Scanner;

public class A01_Weather_Condition {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print(" Could you say how much degrees is the weather ?  ");
        double degrees= scan.nextDouble();
        if (degrees<0){
            System.out.println("You can go to skying.");
        } else if (degrees<10) {
            System.out.println("You can go a walk.");
        } else if (degrees<20) {
            System.out.println("You can go to a cinema.");
        } else if (degrees<30) {
            System.out.println("You can go to swimming.");
        }
        else {
            System.out.println("You can stay at home.");
        }
    }
}
