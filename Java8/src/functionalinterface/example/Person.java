package functionalinterface.example;

@FunctionalInterface
public interface Person {
    void greet(String message);

    static void sum (int a , int b){
        System.out.println("Sum of a and b is " +(a+b));
    }

    default void sub(int a, int b){
        System.out.println("Subtraction of a and b is " +(a-b));
    }

}
