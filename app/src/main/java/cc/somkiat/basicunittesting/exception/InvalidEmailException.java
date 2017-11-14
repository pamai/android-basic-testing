package cc.somkiat.basicunittesting.exception;

/**
 * Created by pamai on 11/15/2017.
 */

public class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}
