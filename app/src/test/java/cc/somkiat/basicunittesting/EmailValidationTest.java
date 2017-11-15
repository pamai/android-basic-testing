package cc.somkiat.basicunittesting;

import org.junit.Test;

import java.util.Date;

import cc.somkiat.basicunittesting.exception.EmptyEmailException;
import cc.somkiat.basicunittesting.model.UserProfile;
import cc.somkiat.basicunittesting.validation.EmptyEmailValidate;


public class EmailValidationTest {

    @Test(expected = EmptyEmailException.class)
    public void EmptyEmailInputMustThrowError() throws EmptyEmailException {
        UserProfile user = new UserProfile("", new Date(), "");
        EmptyEmailValidate emptyEmailValidate = new EmptyEmailValidate();
        emptyEmailValidate.validate(user);
    }

    //Can't test email pattern while use android.util.Patterns, I wonder how to test it...
}
