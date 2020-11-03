import java.util.Scanner;

public class InterestRate {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double money=1.0;
        int month=1;
        double interset_rate=1.0;

        System.out.print("Enter investment amount: ");
        money = input.nextDouble();
        System.out.print("Enter number of months: ");
        month = input.nextInt();
        System.out.print("Enter annual interest rate in percentage: ");
        interset_rate = input.nextDouble();

        double total_interset = 0;
        for(int i = 0; i < month; i++){
            total_interset += money * (interset_rate/100)/12 * month;
        }
        System.out.println("Total of interset: " + total_interset);
    }
}
