package org.example.defaultParam.moreThan32

import androidx.compose.ui.test.junit4.createComposeRule
import org.junit.Rule
import org.junit.Test

class DefaultParamMoreThan32Test {

    @get:Rule
    val compose = createComposeRule()

    @Test
    fun test() {
        compose.setContent {
            example()
        }
    }

}
