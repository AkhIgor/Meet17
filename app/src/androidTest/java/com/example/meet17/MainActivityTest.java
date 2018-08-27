package com.example.meet17;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.ViewAction;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.view.View;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.isEnabled;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

/**
 * Created by Игорь on 29.07.2018.
 */
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
            MainActivity.class);
    @Test
    public void onCreate() throws Exception{
        onView(withId(R.id.nameText)).check(matches(isDisplayed()));
        onView(withId(R.id.surnameText)).check(matches(isDisplayed()));
        onView(withId(R.id.enterButton)).check(matches(isDisplayed()));

        ClickableMatcher clickableMatcher = new ClickableMatcher();

        onView(withId(R.id.nameText)).perform(typeText("Igor"), closeSoftKeyboard());
        onView(withId(R.id.surnameText)).perform(typeText("Akhmarov"), closeSoftKeyboard());

        onView(withId(R.id.enterButton)).perform(click());
    }

    public class ClickableMatcher extends TypeSafeMatcher<View> {

        @Override
        protected boolean matchesSafely(View item) {
            return item.isClickable();
        }

        @Override
        public void describeTo(Description description) {
            description.appendText("is-clickable=true");
        }
    }

    public class EnabledMatcher extends TypeSafeMatcher<View> {

        @Override
        protected boolean matchesSafely(View item) {
            return item.isEnabled();
        }

        @Override
        public void describeTo(Description description) {
            description.appendText("is-enabled=true");
        }
    }

}