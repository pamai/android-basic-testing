package cc.somkiat.basicunittesting.exception;

/**
 * Created by pamai on 11/15/2017.
 */

public class EmptyEmailException extends Exception {
    public EmptyEmailException(String message) {
        super(message);
    }
}
