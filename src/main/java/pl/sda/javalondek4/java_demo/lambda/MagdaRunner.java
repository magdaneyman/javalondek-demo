package pl.sda.javalondek4.java_demo.lambda;

public class MagdaRunner implements Runner {
    @Override
    public void go() {
        System.out.println("Run Magda run");
    }

    public void walk(){
        System.out.println("Walk Magda");
    }

    @Override
    public void go(int speed){
        System.out.println("Magda's speed is "+ speed);


    }
}
