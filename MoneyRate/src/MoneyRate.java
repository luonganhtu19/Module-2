import java.util.Scanner;

public class MoneyRate {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("CHANGE : ");
        System.out.println("1: VND-USD");
        System.out.println("2: USD-VND");
        System.out.println("0: Exit");
        System.out.print("Input choose: ");
        int typeMoney=input.nextInt();
        if(typeMoney==0){
            System.out.println("Exit program rate moneys");
            return;
        }
        System.out.print("Input amount moneys: ");
        Double amount= input.nextDouble();
        switch (typeMoney){
            case 2:
                amount=amount*23000;
                System.out.println("Your money is worth "+amount+" VND");
                break;
            case 1:
                amount=amount/23000;
                System.out.printf("Your money is worth %.2f USD",amount);
                break;
        }
    }
}
