package com.example.meet17;

import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

/**
 * Created by Игорь on 29.07.2018.
 */
public class InformationActivityTest {

    @Rule
    public ActivityTestRule<InformationActivity> mActivityRule = new ActivityTestRule<>(
            InformationActivity.class);

    @Test
    public void onCreate() throws Exception {
        onView(withId(R.id.nameTextInfo)).check(matches(isDisplayed()));
    }

}