package cc.somkiat.basicunittesting.exception;


public class EmptyEmailException extends Exception {
    public EmptyEmailException(String message) {
        super(message);
    }
}
