package org.example.defaultParam.instanceMethod

import androidx.compose.ui.test.junit4.createComposeRule
import org.junit.Rule
import org.junit.Test

class DefaultParamInstanceMethodTest {

    @get:Rule
    val compose = createComposeRule()

    @Test
    fun test() {
        compose.setContent {
            Example().example()
        }
    }

}
