package QuestionPractise;

import java.util.Scanner;

public class Solution2 {
    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        }
        return false;
        

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();

        if(isEven(n)){
            System.out.println("The number is Even");
        }else{
            System.out.println("The number is odd");

        }
        
        
    }
    
}
