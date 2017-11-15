package cc.somkiat.basicunittesting.validation;

import cc.somkiat.basicunittesting.exception.EmptyEmailException;
import cc.somkiat.basicunittesting.exception.UserException;
import cc.somkiat.basicunittesting.model.UserProfile;


public class EmptyEmailValidate implements UserException {
    public void validate(UserProfile user) throws EmptyEmailException {
        if (user.getEmail().toString().isEmpty()){
            throw new EmptyEmailException("Empty Email");
        }
    }
}
