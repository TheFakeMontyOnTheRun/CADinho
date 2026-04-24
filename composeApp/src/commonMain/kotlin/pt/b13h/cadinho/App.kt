package pt.b13h.cadinho

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.painterResource

import cadinho.composeapp.generated.resources.Res
import cadinho.composeapp.generated.resources.compose_multiplatform

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

                // *\
                // **
                drawLine(
                    color = Color.Blue,
                    start = Offset(
                        x = (-(cy + 1) * 10 + (cx * 10) + canvasWidth / 2).toFloat(),
                        y = ((cx + 1) * 10 + cy * 10 + canvasHeight / 4).toFloat()
                    ),
                    end = Offset(
                        x = (-(cy + 1) * 10 + (cx + 1) * 10 + canvasWidth / 2).toFloat(),
                        y = ((cx + 1) * 10 + (cy + 1) * 10 + canvasHeight / 4).toFloat()
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
                        y = ((cx + 1) * 10 + (cy + 1) * 10 + canvasHeight / 4).toFloat()
                    ),
                    end = Offset(
                        x = (-(cy + 1) * 10 + (cx) * 10 + canvasWidth / 2).toFloat(),
                        y = ((cx + 1) * 10 + (cy + 2) * 10 + canvasHeight / 4).toFloat()
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
                        y = ((cx + 1) * 10 + cy * 10 + canvasHeight / 4).toFloat()
                    ),
                    end = Offset(
                        x = (-(cy + 1) * 10 + (cx - 1) * 10 + canvasWidth / 2).toFloat(),
                        y = ((cx + 1) * 10 + (cy + 1) * 10 + canvasHeight / 4).toFloat()
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
                        y = ((cx + 1) * 10 + (cy + 1) * 10 + canvasHeight / 4).toFloat()
                    ),
                    end = Offset(
                        x = (-(cy + 1) * 10 + (cx) * 10 + canvasWidth / 2).toFloat(),
                        y = ((cx + 1) * 10 + (cy + 2) * 10 + canvasHeight / 4).toFloat()
                    ),
                    strokeWidth = 1.dp.toPx(), // Convert DP to Pixels
                    cap = StrokeCap.Round
                )


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