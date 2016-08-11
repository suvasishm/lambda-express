/**
 * Created by suvasish on 11/8/16.
 */
public class LambdaIntro {

    // Functional interface: any interface that contains only one abstract method
    interface IntegerMath {
        int operation(int a, int b);
    }

    public int operateBinary(int a, int b, IntegerMath op) {
        return op.operation(a, b);
    }

    public static void main(String... args) {
        // Define Lambda expressions to add and subtract

        /* Name of the method @IntegerMath.operation could be omitted as it is contained within a functional interface @IntegerMath
           Otherwise, we would have to define a class that implements the interface
         */

        IntegerMath addition = (a, b) -> a + b;
        IntegerMath subtraction = (a, b) -> a - b;

        // call @operateBinary and pass the operands along with the lambda expressions as method parameters
        LambdaIntro app = new LambdaIntro();
        System.out.println("40 + 2 = " + app.operateBinary(40, 2, addition));
        System.out.println("40 - 2 = " + app.operateBinary(40, 2, subtraction));
    }
}
