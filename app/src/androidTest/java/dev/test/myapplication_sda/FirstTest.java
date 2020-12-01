package dev.test.myapplication_sda;

import androidx.test.core.app.ActivityScenario;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(JUnit4.class)

public class FirstTest {

    @Before
    public void startApp() {
     ActivityScenario<MainActivity> rule = ActivityScenario.launch(MainActivity.class);
}

    @Test
    public void firstScreenTest() {
        onView(withText("Hello first fragment")).check(matches(isDisplayed()));
    }

    @Test
    public void firstScreenTestWithId() {
        onView(withId(R.id.textview_first)).check(matches(isDisplayed()));
    }

    @Test
    public void thirdScreenTest() {
        onView(withId(R.id.button_first)).perform(click());
        onView(withText("Hello second fragment")).check(matches(isDisplayed()));
    }

    @Test
    public void forthScreenTest() {
        onView(withId(R.id.button_first)).perform(click());
        onView(withText("Hello second fragment")).check(matches(isDisplayed()));
        onView(withId(R.id.button_second)).perform(click());
        onView(withText("Hello first fragment")).check(matches(isDisplayed()));
    }
}
