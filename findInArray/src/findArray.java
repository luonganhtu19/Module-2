import java.util.Scanner;

public class findArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("find char in Array");
        // input array
        String[] array;
        int size;
        do {
            System.out.println("enter size");
            size = Integer.parseInt(input.nextLine());
//            size=input.nextInt();
            if (size>20)
                System.out.println("size does not exceed 20");
        }while (size>20);

        array= new String[size];
//
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element at " + (i+1) + ":");
            array[i] = input.nextLine();
        }
        System.out.println("Elements in array: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j]+"\t");
        }
        System.out.println();
        System.out.println("Enter a name's student");
        String input_value= input.nextLine();
        boolean isExist=false;
        for (int j = 0; j < array.length; j++) {
            if (array[j].equals(input_value)){
                System.out.println("Position of the students in the list " + input_value + " is: " + (j + 1));
            isExist=true;
            break;
            }
        }
        if (!isExist){
            System.out.println("Not found "+input_value+" in the list");
        }
    }
}
