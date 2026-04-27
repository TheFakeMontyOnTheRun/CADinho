package pt.b13h.cadinho

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Grid() {

    Canvas(modifier = Modifier.fillMaxSize()) {
        val canvasWidth = size.width
        val canvasHeight = size.height


        /*

          /\
          \/\
           \/

        * */



        for (cy in 0..31) {
            for (cx in 0..31) {
                val cellHeight = if ((3 * cx + 8 * cy) % 17 === 0) 6 else 0;
                // *\
                // **
                drawLine(
                    color = Color.Blue,
                    start = Offset(
                        x = (-(cy + 1) * 10 + (cx * 10) + canvasWidth / 2).toFloat(),
                        y = ((cx + 1) * 5 + cy * 5 - cellHeight * 5 + canvasHeight / 4).toFloat()
                    ),
                    end = Offset(
                        x = (-(cy + 1) * 10 + (cx + 1) * 10 + canvasWidth / 2).toFloat(),
                        y = ((cx + 1) * 5 + (cy + 1) * 5 - cellHeight * 5 + canvasHeight / 4).toFloat()
                    ),
                    strokeWidth = 1.dp.toPx(), // Convert DP to Pixels
                    cap = StrokeCap.Round
                )

                // **
                // */
                drawLine(
                    color = Color.Blue,
                    start = Offset(
                        x = (-(cy + 1) * 10 + (cx + 1) * 10 + canvasWidth / 2).toFloat(),
                        y = ((cx + 1) * 5 + (cy + 1) * 5 - cellHeight * 5 + canvasHeight / 4).toFloat()
                    ),
                    end = Offset(
                        x = (-(cy + 1) * 10 + (cx) * 10 + canvasWidth / 2).toFloat(),
                        y = ((cx + 1) * 5 + (cy + 2) * 5 - cellHeight * 5 + canvasHeight / 4).toFloat()
                    ),
                    strokeWidth = 1.dp.toPx(), // Convert DP to Pixels
                    cap = StrokeCap.Round
                )

                //   /*
                //   **
                drawLine(
                    color = Color.Blue,
                    start = Offset(
                        x = (-(cy + 1) * 10 + (cx * 10) + canvasWidth / 2).toFloat(),
                        y = ((cx + 1) * 5 + cy * 5 - cellHeight * 5 + canvasHeight / 4).toFloat()
                    ),
                    end = Offset(
                        x = (-(cy + 1) * 10 + (cx - 1) * 10 + canvasWidth / 2).toFloat(),
                        y = ((cx + 1) * 5 + (cy + 1) * 5 - cellHeight * 5 + canvasHeight / 4).toFloat()
                    ),
                    strokeWidth = 1.dp.toPx(), // Convert DP to Pixels
                    cap = StrokeCap.Round
                )


                //  **
                //  \*
                drawLine(
                    color = Color.Blue,
                    start = Offset(
                        x = (-(cy + 1) * 10 + (cx - 1) * 10 + canvasWidth / 2).toFloat(),
                        y = ((cx + 1) * 5 + (cy + 1) * 5 - cellHeight * 5 + canvasHeight / 4).toFloat()
                    ),
                    end = Offset(
                        x = (-(cy + 1) * 10 + (cx) * 10 + canvasWidth / 2).toFloat(),
                        y = ((cx + 1) * 5 + (cy + 2) * 5 - cellHeight * 5 + canvasHeight / 4).toFloat()
                    ),
                    strokeWidth = 1.dp.toPx(), // Convert DP to Pixels
                    cap = StrokeCap.Round
                )



                if (cellHeight > 0) {
                    drawLine(
                        color = Color.Red,
                        start = Offset(
                            x = (-(cy + 1) * 10 + (cx * 10) + canvasWidth / 2).toFloat(),
                            y = ((cx + 1) * 5 + cy * 5 - cellHeight * 5 + canvasHeight / 4).toFloat()
                        ),
                        end = Offset(
                            x = (-(cy + 1) * 10 + (cx * 10) + canvasWidth / 2).toFloat(),
                            y = ((cx + 1) * 5 + cy * 5 + canvasHeight / 4).toFloat()
                        ),
                        strokeWidth = 1.dp.toPx(), // Convert DP to Pixels
                        cap = StrokeCap.Round
                    )

                    // **
                    // */
                    drawLine(
                        color = Color.Red,
                        start = Offset(
                            x = (-(cy + 1) * 10 + (cx + 1) * 10 + canvasWidth / 2).toFloat(),
                            y = ((cx + 1) * 5 + (cy + 1) * 5 - cellHeight * 5 + canvasHeight / 4).toFloat()
                        ),
                        end = Offset(
                            x = (-(cy + 1) * 10 + (cx + 1) * 10 + canvasWidth / 2).toFloat(),
                            y = ((cx + 1) * 5 + (cy + 1) * 5 + canvasHeight / 4).toFloat()
                        ),
                        strokeWidth = 1.dp.toPx(), // Convert DP to Pixels
                        cap = StrokeCap.Round
                    )

                    //   /*
                    //   **
                    drawLine(
                        color = Color.Red,
                        start = Offset(
                            x = (-(cy + 1) * 10 + (cx * 10) + canvasWidth / 2).toFloat(),
                            y = ((cx + 1) * 5 + cy * 5 - cellHeight * 5 + canvasHeight / 4).toFloat()
                        ),
                        end = Offset(
                            x = (-(cy + 1) * 10 + (cx * 10) + canvasWidth / 2).toFloat(),
                            y = ((cx + 1) * 5 + cy * 5 + canvasHeight / 4).toFloat()
                        ),
                        strokeWidth = 1.dp.toPx(), // Convert DP to Pixels
                        cap = StrokeCap.Round
                    )


                    //  **
                    //  \*
                    drawLine(
                        color = Color.Red,
                        start = Offset(
                            x = (-(cy + 1) * 10 + (cx - 1) * 10 + canvasWidth / 2).toFloat(),
                            y = ((cx + 1) * 5 + (cy + 1) * 5 - cellHeight * 5 + canvasHeight / 4).toFloat()
                        ),
                        end = Offset(
                            x = (-(cy + 1) * 10 + (cx - 1) * 10 + canvasWidth / 2).toFloat(),
                            y = ((cx + 1) * 5 + (cy + 1) * 5 + canvasHeight / 4).toFloat()
                        ),
                        strokeWidth = 1.dp.toPx(), // Convert DP to Pixels
                        cap = StrokeCap.Round
                    )

                    drawLine(
                        color = Color.Red,
                        start = Offset(
                            x = (-(cy + 1) * 10 + (cx + 1) * 10 + canvasWidth / 2).toFloat(),
                            y = ((cx + 1) * 5 + (cy + 1) * 5 - cellHeight * 5 + canvasHeight / 4).toFloat()
                        ),
                        end = Offset(
                            x = (-(cy + 1) * 10 + (cx + 1) * 10 + canvasWidth / 2).toFloat(),
                            y = ((cx + 1) * 5 + (cy + 1) * 5 + canvasHeight / 4).toFloat()
                        ),
                        strokeWidth = 1.dp.toPx(), // Convert DP to Pixels
                        cap = StrokeCap.Round
                    )

                    // **
                    // */
                    drawLine(
                        color = Color.Red,
                        start = Offset(
                            x = (-(cy + 1) * 10 + (cx) * 10 + canvasWidth / 2).toFloat(),
                            y = ((cx + 1) * 5 + (cy + 2) * 5 - cellHeight * 5 + canvasHeight / 4).toFloat()
                        ),
                        end = Offset(
                            x = (-(cy + 1) * 10 + (cx) * 10 + canvasWidth / 2).toFloat(),
                            y = ((cx + 1) * 5 + (cy + 2) * 5 + canvasHeight / 4).toFloat()
                        ),
                        strokeWidth = 1.dp.toPx(), // Convert DP to Pixels
                        cap = StrokeCap.Round
                    )

                    //   /*
                    //   **
                    drawLine(
                        color = Color.Red,
                        start = Offset(
                            x = (-(cy + 1) * 10 + (cx - 1) * 10 + canvasWidth / 2).toFloat(),
                            y = ((cx + 1) * 5 + (cy + 1) * 5 - cellHeight * 5 + canvasHeight / 4).toFloat()
                        ),
                        end = Offset(
                            x = (-(cy + 1) * 10 + (cx - 1) * 10 + canvasWidth / 2).toFloat(),
                            y = ((cx + 1) * 5 + (cy + 1) * 5 + canvasHeight / 4).toFloat()
                        ),
                        strokeWidth = 1.dp.toPx(), // Convert DP to Pixels
                        cap = StrokeCap.Round
                    )


                    //  **
                    //  \*
                    drawLine(
                        color = Color.Red,
                        start = Offset(
                            x = (-(cy + 1) * 10 + (cx) * 10 + canvasWidth / 2).toFloat(),
                            y = ((cx + 1) * 5 + (cy + 2) * 5 - cellHeight * 5 + canvasHeight / 4).toFloat()
                        ),
                        end = Offset(
                            x = (-(cy + 1) * 10 + (cx) * 10 + canvasWidth / 2).toFloat(),
                            y = ((cx + 1) * 5 + (cy + 2) * 5 + canvasHeight / 4).toFloat()
                        ),
                        strokeWidth = 1.dp.toPx(), // Convert DP to Pixels
                        cap = StrokeCap.Round
                    )
                }
            }
        }
    }


}

