import java.util.Scanner;

public class sumofTwoNo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        // int sum= a+b;
        int product = a * b;
        System.out.println("Sum of two number " + product);
        sc.close();
    }
    
}
