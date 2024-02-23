import java.util.Scanner;

public class CalculateSum {

    public static void calulateSum(){ //formal parameter
        Scanner sc =new Scanner(System.in);

        int a= sc.nextInt();
        int b=sc.nextInt();

        int sum= a+b;
        System.out.println("Sum" +sum);
        sc.close();

    }
    public static void main(String[] args) {
        calulateSum();//actual parameter //argument
        
        
    }
    
}
