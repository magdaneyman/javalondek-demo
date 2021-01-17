package pl.sda.javalondek4.java_demo.lambda.calculator;

public class CalcDemo {

    public static void main(String[] args) {
        System.out.println("playing with calc lambdas");
        Adder<Integer> adder = (Integer a, Integer  b) -> {return a+b;
        };
// typy sa wyciagane z interfejsu wiec nie potrzeba podawac ich typu,
// jezeli to robimy to musza typy sie zgadzac bezwzglednie
        Adder<Integer> adder2 = (first,  second ) -> {
            return first+second;
        };

        Adder <Integer> adder3 = (first, second ) ->first + second;

        MyAdder myAdder = (a,b,comment) -> {
            System.out.println(comment );
            return a +b;
        };

        myAdder.addWithComment(5,10, "should be 15");

        Substraction <Integer> sub = (a,b) -> a-b;

        Multiplication <Double>  multiplication = (a,b) -> a*b;

        Division <Double> division = (a,b) -> a/b;
        Operation <Double> divisionOperation = (a,b) -> a/b;


        StrangeOne strangeOne = (int a, int b) -> {return a+b;
        };

        StringAdder stringAdder = (one,two) -> {
            return one.concat(two);
        };
    }
}
