package functionalinterface.consumer;

import java.util.function.Consumer;

public class Bird {

    public static void main(String[] args) {

        Consumer<String> consumer = str -> System.out.println(str);
        consumer.accept("abc");
        consumer.accept("45678iu");
    }
}
