import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        String[][] nameOfNumber = {
                {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"},
                {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "nineteen"},
                {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"},
                {"hundred"}
        };
        int number;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Input Number greater than 0 and less than 1000: ");
            number = input.nextInt();
        } while (1000 <= number || number < 0);

        if (number < 10) {
            System.out.println("Number : " + number + " is " + nameOfNumber[0][number]);
        } else if (number < 20) {
            System.out.println("Number : " + number + " is " + nameOfNumber[1][number - 10]);
        } else if (number < 100) {
            int tenOfDigits = number / 10 - 2;
            String nameTenOfDigits = nameOfNumber[2][tenOfDigits];
            if (number % 10 == 0) {
                System.out.println("Number : " + number + " is " + nameTenOfDigits);
            } else
                System.out.println("Number : " + number + " is " + nameTenOfDigits + "-" + nameOfNumber[0][number % 10]);
        } else {
            int hundred = number / 100;
            int tenOfDigits = number % 100;
            int rowOfDigits = tenOfDigits % 10;
//            System.out.println(hundred+":"+tenOfDigits+":"+":"+rowOfDigits);
            if (tenOfDigits < 10) {
                if (rowOfDigits!=0)
                System.out.println("Number : " + number + " is " + nameOfNumber[0][hundred] + " hundred and " + nameOfNumber[0][rowOfDigits]);
                else
                    System.out.println("Number : " + number + " is " + nameOfNumber[0][hundred] + " hundred ");


            } else if (tenOfDigits < 20) {
                System.out.println("Number : " + number + " is " + nameOfNumber[0][hundred] + " hundred " + nameOfNumber[1][tenOfDigits - 10]);
            } else {
                tenOfDigits = tenOfDigits / 10;
                String nameTenOfDigits = nameOfNumber[2][tenOfDigits - 2];
                if (rowOfDigits != 0)
                    System.out.println("Number : " + number + " is " + nameOfNumber[0][hundred] + " hundred " + nameTenOfDigits + "-" + nameOfNumber[0][rowOfDigits]);
                else
                    System.out.println("Number : " + number + " is " + nameOfNumber[0][hundred] + " hundred " + nameTenOfDigits);

            }
        }
    }
}
