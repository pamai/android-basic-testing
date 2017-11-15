package cc.somkiat.basicunittesting;

import org.junit.Test;

import java.util.Date;

import cc.somkiat.basicunittesting.model.UserProfile;

import static junit.framework.Assert.assertEquals;


public class GetUserProfileTest {

    @Test
    public void getUserProfile(){
        String name = "Paniti";
        Date birthDay = new Date(1996, 11, 29);
        String email = "pamai_5656@hotmail.com";
        UserProfile user = new UserProfile(name, birthDay, email);
        assertEquals(name, user.getUser());
        assertEquals(email, user.getEmail());
    }

}
