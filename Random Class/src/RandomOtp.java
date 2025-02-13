import java.util.Random;

public  class RandomOtp {

    static int otp;
    public static void main(String[] args) {

        otp = new Random().nextInt(100)+200;
        System.out.println(otp);
    }
}