package functionalinterface.predicate;

import java.util.function.Predicate;

public class BirdImpl {

    public static void main(String[] args) {

        Predicate<String> isFly = fly -> fly.startsWith("ab");
        boolean test = isFly.test("abvc");

    }
}
