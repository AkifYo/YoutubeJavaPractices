package P03_Hypotenuse_Calculate;

import java.util.Scanner;

public class A02_Armstrong_Number {

    public static void main(String[] args) {
        /*
    If the sum of the cubes of the digits of a number is equal to that number
     it means this number is an amstrong number for example:
     153= 1*1*1 + 5*5*5 + 7*7*7 =153
     370= 3*3*3 + 7*7*7 + 0*0*0=370
     */
        Scanner scan = new Scanner(System.in);
        System.out.print("***Plase type a number so that we can chack it whether it is a amstrong number : ");
       int userNo= scan.nextInt();
        int num1=userNo;
        int total=0;
        //15

        for (int i = 1; i <= Integer.toString(userNo).length(); i++) {
        int firstdgd= num1%10;
        total+=(firstdgd*firstdgd*firstdgd);
        num1=num1/10;
        }
        if(total==userNo){
            System.out.println("========User number "+userNo+ " is a amstrong number============");
        } else {
            System.out.println("========User number "+userNo+ " is NOT a amstrong number============");
        }
    }


}
