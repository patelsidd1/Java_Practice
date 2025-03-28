public class Reverse {
    public static void main(String[] args) {
        String str = "Aeroplane";
        String reverse = "";

        for (int i = str.length()-1; i >= 0 ; i--) {
            reverse += str.charAt(i);


        }
        System.out.println(reverse);
        String s = new StringBuilder(str).reverse().toString();
        System.out.println(s);
    }
}
