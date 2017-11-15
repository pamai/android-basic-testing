package cc.somkiat.basicunittesting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import cc.somkiat.basicunittesting.exception.EmptyEmailException;
import cc.somkiat.basicunittesting.exception.EmptyNameException;
import cc.somkiat.basicunittesting.exception.InvalidEmailException;
import cc.somkiat.basicunittesting.exception.InvalidNameException;
import cc.somkiat.basicunittesting.exception.UserException;
import cc.somkiat.basicunittesting.model.UserProfile;
import cc.somkiat.basicunittesting.validation.EmptyEmailValidate;
import cc.somkiat.basicunittesting.validation.EmptyNameValidate;
import cc.somkiat.basicunittesting.validation.InvalidEmailValidate;
import cc.somkiat.basicunittesting.validation.InvalidNameValidate;


public class MainActivity extends AppCompatActivity {

    private TextView user;
    private DatePicker birthDay;
    private TextView email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user = findViewById(R.id.userNameInput);
        birthDay = findViewById(R.id.dateOfBirthInput);
        email = findViewById(R.id.emailInput);
    }

    public void onSaveClick(View view) {
        Date birthDayConvert = new Date(birthDay.getYear(), birthDay.getMonth(), birthDay.getDayOfMonth());
        UserProfile userProfile = new UserProfile(user.getText().toString(), birthDayConvert, email.getText().toString());
        onCheck(userProfile);
    }

    public void onRevertClick(View view) {
        user.setText("");
        email.setText("");
    }

    public boolean onCheck(UserProfile userProfile){

        List<UserException> userExceptions = new ArrayList<>();
        userExceptions.add(new EmptyNameValidate());
        userExceptions.add(new InvalidNameValidate());
        userExceptions.add(new EmptyEmailValidate());
        userExceptions.add(new InvalidEmailValidate());
        try {
            for (UserException userException : userExceptions){
                userException.validate(userProfile);
            }
        } catch (EmptyEmailException e) {
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
            Log.e("Error", e.getMessage());
            return false;
        } catch (InvalidNameException e) {
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
            Log.e("Error", e.getMessage());
            return false;
        } catch (EmptyNameException e) {
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
            Log.e("Error", e.getMessage());
            return false;
        } catch (InvalidEmailException e) {
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
            Log.e("Error", e.getMessage());
            return false;
        }
        Log.d("Save", "Saved");

        return true;
    }
}
