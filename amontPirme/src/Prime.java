import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Menu: ");
        System.out.println("1. Price less than Number");
        System.out.println("2. Amount price = number price");
        System.out.println("0. Exit");
        System.out.print("Choice: ");
        int choice = input.nextInt();

        if (choice == 0) {
            System.out.println("Bye bye ^^");
        }

        System.out.print("Input Number: ");
        int number = input.nextInt();
        int count=0;

        switch (choice){
            case 1:
                for (int i = 2; i < number+1; i++) {
                    if (checkPrice(i)){
                        System.out.print(i+" ");
                    }
                }
                break;
            case 2:
                int i=2;
                while (count<number+1){
                    if (checkPrice(i)){
                        System.out.print(i+" ");
                        count++;
                    }
                    i++;
                }
                break;
        }
    }
    public static boolean checkPrice(int number){
        boolean isPrice=true;
        if (number<2) isPrice=false;
//        if (number==2)isPrice=true;
//        if (number==3)isPrice=true;
        if (number%2==0)isPrice=false;
        if (number%3==0)isPrice=false;
        for (int i = 5; i*i <number ; i=i+6) {
            if (number%i==0||number%(i+2)==0){
                isPrice=false;
                break;
            }
        }
        return isPrice;
    }
}
