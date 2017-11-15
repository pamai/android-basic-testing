package cc.somkiat.basicunittesting.model;

import java.util.Date;

/**
 * Created by pamai on 11/14/2017.
 */

public class UserProfile {

    private String user;
    private Date birthDay;
    private String email;

    public UserProfile(String user, Date birthday, String email) {
        this.user = user;
        this.birthDay = birthday;
        this.email = email;
    }

    public String getUser() {
        return user;
    }

    public String getEmail() {
        return email;
    }

}
