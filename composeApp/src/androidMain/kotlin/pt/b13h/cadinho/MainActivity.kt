package pt.b13h.cadinho

// androidMain
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.IconButton
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert // For the 3-dot menu
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)

        setContent {

            Scaffold(
                topBar = {
                    TopAppBar(
                        title = { Text("My App") },
                        navigationIcon = {
                            IconButton(onClick = { /* Open drawer */ }) {
                                Icon(Icons.Default.Menu, contentDescription = null)
                            }
                        },
                        actions = {
                            // Action buttons (like 'Save' or 'Search')
                            IconButton(onClick = { /* Search */ }) {
                                Icon(Icons.Default.Search, contentDescription = "Search")
                            }
                            // The Overflow Menu (the Android 'File' menu)
                            var expanded by remember { mutableStateOf(false) }
                            IconButton(onClick = { expanded = true }) {
                                Icon(Icons.Default.MoreVert, contentDescription = "More")
                            }
                            DropdownMenu(
                                expanded = expanded,
                                onDismissRequest = { expanded = false }
                            ) {
                                DropdownMenuItem(
                                    text = { Text("Settings") },
                                    onClick = { /* Navigate to settings */ }
                                )
                                DropdownMenuItem(
                                    text = { Text("Help") },
                                    onClick = { /* Show help */ }
                                )
                            }
                        }
                    )
                }
            ) { _ ->
                App()
            }


        }
    }
}

@Preview
@Composable
fun AppAndroidPreview() {
    App()
}