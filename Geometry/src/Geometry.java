import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Menu*");
        System.out.println("1: Print the rectangle");
        System.out.println("2: Print the square triangle " +
                "(The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right");
        System.out.println("3: Print isosceles triangle");
        System.out.println("4: Exit");

        System.out.print("Choice: ");
        int choiceValue = input.nextInt();

        if (choiceValue == 4) {
            System.out.println("Bye bye ^^");
        }
        switch (choiceValue) {
            case 1:
                System.out.print("Input weight: ");
                double weightRectangle = input.nextDouble();
                System.out.print("Input height: ");
                double heightRectangle = input.nextDouble();

                for (int i = 0; i < heightRectangle; i++) {
                    for (int j = 0; j < weightRectangle; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;
            case 2:
                System.out.print("Input height: ");
                int heightSquareTriangle= input.nextInt();

                System.out.println("top-left: ");
                for (int i = 0; i < heightSquareTriangle; i++) {
                    for (int j = i; j <heightSquareTriangle ; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                System.out.println("top-right: ");
                for (int i = heightSquareTriangle; i > 0; i--) {
                    for (int j =heightSquareTriangle- i; j >0; j--) {
                        System.out.print(" ");
                    }
                    for (int j = i; j >0 ; j--) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                System.out.println("bottom-left: ");
                for (int i = heightSquareTriangle; i >0; i--) {
                    for (int j =heightSquareTriangle-i+1 ; j >0 ; j--) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                System.out.println("bottom-right: ");
                for (int i = heightSquareTriangle; i >0 ; i--) {
                    for (int j = i; j >0 ; j--) {
                        System.out.print(" ");
                    }
                    for (int j = heightSquareTriangle-i+1; j >0; j--) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 3:
                System.out.print("Input height: ");
                int heightIsoscelesTriangle= input.nextInt();

                System.out.println("Print isosceles triangle");
                System.out.println("bottom-right: ");
                for (int i = heightIsoscelesTriangle; i >0 ; i--) {
                    for (int j = i+1; j >0 ; j--) {
                        System.out.print(" ");
                    }
                    for (int j = 2*(heightIsoscelesTriangle-i+1)-1; j >0; j--) {
                        System.out.print("*");
                    }
                    System.out.println();
                }

        }
    }
}
