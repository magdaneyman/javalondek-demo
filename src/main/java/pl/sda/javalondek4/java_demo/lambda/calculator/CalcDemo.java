package pl.sda.javalondek4.java_demo.lambda.calculator;

public class CalcDemo {

    public static void main(String[] args) {
        System.out.println("playing with calc lambdas");
        Adder adder = (int a, int b) -> {return a+b;
        };

        Adder adder2 = (first, second ) -> {
            return first+second;
        };

        Adder adder3 = (first, second ) ->first + second;

        MyAdder myAdder = (a,b,comment) -> {
            System.out.println(comment );
            return a +b;
        };

        myAdder.addWithComment(5,10, "should be 15");

        Substraction sub = (a,b) -> a-b;

        Multiplication multiplication = (a,b) -> a*b;

        Division division = (a,b) -> a/b;

        StrangeOne strangeOne = (int a, int b) -> {return a+b;
        };

        StringAdder stringAdder = (one,two) -> {
            return one.concat(two);
        };
    }
}
