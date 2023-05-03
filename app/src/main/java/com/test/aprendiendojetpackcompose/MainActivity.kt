package com.test.aprendiendojetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.test.aprendiendojetpackcompose.ui.theme.AprendiendoJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            app()
        }
    }
}

@Preview
@Composable
fun app() {
    var likesCounter by rememberSaveable{ mutableStateOf(0)}

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        item {
            Image(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .height(400.dp),
                painter = painterResource(id = R.drawable.lape_cubico2),
                contentDescription = "lape_image"
            )

            Row(modifier = Modifier.padding(start = 20.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.ic_favorite),
                    contentDescription = "like",
                    modifier = Modifier.clickable { likesCounter++ }
                )
                Text(
                    text = likesCounter.toString(),
                    color = Color.White,
                    modifier = Modifier.padding(start = 4.dp)
                )
            }
            Text(
                text = "LAPE",
                fontSize = 32.sp,
                color = Color.White,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )
            Text(
                text = "Descripción:",
                color = Color.White,
                modifier = Modifier.padding(16.dp)
            )
            Text(
                text = "LAPE es la primera sonda autoreplicante en el universo conocido, " +
                        "el primer modelo funcional fue creado por Outis Project en 2051" +
                        ", " +
                        "la financiación fue obtenida gracias a un videojuego P2E desarrollado " +
                        "por la misma empresa veinte años antes. ",
                color = Color.White,
                modifier = Modifier.padding(16.dp)
            )
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {

                Text(text = "Largo:", color = Color.White)
                Text(text = "0.9 m", color = Color.White)
            }
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {

                Text(text = "Ancho:", color = Color.White)
                Text(text = "1 m", color = Color.White)
            }

        }
    }
}