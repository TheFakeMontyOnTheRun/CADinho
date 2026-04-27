package pt.b13h.cadinho

import androidx.compose.runtime.mutableStateListOf

data class GridConfig(
    val rules: List<List<String>>
)

class GridState {
    var options = mutableStateListOf(
        mutableStateListOf("A", "B", "C"),
        mutableStateListOf("Option 1", "Option 2", "Option 3"),
        mutableStateListOf("Option 1", "Option 2", "Option 3"),
        mutableStateListOf("Option 1", "Option 2", "Option 3"),
        mutableStateListOf("Option 1", "Option 2", "Option 3"),
        mutableStateListOf("Option 1", "Option 2", "Option 3")
    )

    fun addOption(index: Int) {
        options[index].add("New ${options[index].size}")
    }
}