package Conditions.AssisementQuestion;

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int a =sc.nextInt();
        sc.close();

        if(a>=0 ){
            System.out.println("Postive Number");
        }
        else{
            System.out.println("Negative Number");
        }
    }
    
}
