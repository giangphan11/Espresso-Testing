package vn.com.giangdev.testingdemo.ui

import org.junit.runner.RunWith
import org.junit.runners.Suite

/**
 * Created by giangphanba on 16/08/2022.
 */
@RunWith(Suite::class)
@Suite.SuiteClasses(
    LoginActivityTest::class,
    CalculatorActivityTest::class
)
class ActivityTestSuite