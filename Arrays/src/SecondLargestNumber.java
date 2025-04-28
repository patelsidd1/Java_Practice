import java.util.Arrays;


public class SecondLargestNumber {
    static int  largest(int [] arr){

        int n = arr.length;
        Arrays.sort(arr);

        for (int i = n - 2 ; i >=0; i--) {

            if (arr[i] != arr [n-1 ]) {
                return arr[i];
            }

        }
        return -1;

    }

    public static void main(String[] args) {
        int [] arr = {21,24,26,85,55,44,22,11,33};

        System.out.println( largest(arr));
    }


}
