//Question no: 1
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Datetime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first date (YYYY-MM-DD): ");
        String firstDateString = scanner.nextLine();
        LocalDate firstDate = LocalDate.parse(firstDateString);

        System.out.println("Enter the second date (YYYY-MM-DD): ");
        String secondDateString = scanner.nextLine();
        LocalDate secondDate = LocalDate.parse(secondDateString);

        long difference = Math.abs(ChronoUnit.DAYS.between(firstDate, secondDate));
        System.out.println("The difference between the two dates is: " + difference + " days");

        scanner.close();
    }
}
//Question no:2
import java.util.Scanner;

public class Datetime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter time in 24-hour format (e.g., 14:23): ");
        String time24 = scanner.nextLine();
        
        String time12 = convertTo12HourFormat(time24);
        
        System.out.println("Time in 12-hour format: " + time12);
        
        scanner.close();
    }
    
    public static String convertTo12HourFormat(String time24) {
        int hour = Integer.parseInt(time24.split(":")[0]);
        int minute = Integer.parseInt(time24.split(":")[1]);
        
        String period = (hour < 12) ? "AM" : "PM";
        
        if (hour == 0) {
            hour = 12;
        } else if (hour > 12) {
            hour -= 12;
        }
        
        return String.format("%d:%02d%s", hour, minute, period);
    }
}