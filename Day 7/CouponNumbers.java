import java.util.*;

public class CouponNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");

        int number = sc.nextInt();

        int trail_number =  numberOfTrials(number);
        System.out.println("Number of trials: " + trail_number);
    }

    private static int numberOfTrials(int num_distinct_coupons)
    {
        Set<Integer> couponSet = new HashSet<>();
        int no_of_trials = 0;

        while(couponSet.size()<num_distinct_coupons)
        {
            int coupon = generateRandomCoupon(num_distinct_coupons);
            couponSet.add(coupon);
            no_of_trials++;
        }

        return no_of_trials;
    }

    private static int generateRandomCoupon(int num_distinct_coupons)
    {
        int randomCoupon = (int) (Math.random()*num_distinct_coupons);
        return randomCoupon;
    }
}