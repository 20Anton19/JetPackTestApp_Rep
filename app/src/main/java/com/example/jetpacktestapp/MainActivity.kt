package com.example.jetpacktestapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpacktestapp.ui.theme.JetPackTestAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ListItem()

        }
    }
}

@Composable
private fun ListItem(){
    Row(
        modifier = Modifier.background(color = Color.Blue).fillMaxSize(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column (
            modifier = Modifier.background(color = Color.Blue).fillMaxHeight(),
            verticalArrangement = Arrangement.SpaceBetween
        ){
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
        }
        Column (
            modifier = Modifier.background(color = Color.Blue).fillMaxHeight(),
            verticalArrangement = Arrangement.SpaceBetween
        ){
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
        }
        Column (
            modifier = Modifier.background(color = Color.Blue).fillMaxHeight(),
            verticalArrangement = Arrangement.SpaceBetween
        ){
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
        }
        Column (
            modifier = Modifier.background(color = Color.Blue).fillMaxHeight(),
            verticalArrangement = Arrangement.SpaceBetween
        ){
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
        }
        Column (
            modifier = Modifier.background(color = Color.Blue).fillMaxHeight(),
            verticalArrangement = Arrangement.SpaceBetween
        ){
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
        }
        Column (
            modifier = Modifier.background(color = Color.Blue).fillMaxHeight(),
            verticalArrangement = Arrangement.SpaceBetween
        ){
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
        }
        Column (
            modifier = Modifier.background(color = Color.Blue).fillMaxHeight(),
            verticalArrangement = Arrangement.SpaceBetween
        ){
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
        }
        Column (
            modifier = Modifier.background(color = Color.Blue).fillMaxHeight(),
            verticalArrangement = Arrangement.SpaceBetween
        ){
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
        }
        Column (
            modifier = Modifier.background(color = Color.Blue).fillMaxHeight(),
            verticalArrangement = Arrangement.SpaceBetween
        ){
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
        }
        Column (
            modifier = Modifier.background(color = Color.Blue).fillMaxHeight(),
            verticalArrangement = Arrangement.SpaceBetween
        ){
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "image")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ListItem()
}
/*fun MyTextStyle(){
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

}*/