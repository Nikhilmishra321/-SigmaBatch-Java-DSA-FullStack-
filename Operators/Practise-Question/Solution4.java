

public class Solution4 {
    public static void main(String[] args) {
        int x=10, y=5;

        int exp1 =(y*(x/y+x/y));
        int exp2=(y*x/y+y*x/y);

        System.out.println(exp1);
        System.out.println(exp2);
    }
    
}

/*
 * exp 1=(5*(10/5+10/5));
 * 
 * exp 1 =(5*2+ 2)
 * exp 1 =(20)
 * 12
 * 
 * 
 * exp 2=(5*10/5+5*10/5);
 * exp 2 =(5*10/5+5*2);
 * exp 2=(50/50)
 * 
 */
