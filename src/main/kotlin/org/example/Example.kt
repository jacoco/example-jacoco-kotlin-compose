package org.example

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*

data class State(val titles: List<String>)

@Composable
fun example(state: State, onDone: () -> Unit = {}) {
    var counter by remember { mutableStateOf(0) }
    if (counter == 2) {
        return
    }
    Button(onClick = {
        if (counter == 1 && state.titles.isNotEmpty()) onDone()
        counter++
    }) {
        if (counter == 0) {
            Text("Click me ${state.titles.first()}")
        } else {
            Text("Click me again")
        }
    }
}
