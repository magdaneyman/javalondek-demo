package pl.sda.javalondek4.java_demo.lambda;

public class Player implements Playable{

    @Override
    public void play() {
        System.out.println("Playing is fun");
    }

    Playable footballPlayer = ()->{
        System.out.println("I can play footbal");
    };


    Playable gamesPlayer =() -> {
        System.out.println( "Only playing games bring joy to your life");

    };
    Playable looser =() -> {
        System.out.println(" Even when you loose you learn");
    };





}
