import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A =sc.nextInt();
        int B= sc.nextInt();
        int C =sc.nextInt();

        int average= (A+B+C) / 3;
        System.out.println( "Sum of three number " +average);
        sc.close();

        
    }
    
}
