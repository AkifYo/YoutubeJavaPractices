package P01_Grades_Calculate;

import java.util.Scanner;

public class A01_Grades_Median {
    public static void main(String[] args) {
        // create a program that you can calculate average of  your midterm and final grades
        Scanner scan = new Scanner(System.in);
        // take first from users their grades.  math, chemistry end biology
        // Math Grades
        System.out.println("Please type your midterm math grade");
        double math1=scan.nextDouble();
        System.out.println("Please type your final math grade");
        double math2=scan.nextDouble();
        //=============//
        //Chemistry Grades

        System.out.println("Please type your midterm chemistry grade");
        double chem1=scan.nextDouble();
        System.out.println("Please type your final chemistry grade");
        double chem2=scan.nextDouble();
        //=============//
        //Biology grades
        System.out.println("Please type your midterm biology grade");
        double bio1=scan.nextDouble();
        System.out.println("Please type your final biology grade");
        double bio2=scan.nextDouble();
        // find the average each of category
        double averageOfMath= (math1+math2)/2;
        double averageOfChem= (chem1+chem2)/2;
        double averageOfBio= (bio1+bio2)/2;
        //find the total average all grades
        double totalAverage= (averageOfBio+averageOfChem+averageOfMath)/3;
        // Print all results to the console
        System.out.println("==============Your Averages=======================");
        System.out.println("Your math average is : "+averageOfMath);
        System.out.println("Your chemistry average is : "+averageOfChem);
        System.out.println("Your biology average is : "+averageOfBio);
        System.out.println("Your all over average is : "+totalAverage);
        System.out.println("=================================================");

    }
}
