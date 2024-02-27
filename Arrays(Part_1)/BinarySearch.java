

public class BinarySearch {
    public static int binarySearch(int numbers[] , int keys){
        int start=0, end=numbers.length-1;

        while(start<=end){
            int mid=(start+end)/2;

            //comparsion
            if(numbers[mid]==keys){
                return mid;
            }
            if(numbers[mid]<keys){
                start=mid+1;    
            }else{
                end=mid-1;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12};
        int keys=10;
        System.out.println("index for keys is: " + binarySearch(numbers, keys));
    }
    
}
