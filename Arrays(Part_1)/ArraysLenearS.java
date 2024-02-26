

public class ArraysLenearS {
    //Linear Search
     public static int linearSearch(int number[], int keys){
         for(int i=0; i<number.length; i++){
            if(number[i] == keys){
                return i;

            }
         }
         return -1;
     }

    public static void main(String[] args) {
        int number[]={2,4,6,8,10,12,14,16};
        //String menu[] = {"dosa" ,"khman",samosa};
        int keys=10;

        int index =linearSearch(number, keys);
        if(index == -1){
            System.out.println("Not found");
        }
        else{
            System.out.println("Key at index : " + index);
        }
    }
}
