package com.example.espresso_test_task

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText

class HomePage : BasePage() {

    val STAGE_1: String by lazy {
        ResourcesManager.getStringById(ResourcesManager.STAGE_1)
    }

    val STAGE_2: String by lazy {
        ResourcesManager.getStringById(ResourcesManager.STAGE_2)
    }

    val STAGE_3: String by lazy {
        ResourcesManager.getStringById(ResourcesManager.STAGE_3)
    }

    val DONE: String by lazy {
        ResourcesManager.getStringById(ResourcesManager.DONE)
    }

    private val stageTv = onView(withId(R.id.stage_tv))
    private val continueBtn = onView(withId(R.id.continue_btn))

    fun checkStageTv(text: String) {
        stageTv.check(matches(withText(text)))
    }

    fun continueBtnClick() {
        continueBtn.perform(click())
    }

}