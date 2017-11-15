package cc.somkiat.basicunittesting.validation;

import android.util.Patterns;

import cc.somkiat.basicunittesting.exception.InvalidEmailException;
import cc.somkiat.basicunittesting.exception.UserException;
import cc.somkiat.basicunittesting.model.UserProfile;


public class InvalidEmailValidate implements UserException {
    @Override
    public void validate(UserProfile user) throws InvalidEmailException {
        if (!Patterns.EMAIL_ADDRESS.matcher(user.getEmail()).matches()){
            throw new InvalidEmailException("Invalid Email");
        }
    }
}
