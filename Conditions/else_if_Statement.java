package Conditions;

public class else_if_Statement {
    public static void main(String[] args) {
        int age=15;

        if(age>=18){
            System.out.println("You adult");
        }
        else if(age>=13 && age<=18){
            System.out.println("You are teneger");
        }
        else{
            System.out.println("child");
        }
        
    }
    
}
