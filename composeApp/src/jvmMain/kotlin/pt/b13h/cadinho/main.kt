package pt.b13h.cadinho

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

import androidx.compose.ui.window.MenuBar
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(onCloseRequest = ::exitApplication, title = "My Native App") {
        // This is the magic part for macOS
        MenuBar {
            Menu("File", mnemonic = 'F') {
                Item("New Project", onClick = { /* Action */ })
                Item("Open...", onClick = { /* Action */ })
                Separator()
                Item("Exit", onClick = { exitApplication() })
            }

            Menu("Edit") {
                Item("Undo", onClick = { /* Action */ })
                Item("Redo", onClick = { /* Action */ })
            }
        }

        // Your app UI goes here
        App()
    }
}