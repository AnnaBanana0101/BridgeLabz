import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {
        System.out.println("Enter number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int sum = 1;

        for(
        int i = 2; i<=Math.sqrt(number);i++)
        {
            if (number % i == 0) {
                sum = sum + i + (number/i);
                System.out.println(i + " " + number/i);
            }
        }

        if(sum==number)
        {
            System.out.println("Perfect Number");
        }else
        {
            System.out.println("Not perfect");
        }
    }
    
}