public class LargestNumber {
    public static void main(String[] args) {

        int [] arr  = {10,20,30,40,50};

        int  max = arr[0];

        for (int num : arr ){
            if (num> max ){
                max = num;
            }
        }
        System.out.println(max);
    }
}
