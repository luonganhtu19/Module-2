import com.sun.xml.internal.ws.api.BindingIDFactory;

import java.awt.*;
import java.util.Scanner;

public class deleteElement {
    public static void main(String[] args) {
        double[] arrayNumber;
        int size = 0;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Input number element of array(less than 20): ");
            String inputSize = input.nextLine();
            if (!isNumeric(inputSize)) {
                System.out.println("Please input size just type number");
                continue;
            }
            size =(int) Double.parseDouble(inputSize);
        } while (size > 20);
        arrayNumber = new double[size];
        int length = size;
        while (size > 0) {
            System.out.print("Element " + (length - size + 1)+": ");
            String inputNumber = input.nextLine();
            if (!isNumeric(inputNumber)) {
                System.out.println("please input value element is number");
                continue;
            }
            arrayNumber[length - size] = Double.parseDouble(inputNumber);
            size--;
        }

        do {
            System.out.println("Menu: ");
            System.out.println("1. Add element for array");
            System.out.println("2. Delete element of arry");
            System.out.println("0. Exit");
            System.out.print("Choice: ");
            int choice =(int) Double.parseDouble(input.nextLine());
            if (choice != 0 && choice != 1 && choice != 2) {
                System.out.println("Please choice of Menu");
                continue;
            }
            if (choice == 0) {
                break;
            }
            if (choice ==1){
                addElement(arrayNumber);
            }
            if (choice == 2) {
                deleteElement(arrayNumber);
            }
        } while (true);
    }

    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }
    public static void display(double[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println("");
    }
    public static void deleteElement(double[] array) {
        Scanner inputElementDelete = new Scanner(System.in);
        System.out.println("Please input value(type number) of element to be delete ");
        String valueEle = inputElementDelete.nextLine();
        if (!isNumeric(valueEle)) {
            deleteElement(array);
        }
        boolean isExit=false;
        double value = Double.parseDouble(valueEle);
        for (int i = 0; i < array.length; i++) {
            if (array[i]==value) {
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                i--;
                array[array.length - 1] = 0;
                isExit=true;
            }
        }
        if (isExit==true){
            display(array);
        }else {
            System.out.println("No exit element: "+valueEle);
        }
    }
    public static void addElement( double[] arrayNumber){
        int length=arrayNumber.length;
        Scanner inputElement= new Scanner(System.in);
        display(arrayNumber);
        int index=0;
        Boolean checkIndex=true;
        String valueEle;
        do {
            System.out.println("Position is want add element (It has Value less than  " +length+" is length of array )");
            String strIndex=  inputElement.nextLine();
            if (!isNumeric(strIndex)) continue;
             index=(int) Double.parseDouble(strIndex);
            if (index>length||index<0) continue;
            checkIndex=false;
        }while (checkIndex);
        do {
            System.out.println("Value of element is position "+index+" :");
            valueEle=inputElement.nextLine();
        } while (!isNumeric(valueEle));
        arrayNumber[index]=Double.parseDouble(valueEle);
        display(arrayNumber);
    }
}
