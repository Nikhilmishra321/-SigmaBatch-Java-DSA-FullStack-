package Conditions;

import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number =sc.nextInt();
        sc.close();
        

        if(number % 2 == 0){
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }

    }
    
}
