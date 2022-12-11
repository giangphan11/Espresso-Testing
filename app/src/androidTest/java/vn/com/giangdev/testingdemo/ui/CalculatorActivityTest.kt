package vn.com.giangdev.testingdemo.ui

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import vn.com.giangdev.testingdemo.R

/**
 * Created by giangphanba on 11/12/2022.
 */
class CalculatorActivityTest{
    @get:Rule
    val activityRule = ActivityScenarioRule(CalculatorActivity::class.java)

    @Test
    fun checkUI() {
        onView(withId(R.id.tvResult)).check(matches(isDisplayed()))
        onView(withId(R.id.etNumA)).check(matches(isDisplayed()))
        onView(withId(R.id.etNumB)).check(matches(isDisplayed()))
        onView(withId(R.id.btnSum)).check(matches(isDisplayed()))
    }

    @Test
    fun testCal() {
        // input
        onView(withId(R.id.etNumA)).perform(typeText("m"))
        onView(withId(R.id.etNumB)).perform(typeText("2"))

        // click
        onView(withId(R.id.btnSum)).perform(click())

        // check result
        onView(withId(R.id.tvResult)).check(matches(withText("2")))
    }

    @Test
    fun testCal2() {
        inputData("1", "2", "3")
        inputData("1", "2", "4")
        inputData("1", "2", "3")
    }
//
    private fun inputData(numA: String, numB: String, result: String){
        onView(withId(R.id.etNumA)).perform(ViewActions.clearText())
        onView(withId(R.id.etNumB)).perform(ViewActions.clearText())

        onView(withId(R.id.etNumA)).perform(ViewActions.typeText(numA.trim()))
        onView(withId(R.id.etNumB)).perform(ViewActions.typeText(numB.trim()))

        onView(withId(R.id.btnSum)).perform(click())

        onView(withId(R.id.tvResult)).check(matches(withText(result.trim())))
    }
}