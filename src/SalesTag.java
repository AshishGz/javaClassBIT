import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class SalesTag{
    double tax_percent=7;
    double totalActualPrice=0;
    double actualPrice=0;
    double sellPrice=0;
    double selltax=0;
    private static final DecimalFormat df = new DecimalFormat("0.00");
    void takeInput(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter Actual Price or press -1 to terminate:");
        List<Double> list=new ArrayList<Double>();
        actualPrice = scanner.nextDouble();
         while (actualPrice!=-1){
             totalActualPrice = totalActualPrice + actualPrice;
             selltax=selltax+(actualPrice*0.07);
             sellPrice=sellPrice+(actualPrice-selltax);
             list.add(actualPrice);
             actualPrice = scanner.nextDouble();

         }
        System.out.print("Total Price");
        System.out.print("         ");
        System.out.print("Actutal Price");
        System.out.print("          ");
        System.out.println("Tax");
        for (int i=0; i<list.size(); i++)
        {
            double individual_tax=list.get(i)*0.07;
            double individual_sell_price=list.get(i)-individual_tax;
            System.out.print(df.format(list.get(i)));
            System.out.print("       ");
            System.out.print(df.format(individual_sell_price));
            System.out.print("        ");
            System.out.println(df.format(individual_tax));
        }
        System.out.println("=======================================");
        System.out.println("                                        ");
        System.out.println("Actual Price: "+df.format(totalActualPrice));
        System.out.println("Sales tag: "+df.format(selltax));
        System.out.println("Sell Price: "+df.format(sellPrice));
    }
}