@Composable
fun ComboBoxForm(
    options: List<List<String>>,
    onAdd: (Int) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        options.forEachIndexed { index, opts ->
            ComboRow(
                label = "Combo ${index + 1}",
                options = opts,
                onAdd = { onAdd(index) }
            )
        }
    }
}

@Composable
fun ComboRow(
    label: String,
    options: List<String>,
    onAdd: () -> Unit
) {
    var expanded by remember { mutableStateOf(false) }
    var selected by remember { mutableStateOf(options.first()) }

    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(modifier = Modifier.weight(1f)) {
            Surface(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { expanded = true },
                tonalElevation = 2.dp,
                shape = MaterialTheme.shapes.small,
                border = BorderStroke(1.dp, MaterialTheme.colorScheme.outline)
            ) {
                Row(
                    modifier = Modifier.padding(horizontal = 12.dp, vertical = 10.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(text = selected)

                    Text(
                        text = "▼",
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            }
            DropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false }
            ) {
                options.forEach {
                    DropdownMenuItem(
                        text = { Text(it) },
                        onClick = {
                            selected = it
                            expanded = false
                        }
                    )
                }
            }
        }

        Button(onClick = { onAdd() }) {
            Text("OK")
        }
    }
}

@Composable
@Preview
fun App() {

    val gridState = remember { GridState() }

    MaterialTheme {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .windowInsetsPadding(WindowInsets.safeDrawing)
        ) {

            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
            ) {
                Grid(/*config = gridState.options*/)
            }

            Surface(
                modifier = Modifier
                    .width(320.dp)
                    .fillMaxHeight(),
                tonalElevation = 6.dp
            ) {
                ComboBoxForm(
                    options = gridState.options,
                    onAdd = { index -> gridState.addOption(index) }
                )
            }
        }
    }
}