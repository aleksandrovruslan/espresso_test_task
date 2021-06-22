package com.example.espresso_test_task

import android.content.res.Resources
import androidx.annotation.IdRes
import androidx.test.platform.app.InstrumentationRegistry.getInstrumentation

object ResourcesManager {

    //common resource ids
    val STAGE_1: Int = R.string.stage_1
    val STAGE_2: Int = R.string.stage_2
    val STAGE_3: Int = R.string.stage_3
    val DONE: Int = R.string.done

    private val resources: Resources by lazy {
        getInstrumentation().targetContext.resources
    }

    fun getStringById(@IdRes id: Int): String = resources.getString(id)

}