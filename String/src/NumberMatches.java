public class NumberMatches {
    public static void main(String[] args) {

        String str = "123654789";

        boolean isMatches = str.matches("[0-8]+");

        System.out.println(isMatches);
    }
}
