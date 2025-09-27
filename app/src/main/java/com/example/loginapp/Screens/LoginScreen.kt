package com.example.loginapp.Screens
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import coil.compose.AsyncImage
import com.example.loginapp.Components.DataComponent
import com.example.loginapp.classes.LoginImage
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

val image  = LoginImage(
    url = " ",
    description = " "
)
@Composable
fun LoginScreen(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {

        Column (
            modifier = Modifier
                .weight(1f)
                .padding(top = 100.dp)

        ) {
            AsyncImage(
                model = image.url,
                contentDescription = image.description,
                modifier = Modifier
                    .height(50.dp)
                    .width(50.dp)
                    .background(Color.Blue)
                ,


            )

        }

        Column (
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(topStart = 70.dp))
                .background(Color.White)
                .padding(30.dp)
                .padding(top = 20.dp)
                .weight(2f),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Login",
                fontWeight = FontWeight.Bold,
                style = MaterialTheme.typography.headlineLarge,
                modifier = Modifier.padding(bottom = 50.dp)
                )
            DataComponent()
        }

    }
}

@Preview(showBackground = true, showSystemUi = false)
@Composable
fun LoginPreview() {
    LoginScreen()
}