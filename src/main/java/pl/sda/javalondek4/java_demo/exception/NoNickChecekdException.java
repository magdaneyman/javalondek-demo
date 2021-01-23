package pl.sda.javalondek4.java_demo.exception;

public class NoNickChecekdException extends Exception{
// więcej wiemy dlaczgo dany blad powstal
    public NoNickChecekdException() {
    }

    public NoNickChecekdException(String message) {
        super(message);
    }

    public NoNickChecekdException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoNickChecekdException(Throwable cause) {
        super(cause);
    }

    public NoNickChecekdException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
