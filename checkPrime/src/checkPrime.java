import java.util.Scanner;

public class checkPrime {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Input number need check prime: ");
        int numberInput=scanner.nextInt();

        boolean isPrime=true;
        if(numberInput<2)   isPrime=false;
//        if (numberInput==2) isPrime=true;
//        if (numberInput==3) isPrime=true;
        if (numberInput%2==0||numberInput%3==0) isPrime=false;
        for (int i = 5; i*i <numberInput ; i=i+6) {
            if (numberInput%i==0||numberInput%(i+2)==0){
                isPrime=false;
            }
        }
        if (isPrime){
            System.out.println("Number "+numberInput+" is number prime");
        }else {
            System.out.println("Number "+numberInput+" is not number prime");
        }
    }
}
