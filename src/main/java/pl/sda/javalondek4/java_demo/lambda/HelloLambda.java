package pl.sda.javalondek4.java_demo.lambda;

public class HelloLambda {
    public static void main(String[] args) {
        MagdaRunner magdaRunner = new MagdaRunner();
        Runner runner = new MagdaRunner();
        //magdaRunner.walk();
        //magdaRunner.go();
        handleRunner(runner);
        // define anonymous class
        Runner anonymousRunner = new Runner() {
            @Override
            public void go() {
                System.out.println("Anonymous Runner ");

            }
        };

        handleRunner(anonymousRunner);
        //anonymousRunner.go();

        // call handleRunner using anonymous class
        handleRunner(new Runner() {
            @Override
            public void go() {
                System.out.println("inside method call");
            }


        });
        //using lambda - super happy :-)
        handleRunner(() -> System.out.println("inside lambda call"));

        // we're implementing method go() here

        Runner myFirstLambda = () -> {
        };//implementacja interfejsu Runner

        //expression has value, statement not

        Runner mySecondLambda = () -> {
            System.out.println("Inside my second lambda");
        };

        Runner myThirdLambda = () -> System.out.println("my third Lambda");

        Runner myFourthLambda = () -> {
            System.out.println("first text");
            System.out.println("second text");
        };
        myFourthLambda.go();
        myFourthLambda.go(4);
        Runner.walk();

    }

    public static void handleRunner(Runner anyRunner) {
        System.out.println("handleRunner");
        anyRunner.go();
    }
}

