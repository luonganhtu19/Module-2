import java.util.Scanner;

public class TemperatureSwitch {
    public static void main(String[] args) {
        System.out.println();
        Scanner input = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;

        do {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            System.out.print("Input temperature: ");

            switch (choice) {
                case 1:
                    fahrenheit=input.nextDouble();
                    celsius=fahrenheitToCelsius(fahrenheit);
                    System.out.printf("Fahrenheit Temperature: %.2f  equal %.2f Celsius",fahrenheit,celsius);
                    break;
                case 2:
                    celsius=input.nextDouble();
                    fahrenheit=celsiusToFahrenheit(celsius);
                    System.out.printf("Celsius Temperature: %.2f  equal %.2f fahrenheit",celsius,fahrenheit);
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);

    }
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }

}
