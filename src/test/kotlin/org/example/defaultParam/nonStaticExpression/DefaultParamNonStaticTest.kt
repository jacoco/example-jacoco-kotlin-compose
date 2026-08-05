package org.example.defaultParam.nonStaticExpression

import androidx.compose.ui.test.junit4.createComposeRule
import org.junit.Rule
import org.junit.Test

class DefaultParamNonStaticTest {

    @get:Rule
    val compose = createComposeRule()

    @Test
    fun test() {
        compose.setContent {
            example()
        }
    }

}
