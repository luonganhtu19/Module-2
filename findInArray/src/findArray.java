import java.util.Scanner;

public class findArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("find char in Array");
        // input array
        String[] array;
        int size=0;
        //int choice=0;
        do {
            System.out.println("enter size");
            size = Integer.parseInt(input.nextLine());
//            size=input.nextInt();
            if (size > 20)
                System.out.println("size does not exceed 20");
        } while (size > 20);

        array = new String[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element at " + (i+1) + ":");
            array[i] = input.nextLine();
        }
        System.out.println("Menu");
        System.out.println("1. Display");
        System.out.println("2. Find array");
        System.out.println("3. Find min");
        System.out.println("4. Find max");
        int choice = Integer.parseInt(input.nextLine());
        if (choice == 1) {
            System.out.println("Elements in array: ");
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j] + "\t");
            }
        }
        System.out.println();
        if (choice == 2) {
            System.out.println("Enter a value find in array");
            String input_value = input.nextLine();
            boolean isExist = false;
            for (int j = 0; j < array.length; j++) {
                if (array[j].equals(input_value)) {
                    System.out.println("Position of the students in the list " + input_value + " is: " + (j + 1));
                    isExist = true;
                    break;
                }
            }
            if (!isExist) {
                System.out.println("Not found " + input_value + " in the list");
            }
        }
        System.out.println();
        if (choice==3){
            int indexMax=0;
            int max=Integer.parseInt(array[0]);
            for (int i = 1; i < array.length; i++) {
                int temp=Integer.parseInt(array[i]);
                if (max<temp){
                    max=temp;
                    indexMax=i;
                }
            }
            System.out.println("Value max in array: "+ max+ " has position :" +indexMax);
        }
        if (choice==4){
            int indexMin=0;
            int min=Integer.parseInt(array[0]);
//            System.out.println(min);
            for (int i = 1; i < array.length; i++) {
                int temp=Integer.parseInt(array[i]);
                if (min>temp){
                    min=temp;
                    indexMin=i;
                }
            }
            System.out.println("Value min in array: "+ min+ " has index :" +indexMin);
        }
    }
}
