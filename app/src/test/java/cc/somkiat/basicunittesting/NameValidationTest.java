package cc.somkiat.basicunittesting;


import org.junit.Test;

import java.util.Date;

import cc.somkiat.basicunittesting.exception.EmptyNameException;
import cc.somkiat.basicunittesting.exception.InvalidNameException;
import cc.somkiat.basicunittesting.model.UserProfile;
import cc.somkiat.basicunittesting.validation.EmptyNameValidate;
import cc.somkiat.basicunittesting.validation.InvalidNameValidate;

public class NameValidationTest {

    @Test(expected = EmptyNameException.class)
    public void EmptyNameInputMustThrowError() throws EmptyNameException {
        UserProfile user = new UserProfile("", new Date(), "");
        EmptyNameValidate emptyNameValidate = new EmptyNameValidate();
        emptyNameValidate.validate(user);
    }

    @Test(expected = InvalidNameException.class)
    public void InvalidNameInputMustThrowError() throws InvalidNameException {
        UserProfile user = new UserProfile("test123", new Date(), "");
        InvalidNameValidate invalidNameValidate = new InvalidNameValidate();
        invalidNameValidate.validate(user);
    }

}
