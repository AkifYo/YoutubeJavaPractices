package P05_Taximeter;

import java.util.Scanner;

public class A01_Taximeter {
    public static void main(String[] args) {
        // first we find hoelong an taxi goes
        Scanner scan= new Scanner(System.in);
        System.out.print("Can you just say howlong did you ride?  :");
        double taxRate= 0.19;

        double wayLong= scan.nextDouble();
        double costRide= 3.5*wayLong;
        if (costRide<15.00||wayLong<6.00){
            costRide=15.00;
        }

        System.out.println("========Your total cost for Rijding=======");
        System.out.println("===Your rijd : "+wayLong+" km");
        System.out.println("===Your cost : "+costRide+" dollar");
        System.out.println("===Your tax rate : "+taxRate+" dollar");
        System.out.println("===You must pay total : "+(taxRate*costRide+costRide)+" dollar");

    }

}
