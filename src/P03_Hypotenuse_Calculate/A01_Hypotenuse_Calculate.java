package P03_Hypotenuse_Calculate;

import java.util.Scanner;

public class A01_Hypotenuse_Calculate {
    public static void main(String[] args) {
        //first take the first side of the triangle
        System.out.print("Please type the first side:  ");
        Scanner scan = new Scanner(System.in);
        int firstSide= scan.nextInt();
        // second side
        System.out.print("Please type the second side:  ");
        int secondSide= scan.nextInt();
        //firsside*firstside + secaondside*secondside= last side*last side (hypotenuse)
        double lastSide= Math.sqrt((firstSide*firstSide)+(secondSide*secondSide));
        System.out.println("****The last side van the triangel is: " +lastSide+" *****");
    }
    }

