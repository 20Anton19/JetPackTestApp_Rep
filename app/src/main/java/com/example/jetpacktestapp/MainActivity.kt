package com.example.jetpacktestapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpacktestapp.ui.theme.JetPackTestAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTextStyle()
        }
    }
}

@Preview (showBackground = true)
@Composable
fun MyTextStyle(){
    Row(
        modifier = Modifier
            .background(Color.Blue)
            .fillMaxSize(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Column {
            Text(text = "МИШК")
        }
        Column {
            Text(text = "МИШК")
        }
        Column {
            Text(text = "МИШК")
        }
    }
    Row(
        modifier = Modifier
            .background(Color.Blue),
        verticalAlignment = Alignment.Bottom,
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Column {
            Text(text = "МИШК")
        }
        Column {
            Text(text = "МИШК")
        }
        Column {
            Text(text = "МИШК")
        }
    }

}