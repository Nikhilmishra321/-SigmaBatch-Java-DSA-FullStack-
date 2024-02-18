

public class Solution2 {
    public static void main(String[] args) {
        int x,y,z;
        x=y=z=2;
        x+=y;
        y-=z;
        z/=(x+y);
        System.out.println(x+" "+y+" "+z);
    }
    
}

/*
 * x=2,y=2,z=2;
 * 2+=2; = 4
 * 2-=2:=0
 * 2/=(2+2); 2/=(4); 0
 * 
 */
