package org.example.defaultParam.instanceMethod

import androidx.compose.runtime.*
import org.example.nop

class Example {
    @Composable
    fun example(
        p: String = "default",
    ) {
        nop(p)
    }
}
