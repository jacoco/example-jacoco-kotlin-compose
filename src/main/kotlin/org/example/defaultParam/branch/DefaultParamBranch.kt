package org.example.defaultParam.branch

import androidx.compose.runtime.*
import org.example.nop

@Composable
fun example(
    b: Boolean,
    p: String = if (b) "default1" else "default2",
) {
    nop(p)
}
