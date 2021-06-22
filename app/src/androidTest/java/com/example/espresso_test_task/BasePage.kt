package com.example.espresso_test_task

open class BasePage {

    protected val uiAutomatorHelper = UiAutomatorHelper

    fun hideOpenApp() {
        uiAutomatorHelper.hideAndOpenApp()
    }

}