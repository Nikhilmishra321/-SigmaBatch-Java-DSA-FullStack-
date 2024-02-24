package QuestionPractise;

import java.util.Scanner;

public class Solution1 {
    public static double Average(double x, double y,double z){
        return (x+y+z)/3;


    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double x=sc.nextDouble();
        double y=sc.nextDouble();
        double z=sc.nextDouble();

        System.out.println("average value is "+ Average(x,y,z)+"\n");
        sc.close();

        
    }
    
}
