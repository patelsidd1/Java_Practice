// Narrowing TypeCasting

public class Narrowing {
    public static void main(String[] args) {

        double d = 19.99;

        long l = (long)d;

        int i = (int)l;

        System.out.println("Before TypeCasting : " +d);
        System.out.println("After  TypeCasting: Long  : " +l);

        System.out.println("After  TypeCasting : Int  : " +i);


    }
}
