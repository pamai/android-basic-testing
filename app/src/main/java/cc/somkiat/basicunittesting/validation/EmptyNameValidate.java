package cc.somkiat.basicunittesting.validation;


import cc.somkiat.basicunittesting.exception.EmptyNameException;
import cc.somkiat.basicunittesting.exception.UserException;
import cc.somkiat.basicunittesting.model.UserProfile;

public class EmptyNameValidate implements UserException {

    public void validate(UserProfile user) throws EmptyNameException {
        if (user.getUser().isEmpty()){
            throw new EmptyNameException("Empty Name");
        }
    }
}
