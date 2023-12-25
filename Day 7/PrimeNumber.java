import java.uitl.*;
import java.util.Scanner;

public class PrimeNumber{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");

        int number = sc.nextInt();
        int count = 0;

        if(number==0 || number==1)
        {
            System.out.println("Not prime");
            return;
        }

        for(int i=2; i<=number; i++){

            if(number%i==0)
                count++;
        }

        if(count>1)
        {
            System.out.println("Not Prime");
        }
        else if (count==1)
        {
            System.out.println("Prime");
        }
    }
}