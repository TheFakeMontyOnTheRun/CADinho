package pt.b13h.cadinho

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
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
                            y = ((cx + 1) * 5 + cy * 5  + canvasHeight / 4).toFloat()
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
                            y = ((cx + 1) * 5 + (cy + 1) * 5  + canvasHeight / 4).toFloat()
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
                            y = ((cx + 1) * 5 + (cy + 1) * 5  + canvasHeight / 4).toFloat()
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
                            y = ((cx + 1) * 5 + (cy + 2) * 5  + canvasHeight / 4).toFloat()
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
                            y = ((cx + 1) * 5 + (cy + 2) * 5  + canvasHeight / 4).toFloat()
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
@Preview
fun App() {
    MaterialTheme {
        Grid()
    }
}