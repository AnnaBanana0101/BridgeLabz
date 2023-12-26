import java.time.LocalDateTime;

public class CompanyShares {

    String stock_symbol;
    double stock_value;
    int no_of_shares;
    LocalDateTime date_of_purchase;

    public CompanyShares(String ss, double sv, int nos, LocalDateTime dop)
    {
        stock_symbol = ss;
        stock_value = sv;
        no_of_shares = nos;
        date_of_purchase = dop;
    }
}