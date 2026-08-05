package org.example.defaultParam.staticExpression

import androidx.compose.runtime.*
import org.example.nop

@Composable
fun example(
    p: String = "default"
) {
    nop(p)
}
