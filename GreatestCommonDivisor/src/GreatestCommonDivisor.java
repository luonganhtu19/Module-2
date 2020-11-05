public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int a, b;
        java.util.Scanner nhap = new java.util.Scanner(System.in);
        System.out.println("Enter the first number: ");
        a = nhap.nextInt();
        System.out.println("Enter the second number: ");
        b = nhap.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0)
            System.out.println("No greatest common factor");
        int max=a>b?a:b;
        int min=a<b?a:b;
        while (min != 0) {
            int tmp=max%min;
            max=min;
            min=tmp;
        }

        System.out.println("Greatest common factor: " + max);
    }

}
