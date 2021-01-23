package pl.sda.javalondek4.java_demo.lambda.examples.fromAla;


@FunctionalInterface
public interface Playable<T> {
    void play(T t);
}

