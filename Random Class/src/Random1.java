import java.util.Random;

public class Random1 {

    static int otp;
    public static void main(String[] args) {

        Random1 r = new Random1();
        r.generate1();
        r.generate2();
        r.generate3();
    }
    void generate1(){
        otp = new Random().nextInt(50);
        System.out.println(otp);
    }
    void generate2(){
        otp = new Random().nextInt(10);
        System.out.println(otp);
    }
    void generate3(){
        otp = new Random().nextInt(20)+10;
        System.out.println(otp);
    }
}
