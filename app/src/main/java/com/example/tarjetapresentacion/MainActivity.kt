package com.example.tarjetapresentacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tarjetapresentacion.ui.theme.TarjetaPresentacionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TarjetaPresentacionTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeApp()
                }
            }
        }
    }
}

@Composable
fun ComposeApp(){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.weight(1f)) // Añade un espacio flexible para empujar Bloque1 hacia el centro
        Bloque1(
            image = painterResource(R.drawable.ie),
            title = stringResource(R.string.title),
            subtitle = stringResource(R.string.subtitle),
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 16.dp)
                .fillMaxHeight()
        )
        Spacer(modifier = Modifier.weight(1f)) // Añade un espacio flexible para separar Bloque1 de Bloque2
        Bloque2(
            image1 = painterResource(R.drawable.mark),
            image2 = painterResource(R.drawable.mark),
            image3 = painterResource(R.drawable.mark),
            textTelefono = stringResource(R.string.telephone),
            textRedes = stringResource(R.string.social_media),
            textEmail = stringResource(R.string.email),
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 16.dp)
        )
    }
}



@Composable
fun Bloque1(image: Painter, title: String, subtitle: String, modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = image, contentDescription = null)
        Text(
            text = title,
            modifier = Modifier.padding(top = 16.dp, end = 16.dp),
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp
        )
        Text(
            text = subtitle,
            fontSize = 16.sp
        )
    }
}

@Composable
fun Bloque2(
    image1: Painter,
    image2: Painter,
    image3: Painter,
    textTelefono: String,
    textRedes: String,
    textEmail: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.End
    ) {
        Row(
            modifier = Modifier.padding(horizontal = 8.dp, vertical = 8.dp)
        ) {
            Image(
                painter = image1,
                contentDescription = null,
                modifier = Modifier.size(20.dp)
            )
            Text(text = textTelefono)
        }
        Row(
            modifier = Modifier.padding(horizontal = 8.dp, vertical = 8.dp)
        ) {
            Image(
                painter = image2,
                contentDescription = null,
                modifier = Modifier.size(20.dp)
            )
            Text(text = textRedes)
        }
        Row(
            modifier = Modifier.padding(horizontal = 8.dp, vertical = 8.dp)
        ) {
            Image(
                painter = image3,
                contentDescription = null,
                modifier = Modifier.size(20.dp)
            )
            Text(text = textEmail)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TarjetaPresentacionTheme {
        ComposeApp()
    }
}