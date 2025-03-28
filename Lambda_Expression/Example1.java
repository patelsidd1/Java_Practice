package Lambda_Expression;

public class Example1 {
    public static void main(String[] args) {
        System.out.println("This is lambda expression ");

        MyInterface myInterface = new MyInterfaceImpl();
        myInterface.hello();

        MyInterface myInterface1 = new MyInterface() {
            @Override
            public void hello() {
                System.out.println("This is first anonymous class ");
            }
        };
        myInterface1.hello();

        MyInterface myInterface2 = () -> System.out.println("This is lambda expression");

        myInterface2.hello();

        //BY USING ANNONYMOUS CLASS
        IntSum intSum = new IntSum() {
            @Override
            public int sum(int a, int b, int c) {

                return a+b+c;
            }
        };
        System.out.println( intSum.sum(23,34,33));

        // BY USING LAMBDA EXPRESSION
        IntSum intSum1 = (int a, int b, int c) -> {
            return a+b+c;
        };
        System.out.println(intSum1.sum(25,35,25));

        IntSum intSum2 = (a,b,c) -> a+b+c;
        System.out.println(intSum2.sum(21,21,21));

        LengthInterface lengthInterface = (String str) -> str.length();

        System.out.println(lengthInterface.length("Siddhant Patel"));

    }

}
