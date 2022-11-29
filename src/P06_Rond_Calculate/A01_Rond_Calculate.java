package P06_Rond_Calculate;

import java.util.Scanner;

public class A01_Rond_Calculate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please give the radius of an rond? ");
        double rad= scan.nextDouble();
        double squireOfCircle= Math.PI*rad*rad;
        double longOfRond=2*Math.PI*rad;

        System.out.println("========Your rond calculation=====");
        System.out.println("===Circle area : "+ Math.round(squireOfCircle));
        System.out.println("===Circumference of the Rond : "+ Math.round(longOfRond) );
        System.out.println("========Your rond calculation=====");

    }

}
