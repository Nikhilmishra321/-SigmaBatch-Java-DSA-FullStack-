package Conditions;
//variable=condition?statement1:statement2

public class TernaryOperator {
    public static void main(String[] args) {
        int number=4;
       String type= ((number % 2) ==0) ? "even" : "odd";
        System.out.println(type);
        
    }
    
}
