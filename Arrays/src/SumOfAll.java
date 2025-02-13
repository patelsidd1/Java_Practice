public class SumOfAll {
    public static void main(String[] args) {
        int arr [] = {10,20,5,30,50};
        int sum = 0;

        for (int num : arr){
            sum = sum+ num;
        }
        System.out.println(sum);
    }
}
