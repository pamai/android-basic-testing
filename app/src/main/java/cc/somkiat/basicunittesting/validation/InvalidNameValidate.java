package cc.somkiat.basicunittesting.validation;

import cc.somkiat.basicunittesting.exception.InvalidNameException;
import cc.somkiat.basicunittesting.exception.UserException;
import cc.somkiat.basicunittesting.model.UserProfile;


public class InvalidNameValidate implements UserException {
    public void validate(UserProfile user) throws InvalidNameException {
        if (!user.getUser().matches("[a-zA-Z]+")){
            throw new InvalidNameException("Invalid Name");
        }
    }
}
