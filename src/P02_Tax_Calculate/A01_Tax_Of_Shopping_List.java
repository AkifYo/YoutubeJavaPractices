package P02_Tax_Calculate;

public class A01_Tax_Of_Shopping_List {
    public static void main(String[] args) {
        /*
        Make a shopping list max 5 product
        1.Cola     per stock 3.00 dolar   buy two
        2.Cheese    per stock 4.00 dolar  buy three
        3.Olieve    per stock 5.00 dolar    buy three
        4.Mashroom  per stock 3.50 dolar    buy six
        5.Ketchup   per stock 4.50 dolar    buy five
        tax %21
        make the shopping then pay the bill with tax
         */
        double cola= 3.0;
        double cheese= 4.0;
        double olieve= 5.0;
        double mashroom= 3.5;
        double ketchup= 4.5;

        double totalCostOfProduct= 2*cola+3*cheese+3*olieve+6*mashroom+5*ketchup;
        double tax=Math.round(totalCostOfProduct*0.21) ;
        double totalCost= totalCostOfProduct+tax;
        //==================//

        System.out.println("=============Your Bill================");
        System.out.println("Total cost of product : "+totalCostOfProduct);
        System.out.println("Total tax : "+tax);
        System.out.println("You should pay total : "+totalCost);
        System.out.println("=========================================");

    }
}
