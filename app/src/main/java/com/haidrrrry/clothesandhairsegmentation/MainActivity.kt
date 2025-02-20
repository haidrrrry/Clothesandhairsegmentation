package com.haidrrrry.clothesandhairsegmentation

import android.graphics.BitmapFactory
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.haidrrrry.clothesandhairsegmentation.classes.TFLiteModel


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

                Surface(modifier = Modifier.fillMaxSize()) {
                    SegmentationScreen()
                }
            }
        }
    }



@Composable
fun SegmentationScreen() {
    val context = LocalContext.current
    val tfliteModel = remember { TFLiteModel(context) }
    var segmentedBitmap by remember { mutableStateOf<android.graphics.Bitmap?>(null) }

    LaunchedEffect(Unit) {
        val inputStream = context.assets.open("person3.jpg")
        val bitmap = BitmapFactory.decodeStream(inputStream)

        val output = tfliteModel.runModel(bitmap)
        val segmentationMap = tfliteModel.getSegmentationMap(output)
        segmentedBitmap = tfliteModel.applySegmentationOverlay(bitmap, segmentationMap)
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        segmentedBitmap?.let { bitmap ->
            Image(
                bitmap = bitmap.asImageBitmap(),
                contentDescription = "Segmented Image",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Fit // Or use ContentScale.Fit if you prefer
            )
        } ?: CircularProgressIndicator(
            modifier = Modifier.align(Alignment.Center)
        )
    }
}