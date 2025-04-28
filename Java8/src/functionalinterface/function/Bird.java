package functionalinterface.function;

import org.w3c.dom.ls.LSOutput;

import java.util.function.Function;

public class Bird {

    public static void main(String[] args) {


        Function<String, Integer> function = str -> str.length();
        System.out.println(function.apply("New Mobile "));
    }
}