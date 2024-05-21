package org.example

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*

@Composable
fun example() {
    var counter by remember { mutableStateOf(0) }
    if (counter == 2) {
        return
    }
    Button(onClick = { counter++ }) {
        if (counter == 0) {
            Text("Click me")
        } else {
            Text("Click me again")
        }
    }
}
