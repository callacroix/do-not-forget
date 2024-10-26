package com.wedding.thinking

import androidx.activity.result.launch
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Created by Carine
 */
@RunWith(AndroidJUnit4::class)
class SplashActivityTest {

    @Test
    fun testSplashScreenDisplayed() {
        ActivityScenario.launch(SplashActivity::class.java)
        onView(ViewMatchers.withId(R.id.caddyLogoImageView)).check(ViewAssertions.matches(
            ViewMatchers.isDisplayed())) // Check logo
    }

    @Test
    fun testTransitionToMainActivity() {
        ActivityScenario.launch(SplashActivity::class.java)
        // Wait for the splash screen duration (e.g., 3 seconds)
        Thread.sleep(3000)
        // Check if the main activity is displayed
        onView(ViewMatchers.withId(R.id.mainActivityLayout)).check(ViewAssertions.matches(ViewMatchers.isDisplayed())) // Assuming your main activity has this ID
    }
}