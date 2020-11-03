
import java.util.Scanner;

public class DayOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Find days Month");
        System.out.print("Input month: ");
        int inMonth = scanner.nextInt();
        System.out.print("Input Year: ");
        int inYear = scanner.nextInt();
        boolean isLeapYear;

        if (inYear % 4 == 0) {
            if (inYear % 100 != 0) {
                isLeapYear = true;
            } else {
                if (inYear % 400 == 0) {
                    isLeapYear = true;
                } else {
                    isLeapYear = false;
                }
            }
        } else {
            isLeapYear = false;
        }
        if (isLeapYear) {
            if (inMonth == 2) {
                System.out.println(inYear + " is Leap Year  and 2 month has 29 days ");
            } else {
                System.out.print(inYear + " is Leap Year and ");
            }
        } else {
            if (inMonth == 2) {
                System.out.println(inYear + " is Common Year and 2 month has 28 days ");
            } else {
                System.out.print(inYear + " is Common Year: and ");
            }
        }
        switch (inMonth) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.print("The month '" + inMonth + "' has 31 days!");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.print("The month '" + inMonth + "' has 30 days!");
                break;
            default:
                System.out.print("Invalid input!");
                break;
        }
    }
}
