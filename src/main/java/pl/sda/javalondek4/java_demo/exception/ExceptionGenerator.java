package pl.sda.javalondek4.java_demo.exception;

import java.util.Random;

public class ExceptionGenerator {

    public String nick() throws NoNickChecekdException {
        Random random = new Random();
        if ( random.nextInt(100)% 2 == 0){
            return "Magda";
        }else {
            throw new NoNickChecekdException("I have no nick");
        }
    }
    public String nickWitRuntimeException() throws NoNickRuntimeExc {
        Random random = new Random();
        if ( random.nextInt(100)% 2 == 0){
            return "Magda";
        }else {
            throw new NoNickRuntimeExc("I have no nick");
        }
    }

    public String nickv2() {
        String myNick;
        try { // first step
            myNick = nick();
        } catch (NoNickChecekdException e) { // second - sometimes
            System.out.println("Problem with nick generator...");
            myNick = "this user has no nick";
        } finally { // third // always
            // myNick = "from finally:)"; // it always overrides nick:(
        }
        return myNick;}

    /**
     * @throws NoNickChecekdException
     * @return
     */
    public String nickWithRuntimeException() throws NoNickRuntimeExc {
        Random random = new Random();
        if (random.nextInt(100) % 2 == 0) {
            return "maniek";
        } else {
            throw new NoNickRuntimeExc("I have no nick... yet:P");
        }
    }

}
