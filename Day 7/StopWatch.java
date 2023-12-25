import java.util.*;
import java.time.LocalTime;
import java.time.Duration;

public class StopWatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String click;
        
        LocalTime startTime = null;
        LocalTime stopTime = null;

        System.out.println("Enter y for Start: ");
        click = sc.nextLine();
        if(click.equals("y"))
        {
            startTime = LocalTime.now();
        }

        System.out.println("Enter n for Stop: ");
        click = sc.nextLine();
        if(click.equals("n"))
        {
            stopTime = LocalTime.now();
        }

        if(startTime!= null && stopTime!= null)
        {
            Duration duration = Duration.between(startTime, stopTime);
            System.out.println(duration);
        }

        

    }
}
