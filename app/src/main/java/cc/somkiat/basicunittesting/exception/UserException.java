package cc.somkiat.basicunittesting.exception;


import cc.somkiat.basicunittesting.model.UserProfile;

public interface UserException {
    void validate(UserProfile user) throws EmptyEmailException, InvalidNameException, EmptyNameException, InvalidEmailException;
}
