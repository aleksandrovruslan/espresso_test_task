package com.example.espresso_test_task

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.uiautomator.By
import androidx.test.uiautomator.UiDevice
import androidx.test.uiautomator.Until

object UiAutomatorHelper {

    private val TIMEOUT = 1000L
    private val mDevice by lazy {
        UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())
    }

    fun pressHome() {
        mDevice.pressHome()
    }

    fun pressRecentApps() {
        mDevice.pressRecentApps()
    }

    fun hideAndOpenApp() {
        val pName = mDevice.currentPackageName
        pressHome()
        pressRecentApps()
        mDevice.wait(Until.hasObject(By.pkg(pName)), TIMEOUT)
        pressRecentApps()
        mDevice.wait(Until.hasObject(By.pkg(pName)), TIMEOUT)
    }

}