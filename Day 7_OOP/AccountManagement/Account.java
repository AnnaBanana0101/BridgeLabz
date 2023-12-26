
public class Account {

    float balance;

    public Account()
    {
        balance = 0;
    }

    public void debit(float amount)
    {
        balance = balance + amount;
        System.out.println("Debit successful! Total balance: " + balance);
        System.out.println("");
    }

    public void credit(float amount)
    {
        if(amount>balance)
        {
            System.out.println("Insufficient balance");
            System.out.println("");
            return;
        }

        balance = balance - amount;

        System.out.println("Credit succesful! Available balance: " + balance);
        System.out.println("");
    }

    public void checkBalance()
    {
        System.out.println("Total balance: " + balance);
        System.out.println("");
    }

}