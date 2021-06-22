package com.example.espresso_test_task

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.junit.BeforeClass
import org.junit.Rule
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
open abstract class CommonTestCase {

    @get:Rule
    var activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    companion object {
        //common start page for app
        lateinit var homePage: HomePage

        @BeforeClass
        @JvmStatic
        fun setUp() {
            homePage = HomePage()
        }
    }

}