package org.example.defaultParam.staticExpression

import androidx.compose.ui.test.junit4.createComposeRule
import org.junit.Rule
import org.junit.Test

class DefaultParamStaticTest {

    @get:Rule
    val compose = createComposeRule()

    @Test
    fun test() {
        compose.setContent {
            example()
        }
    }

}
