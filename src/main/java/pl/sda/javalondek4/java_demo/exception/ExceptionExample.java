package pl.sda.javalondek4.java_demo.exception;

public class ExceptionExample {

    // checked exception  - all inherited from Exception except RuntimeException
    // unchecked exception - all inherited from RuntimeException
    // errors - inherited directly from Throwable (java machine errors)
    public static void main(String[] args) {
        ExceptionGenerator exceptionGenerator = new ExceptionGenerator();
        // handle with try catch  or declare
        // SOLID ??
        String myNick;
        try {
            myNick = exceptionGenerator.nick();
        } catch (NoNickException e) {
            e.printStackTrace(); // niepoprawna obsluga, tylko wpisanie do logow
            // nie jest dobra praktyka
            System.out.println("Problem with nick generator");
            myNick = "This user has no nick";
        }
        // blok finally  - zawsze nadpisze

            System.out.println("My nick is " + myNick);
            String nullString = null;
            nullString.concat("ma kota");
            System.out.println("here ");


    }
}
