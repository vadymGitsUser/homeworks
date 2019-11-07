import java.util.Scanner;

public class NextDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        System.out.println("Please input day");
        String inputDay = scanner.next();
        DaysOfWeek day = checkDay( inputDay );
        System.out.println("Next Day");
        switch (day.getNextDay()){
            case 0:
                System.out.println("MONDAY");
                break;
            case 1:
                System.out.println("TUESDAY");
                break;
            case 2:
                System.out.println("WEDNESDAY");
                break;
            case 3:
                System.out.println("THURSDAY");
                break;
            case 4:
                System.out.println("FRIDAY");
                break;
            case 5:
                System.out.println("SATURDAY");
                break;
            case 6:
                System.out.println("SUNDAY");
                break;
            default:
                System.out.println("Error");
        }

    }
    public static DaysOfWeek checkDay(String inputDay){
        switch (inputDay.toUpperCase()){
            case "MONDAY":
                return DaysOfWeek.MONDAY;

            case "TUESADY":
                return DaysOfWeek.TUESDAY;

            case "WEDNESDAY":
                return DaysOfWeek.WEDNESDAY;

            case "THURSDAY":
                return DaysOfWeek.THURSDAY;

            case "FRIDAY":
                return DaysOfWeek.FRIDAY;

            case "SATURDAY":
                return DaysOfWeek.SATURDAY;

            case "SUNDAY":
                return DaysOfWeek.SUNDAY;
            default:
                return null;

        }

    }
}
