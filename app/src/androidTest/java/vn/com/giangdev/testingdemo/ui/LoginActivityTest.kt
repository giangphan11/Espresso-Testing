package vn.com.giangdev.testingdemo.ui

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import vn.com.giangdev.testingdemo.R

/**
 * Created by giangphanba on 04/12/2022.
 */
class LoginActivityTest{

    @get:Rule
    val activityMain = ActivityScenarioRule(LoginActivity::class.java)

    private val listUserTest = "abc-123, admin-123"

    @Test
    fun checkTitleDisplayed() {
        onView(withId(R.id.tvTitle)).check(matches(isDisplayed()))
    }

    @Test
    fun checkTitleWithTextHello() {
        onView(withId(R.id.tvTitle)).check(matches(withText("hello")))
    }

    @Test
    fun checkBtnLoginDisplay() {
        onView(withId(R.id.btnActionLogin)).check(matches(isDisplayed()))
    }

    @Test
    fun checkTvLoginSuccessDisplay() {
        onView(withId(R.id.tvLoginSuccess)).check(matches(isDisplayed()))
    }
//
    @Test
    fun testActionLogin1() {
        onView(withId(R.id.etUserName)).perform(ViewActions.typeText("admin"))
        onView(withId(R.id.etPassword)).perform(ViewActions.typeText("123"))
        onView(withId(R.id.btnActionLogin)).perform(ViewActions.click())
        checkTvLoginSuccessDisplay()
    }
//
    @Test
    fun testListActionLogin() {
        listUserTest.split(",").forEach { testString ->
            onView(withId(R.id.etPassword)).perform(ViewActions.clearText())
            onView(withId(R.id.etUserName)).perform(ViewActions.clearText())

            val userName = testString.split("-").firstOrNull()?.trim()
            val pass = testString.split("-").lastOrNull()?.trim()
            onView(withId(R.id.etUserName)).perform(ViewActions.typeText(userName))
            onView(withId(R.id.etPassword)).perform(ViewActions.typeText(pass))
            onView(withId(R.id.btnActionLogin)).perform(ViewActions.click())

        }
        checkTvLoginSuccessDisplay()
    }
}