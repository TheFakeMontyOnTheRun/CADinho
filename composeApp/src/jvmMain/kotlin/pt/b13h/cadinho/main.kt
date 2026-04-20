package pt.b13h.cadinho

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "CADinho",
    ) {
        App()
    }
}