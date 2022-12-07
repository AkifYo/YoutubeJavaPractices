package P02_Tax_Calculate;

import java.util.Scanner;

public class A02_Shopping_List {
    public static void main(String[] args) {
        double cucumber= 0.89;
        double tomato=1.24;
        double patato= 1.23;
        double aubergine=1.78;
        double mashroom=2.57;
        Scanner scan = new Scanner(System.in);
        System.out.println("======Grocery List========\n" +
                "Cucumber per kg 0.89 Euro \n" +
                "Tomato per kg 1.24 Euro\n" +
                "Patato per kg 1.23 Euro\n" +
                "Aubergine per kg 1.78\n" +
                "Mashroom per kg 2.57");

       System.out.print("Please type how much kg Cucumner want you to buy?: ");
       int cucumberBuy= scan.nextInt();
        System.out.print("Please type how much kg Tomato want you to buy?: ");
        int tomatoBuy= scan.nextInt();
        System.out.print("Please type how much kg Patato want you to buy?: " );
        int patatoBuy= scan.nextInt();
        System.out.print("Please type how much kg Auburgine want you to buy?: ");
        int auburgineBuy= scan.nextInt();
        System.out.print("Please type how much kg Mashroom want you to buy?: ");
        int mashroomBuy= scan.nextInt();

        System.out.println("=====Your Grocery BILL=====\n" +
                "THE COST OF CUCUMMBER : "+(cucumberBuy*cucumber)+ "\n" +
                "THE COST OF TOMATO : "+(tomatoBuy*tomato)+"\n" +
                "THE COST OF PATATO : "+(patatoBuy*patato)+"\n" +
                "THE COST OF AUBURGINE: "+(auburgineBuy*aubergine)+"\n" +
                "THE COST OF MASHROOM: "+(mashroomBuy*mashroom));
        double totCost=(cucumberBuy*cucumber)+(tomatoBuy*tomato)+(patatoBuy*patato)+(auburgineBuy*aubergine)+(mashroomBuy*mashroom);
        double tax= totCost*(0.21);
        System.out.println("TAX : "+tax+"\n" +
                "***YOU MUST PAY TOTAL  : "+(tax+totCost)+" ***");
}
}
