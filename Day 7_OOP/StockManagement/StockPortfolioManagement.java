import java.util.*;

public class StockPortfolioManagement {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Stock Management!");
        System.out.println(" ");

        int no_of_stocks;
        String stock_name;
        int no_of_shares;
        int share_price;
        int total_stock_value=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of stocks: ");
        no_of_stocks = sc.nextInt();

        for(int i =0; i<no_of_stocks; i++){
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Enter stock name: ");
            stock_name = sc1.nextLine();

            System.out.println("Enter no of shares: ");
            no_of_shares = sc1.nextInt();

            System.out.println("Enter share price: ");
            share_price = sc1.nextInt();

            Stock stock = new Stock(stock_name, share_price);
            StockPortfoilo stockPortfoilo = new StockPortfoilo(no_of_shares, stock);

            System.out.println("Total value of stock "+ stock_name + ":" + stockPortfoilo.getTotalStockPrice());
            total_stock_value = total_stock_value + stockPortfoilo.getTotalStockPrice();  
        }

        System.out.println("");
        System.out.println("Total value of the stocks: "+ total_stock_value);
    }
}
