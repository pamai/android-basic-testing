package cc.somkiat.basicunittesting.exception;


public class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}
