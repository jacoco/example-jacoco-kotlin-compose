package org.example

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import org.junit.Rule
import org.junit.Test

class ExampleTest {

    @get:Rule
    val compose = createComposeRule()

    @Test
    fun test() {
        compose.setContent {
            example()
        }
        compose.onNodeWithText("Click me").performClick()
        compose.onNodeWithText("Click me again").performClick()
        compose.onNodeWithText("Click me").assertDoesNotExist()
        compose.onNodeWithText("Click me again").assertDoesNotExist()
    }

}
