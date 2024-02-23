import java.util.Scanner;

public class JavaBasic {
    public static void main(String[] args) {
        // printHelloWorld();
        CalculateSum();
    }
    public static  void printHelloWorld()  {
        System.out.println("Hello World");
    
    }

    
    public static void CalculateSum(){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("sum is :" +sum);
        sc.close();
    }
    
    
}
