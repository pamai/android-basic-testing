package cc.somkiat.basicunittesting;


import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;


import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.replaceText;

import static android.support.test.espresso.action.ViewActions.scrollTo;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.RootMatchers.withDecorView;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.is;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void revertTest() {
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.revertButton)).perform(scrollTo(), click());
        onView(withId(R.id.userNameInput)).check(matches(withText("")));
        onView(withId(R.id.emailInput)).check(matches(withText("")));
    }

    @Test
    public void correctTest(){
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.revertButton)).perform(scrollTo(), click());
        onView(withId(R.id.userNameInput)).perform(scrollTo() ,replaceText("Paniti"));
        onView(withId(R.id.emailInput)).perform(scrollTo(), replaceText("pamai_5656@hotmail.com"));
        onView(withId(R.id.saveButton)).perform(scrollTo(), click());
    }

    @Test
    public void emptyNameTest(){
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.revertButton)).perform(scrollTo(), click());
        onView(withId(R.id.userNameInput)).perform(scrollTo() ,replaceText(""));
        onView(withId(R.id.emailInput)).perform(scrollTo(), replaceText("pamai_5656@hotmail.com"));
        onView(withId(R.id.saveButton)).perform(scrollTo(), click());
        onView(withText("Empty Name")).
                inRoot(withDecorView(not(is(mActivityTestRule.getActivity().getWindow().getDecorView())))).
                check(matches(isDisplayed()));
    }

    @Test
    public void invalidNameTest(){
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.revertButton)).perform(scrollTo(), click());
        onView(withId(R.id.userNameInput)).perform(scrollTo() ,replaceText("Robot101"));
        onView(withId(R.id.emailInput)).perform(scrollTo(), replaceText("pamai_5656@hotmail.com"));
        onView(withId(R.id.saveButton)).perform(scrollTo(), click());
        onView(withText("Invalid Name")).
                inRoot(withDecorView(not(is(mActivityTestRule.getActivity().getWindow().getDecorView())))).
                check(matches(isDisplayed()));
    }
}
