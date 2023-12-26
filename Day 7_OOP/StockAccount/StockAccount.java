import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StockAccount {

    ArrayList<CompanyShares> stockList = new ArrayList<>();
    String account_name;
    double total_value;
    HashMap<CompanyShares, Integer> acquiredStockMap = new HashMap<>();

    public StockAccount(String filename)
    {
        account_name = filename;
        total_value = 1000;
    }

    public double valueOf()
    {
        return total_value;
    }

    public void buy(int amount, String symbol)
    {
        for(int i=0; i<stockList.size(); i++)
        {
            if(symbol.equals(stockList.get(i).stock_symbol))
            {
                if(amount<=stockList.get(i).no_of_shares)
                {
                    stockList.get(i).no_of_shares -= amount;
                    total_value -= (stockList.get(i).stock_value)*amount;
                    acquiredStockMap.put(stockList.get(i), amount);
                }
                else
                {
                    System.out.println("Not enough shares available");
                    return;
                }
                break;
            }
            else
            {
                System.out.println("No stock of the given name available");
                return;
            }
        }
    }

    public void sell(int amount, String symbol)
    {
        for(int i=0; i<stockList.size(); i++)
        {
            if(acquiredStockMap.containsKey(symbol))
            {
                if(amount<=acquiredStockMap.get(symbol))
                {
                    stockList.get(i).no_of_shares += amount;
                    total_value += (stockList.get(i).stock_value)*amount;
                    int newValue = acquiredStockMap.get(symbol) - amount;
                    acquiredStockMap.put(stockList.get(i), newValue);
                }
                else
                {
                    System.out.println("Not enough shares available");
                    return;
                }
                break;
            }
            else
            {
                System.out.println("No stock of the given name available in acquired shares");
                return;
            }
        }
    }

    public void printReport()
    {
        //System.out.println(acquiredStockMap);
        System.out.println("Stock Name"+ "\t" + "Number" + "\t" + "DateTime");
        for(Map.Entry<CompanyShares, Integer> entry: acquiredStockMap.entrySet())
        {
            CompanyShares key = entry.getKey();
            int value = entry.getValue();

            System.out.println(key.stock_symbol + "\t\t" + value + "\t" + key.date_of_purchase);

        }
    }


}