package functionalinterface.suppliar;

import java.util.function.Supplier;

public class BirdImpl {

    public static void main(String[] args) {

        Supplier<String> isFly = () -> "Peacock";
        System.out.println(isFly.get());

        Supplier<Double> doubleSupplier = () -> Math.random();
        System.out.println(doubleSupplier.get());

        Supplier<Integer> randomSupplier = () -> (int)(Math.random() * 100) + 1;
        System.out.println("Random number between 1 and 100: " + randomSupplier.get());

    }
}
