package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.app.NotificationCompat.getColor
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                BusinessCard()
            }
        }
    }
}

@Preview()
@Composable
fun BusinessCard(){
    val image = painterResource(R.drawable.logo)
    Column(modifier = Modifier.background(Color.White)
        .fillMaxWidth().fillMaxHeight().padding(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,){
        Image(painter = image, contentDescription = "logo",
            alignment = Alignment.CenterStart,
            contentScale = ContentScale.Fit,
            modifier = Modifier.clip(CircleShape))
        Spacer(modifier = Modifier.padding(2.dp))
        Text("Akshat Bhardwaj",
            fontWeight = FontWeight.Bold,
            fontSize = 40.sp)
        Text(text = "Android Developer",
            fontSize = 25.sp)
        Spacer(modifier = Modifier.padding(70.dp))

        Row(modifier = Modifier.padding(10.dp)
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center) {
            Icon(imageVector = Icons.Default.Call,contentDescription = null)
            Spacer(modifier = Modifier.padding(horizontal = 13.dp))
            Text("+91 740XXXXXXX",
                fontSize = 20.sp)
        }
        Row(modifier = Modifier.padding(10.dp)
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center) {
            Icon(imageVector = Icons.Default.Share,contentDescription = null)
            Spacer(modifier = Modifier.padding(horizontal = 32.dp,))
            Text("@AndroidDev",
                fontSize = 20.sp)
        }
        Row(modifier = Modifier.padding(10.dp)
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center) {
            Icon(imageVector = Icons.Default.Email,contentDescription = null)
            Spacer(modifier = Modifier.padding(horizontal = 20.dp,))
            Text("test@gmail.com",
                fontSize = 20.sp)
    }
}}


