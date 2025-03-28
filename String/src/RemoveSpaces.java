public class RemoveSpaces {
    public static void main(String[] args) {

        String str = "Hello World ";

        String trim = str.trim();
        String removedSpaces = str.replace(" ", "");

        System.out.println(removedSpaces);
    }
}
