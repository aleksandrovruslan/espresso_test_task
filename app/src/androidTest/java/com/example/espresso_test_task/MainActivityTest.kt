package com.example.espresso_test_task

import org.junit.Test

class MainActivityTest : CommonTestCase() {

    @Test
    fun test() {
        homePage.checkStageTv(homePage.STAGE_1)
        homePage.continueBtnClick()
        homePage.checkStageTv(homePage.STAGE_2)
        homePage.hideOpenApp()
        homePage.checkStageTv(homePage.STAGE_2)
        homePage.continueBtnClick()
        homePage.checkStageTv(homePage.STAGE_3)
        homePage.continueBtnClick()
        homePage.checkStageTv(homePage.DONE)
        homePage.continueBtnClick()
        homePage.checkStageTv(homePage.DONE)
    }

}