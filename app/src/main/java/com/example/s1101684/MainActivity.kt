package com.example.s1101684

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.s1101684.ui.theme.S1101684Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            S1101684Theme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    Greeting("作者：資管2A 郭家瑋")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Box(modifier = Modifier.fillMaxSize()) {
        Canvas(modifier = Modifier.fillMaxSize()) {
            drawRect(
                color = Color.Blue,
                topLeft = Offset(size.width - 400f, size.height - 200f),
                size = Size(400f, 200f)
            )
            drawRect(
                color = Color.Blue,
                topLeft = Offset(0f, 0f),
                size = Size(400f, 200f)
            )
        }
        Column {
            Text(text = "$name")
            Image(
                painter = painterResource(id = R.drawable.map),
                contentDescription = "地圖"
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    S1101684Theme {
        Greeting("作者：資管2A 郭家瑋 ")
    }
}