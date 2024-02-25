package Pattern_Advance;

public class Pattern {
    public static void hollow_Rectangle(int totRows, int totColum){
        for(int i=1; i<=totRows; i++){
            //inner loop
            for(int j=1; j<=totColum; j++){

                if(i==1 || i==totRows || j==1 || j== totColum){
                    System.out.println("*");
                }else{
                    System.out.println( " ");
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        
    }
    
}
