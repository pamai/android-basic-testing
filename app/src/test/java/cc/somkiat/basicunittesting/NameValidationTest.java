package cc.somkiat.basicunittesting;


import org.junit.Test;

import java.util.Date;

import cc.somkiat.basicunittesting.exception.EmptyNameException;
import cc.somkiat.basicunittesting.model.UserProfile;
import cc.somkiat.basicunittesting.validation.EmptyNameValidate;

public class NameValidationTest {

    @Test(expected = EmptyNameException.class)
    public void EmptyNameInputMustThrowError() throws EmptyNameException {
        UserProfile user = new UserProfile("", new Date(), "");
        EmptyNameValidate emptyNameValidate = new EmptyNameValidate();
        emptyNameValidate.validate(user);
    }
}
