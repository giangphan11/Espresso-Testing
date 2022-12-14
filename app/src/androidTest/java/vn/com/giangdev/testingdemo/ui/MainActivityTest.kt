package vn.com.giangdev.testingdemo.ui

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Assert.*

import org.junit.Before
import org.junit.Rule
import org.junit.Test
import vn.com.giangdev.testingdemo.R

/**
 * Created by giangphanba on 16/10/2022.
 */
class MainActivityTest {
    @Rule
    val activityMain = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun check_display_textView_main_screen(){
        // val activityScenario = ActivityScenario.launch(MainActivity::class.java)

        onView(withId(R.id.txtTitleMain)).check(matches(isDisplayed()))
    }

    @Test
    fun check_content_textView_main_screen(){
        //val activityScenario = ActivityScenario.launch(MainActivity::class.java)

        onView(withId(R.id.txtTitleMain)).check(matches(isDisplayed()))
        onView(withId(R.id.txtTitleMain)).check(matches(withText("aaaa")))
    }

    @Test
    fun check_content_textView_main_screen2(){
        // val activityScenario = ActivityScenario.launch(MainActivity::class.java)

        onView(withId(R.id.txtTitleMain)).check(matches(isDisplayed()))
        onView(withId(R.id.txtTitleMain)).check(matches(withText("Main Screen")))
    }

    @Test
    fun check_display_btn_login_main_screen(){
        //val activityScenario = ActivityScenario.launch(MainActivity::class.java)

        onView(withId(R.id.btnLogin)).check(matches(isDisplayed()))
    }

















}