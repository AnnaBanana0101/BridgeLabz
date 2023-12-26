import java.util.*;
import java.time.*;

public class StockAccountManagement {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to stock account management!");

        LocalDateTime time_of_purchase;
        time_of_purchase = LocalDateTime.now();
        CompanyShares stock1 = new CompanyShares("stock1", 200, 10, time_of_purchase);
        Thread.sleep(2000);

        time_of_purchase = LocalDateTime.now();
        CompanyShares stock2 = new CompanyShares("stock2", 100, 50, time_of_purchase);
        Thread.sleep(2000);

        time_of_purchase = LocalDateTime.now();
        CompanyShares stock3 = new CompanyShares("stock3", 300, 20, time_of_purchase);
        Thread.sleep(2000);

        StockAccount stockAccount = new StockAccount("Account1");

        stockAccount.stockList.add(stock1);
        stockAccount.stockList.add(stock2);
        stockAccount.stockList.add(stock3);

        System.out.println("Total value: " + stockAccount.valueOf());  
        System.out.println("");

        System.out.println("Operation1");
        stockAccount.buy(5, "stock1");
        System.out.println("Total value: " + stockAccount.valueOf()); 
        stockAccount.printReport();
        System.out.println("");

        System.out.println("Operation2");
        stockAccount.buy(20, "stock2");
        System.out.println("Total value: " + stockAccount.valueOf()); 
        stockAccount.printReport();
        System.out.println("");

        System.out.println("Operation3");
        stockAccount.sell(3, "stock1");
        System.out.println("Total value: " + stockAccount.valueOf()); 
        stockAccount.printReport();
        System.out.println("");

        stockAccount.buy(20, "stock3");
        System.out.println("Total value: " + stockAccount.valueOf()); 
        stockAccount.printReport();
        System.out.println("");



    }
}
