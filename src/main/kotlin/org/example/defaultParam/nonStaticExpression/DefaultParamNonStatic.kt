package org.example.defaultParam.nonStaticExpression

import androidx.compose.runtime.*
import org.example.nop

@Composable
fun example(
    p: String = default()
) {
    nop(p)
}

fun default(): String = "default"
