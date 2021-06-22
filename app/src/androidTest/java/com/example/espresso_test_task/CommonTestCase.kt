package com.example.espresso_test_task

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.filters.LargeTest
import io.qameta.allure.android.rules.LogcatRule
import io.qameta.allure.kotlin.junit4.AllureRunner
import org.junit.BeforeClass
import org.junit.Rule
import org.junit.runner.RunWith

@RunWith(AllureRunner::class)
@LargeTest
open abstract class CommonTestCase {

    @get:Rule
    var activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)
    @get:Rule
    val logcatRule = LogcatRule()

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