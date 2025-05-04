package com.example.tarjetadepresentacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tarjetadepresentacion.ui.theme.TarjetaDePresentacionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TarjetaDePresentacionTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.LightGray
                ) {
                    TarjetaDePresentacionApp()
                }
            }
        }
    }
}

@Composable
fun TarjetaDePresentacionApp() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Sección de información principal (logo, nombre, cargo)
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            val imagen = painterResource(R.drawable.android_logo)
            Image(
                painter = imagen,
                contentDescription = "Logo de Android",
                modifier = Modifier.size(120.dp)
            )
            Text(
                text = "Emilio Torres",
                fontSize = 36.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black, // Cambiado el color del texto
                modifier = Modifier.padding(top = 16.dp)
            )
            Text(
                text = "Android Dev",
                fontSize = 16.sp,
                color = Color.Black, // Cambiado el color del texto
                textAlign = TextAlign.Center
            )
        }

        // Sección de información de contacto
        Column(
            horizontalAlignment = Alignment.Start,
            modifier = Modifier.padding(bottom = 64.dp)
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    imageVector = Icons.Default.Phone,
                    contentDescription = "Teléfono",
                    tint = Color.Black, // Cambiado el color del icono
                    modifier = Modifier.padding(end = 16.dp)
                )
                Text(
                    text = "+595 (0985) 444 555 666",
                    fontSize = 16.sp,
                    color = Color.Black // Cambiado el color del texto
                )
            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    imageVector = Icons.Default.Share,
                    contentDescription = "Compartir",
                    tint = Color.Black, // Cambiado el color del icono
                    modifier = Modifier.padding(end = 16.dp)
                )
                Text(
                    text = "@AndroidDevEmilio",
                    fontSize = 16.sp,
                    color = Color.Black // Cambiado el color del texto
                )
            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    imageVector = Icons.Default.Email,
                    contentDescription = "Correo electrónico",
                    tint = Color.Black, // Cambiado el color del icono
                    modifier = Modifier.padding(end = 16.dp)
                )
                Text(
                    text = "emtorres@uaa.edu.py",
                    fontSize = 16.sp,
                    color = Color.Black // Cambiado el color del texto
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TarjetaDePresentacionPreview() {
    TarjetaDePresentacionTheme {
        TarjetaDePresentacionApp()
    }
}
