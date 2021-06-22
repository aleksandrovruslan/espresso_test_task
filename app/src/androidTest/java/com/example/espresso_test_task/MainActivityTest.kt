package com.example.espresso_test_task

import io.qameta.allure.kotlin.Allure.step
import io.qameta.allure.kotlin.Description
import org.junit.Test

class MainActivityTest : CommonTestCase() {

    @Test
    @Description("Test stage counter change")
    fun test() {
        step("Check start state") {
            homePage.checkStageTv(homePage.STAGE_1)
        }
        step("Click 'Continue' button") {
            homePage.continueBtnClick()
            homePage.checkStageTv(homePage.STAGE_2)
        }
        step("Collapse and expand app") {
            homePage.hideOpenApp()
            homePage.checkStageTv(homePage.STAGE_2)
        }
        step("Click 'Continue' button") {
            homePage.continueBtnClick()
            homePage.checkStageTv(homePage.STAGE_3)
        }
        step("Click 'Continue' button") {
            homePage.continueBtnClick()
            homePage.checkStageTv(homePage.DONE)
        }
        step("Click 'Continue' button") {
            homePage.continueBtnClick()
            homePage.checkStageTv(homePage.DONE)
        }
    }

}