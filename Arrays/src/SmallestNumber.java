public class SmallestNumber {
    public static void main(String[] args) {
        int arr [] = {20,30,40,5,50,10};
        int min = arr[0];

        for (int num : arr){
            if(num<min){
                min = num;
            }

        }
        System.out.println(min);
    }
}
