
public class StockPortfoilo{
    
    int number_of_shares;
    Stock stock;

    public StockPortfoilo(int nos, Stock s)
    {
        number_of_shares = nos;
        stock = s;
    }

    public int getTotalStockPrice()
    {
        return number_of_shares*stock.share_price;
    }
}