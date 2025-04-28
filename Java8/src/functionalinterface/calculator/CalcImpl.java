package functionalinterface.calculator;

public class CalcImpl implements Calc{

    @Override
    public int add(int a, int b) {
        int  sum = a+b;
        System.out.println("Sum of a and b is : " +sum);
        return sum ;
    }

    public static void main(String[] args) {
        CalcImpl calc = new CalcImpl();
        calc.add(2,9);
    }
}
