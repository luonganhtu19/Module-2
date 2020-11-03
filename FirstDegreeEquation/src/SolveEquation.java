import java.util.Scanner;

public class SolveEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Solve of equation: ax+b=0");

        System.out.print("Input a: ");
        double a = scanner.nextDouble();
        System.out.print("Input b: ");
        double b = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo so nghiem");
            } else
                System.out.println("phuong trinh vo nghiem");
        } else {
            double answer=-b/a;
            System.out.println("Phuong trinh 1nghiem "+(-b/a));
            System.out.format("Phuong trinh co 1 nghiem: %f",answer);
            System.out.println("Phuong trinh 1nghiem "+(-b/a));

        }
    }
}

