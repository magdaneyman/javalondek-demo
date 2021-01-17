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
        handleRunner(new Runner()
        {@Override public void go() { System.out.println("inside method call"); }


        });
    }
    public static void handleRunner (Runner anyRunner){
        System.out.println("handleRunner");
        anyRunner.go();
    }
}
