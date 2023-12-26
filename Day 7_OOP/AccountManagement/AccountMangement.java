import java.util.*;

public class AccountMangement {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Account Management!");

        Account account = new Account();
        int done = 0;

        do{

            Scanner sc = new Scanner(System.in);
            System.out.println("");
            System.out.println("What would you like to do? Enter the option number:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("");

            int option = sc.nextInt();

            switch (option) {
                case 1:
                    account.checkBalance();
                    break;
                case 2:
                    System.out.println("Enter the amount to deposit:");
                    float amount_debit = sc.nextFloat();

                    account.debit(amount_debit);
                    break;
                case 3:
                    System.out.println("Enter the amount to withdraw:");
                    float amount_credit = sc.nextFloat();

                    account.credit(amount_credit);
                    break; 
                default:
                    System.out.println("Enter a valid option.");
                    break;
            }

            System.out.println("Are you done? 0 for no, 1 for yes");
            Scanner sc1 = new Scanner(System.in);
            done = sc.nextInt();

        } while(done!=1);
        



    }
}
