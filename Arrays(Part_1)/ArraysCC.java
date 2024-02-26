import java.util.Scanner;

public class ArraysCC {
    public static void main(String[] args) {
        int marks[] = new  int[50]; 

        Scanner sc= new Scanner(System.in);

        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();

        System.out.println("Physic :" + marks[0]);
        System.out.println("Chemeistry :" + marks[1]);
        System.out.println("Maths:" + marks[2]);


        int percentage=(marks[0] + marks[1] + marks[2]) / 3;

        System.out.println("Percentage " + percentage);


    }
    
}
