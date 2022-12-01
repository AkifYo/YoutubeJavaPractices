package P01_Grades_Calculate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A02_Sort_The_Numbers {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int number;
        int i= 1;
        List<Integer> sayilar= new ArrayList<>();
        do {
            System.out.println("Please type "+i+" number");
            number= scan.nextInt();
            System.out.println("Please type the 0 to exit");
            if (!(number==0))
            {
                sayilar.add(number);
            }

            i++;
        }while (!(number==0));
        System.out.println(sayilar);
        int minNum=sayilar.get(0);
        int maxNum=sayilar.get(0);
        for (int j = 0; j < sayilar.size(); j++) {

            if (maxNum>sayilar.get(j))
            {
                maxNum= maxNum;

            } else
            {
                maxNum= sayilar.get(j);

            }
            if ( minNum< sayilar.get(j)) {
                minNum=minNum;
            }else {
                minNum= sayilar.get(j);
            }

        }System.out.println("Max Number : " +maxNum + "\n" +
                "Min Number: "+minNum );






    }
}
