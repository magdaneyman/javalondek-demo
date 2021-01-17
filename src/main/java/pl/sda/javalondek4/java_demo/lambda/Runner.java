package pl.sda.javalondek4.java_demo.lambda;

// functional interface - ma jedną abstrakcyjną metode

@FunctionalInterface
public interface Runner {

   void go();
    default void go(int speed){
        System.out.println("My current speed is :" + speed);
    };

    static void walk(){};
}
