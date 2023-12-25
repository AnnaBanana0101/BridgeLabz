import java.util.*;

public class ReverseNumber {

    public static void main(String[] args) {
        
        System.out.println("Enter number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int remainder=0, reverse_number = 0;

        while(number>0)
        {
            remainder = number%10;
            reverse_number = reverse_number*10 + remainder;
            number = number/10;
        }

        System.out.println(reverse_number);
    }
}