package com.example.loginapp.Screens
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import coil.compose.AsyncImage
import com.example.loginapp.Components.DataComponent
import com.example.loginapp.classes.LoginImage

val image  = LoginImage(
    url = " ",
    description = " "
)
@Composable
fun LoginScreen(){
    Column {
        AsyncImage(
            model = image.url,
            contentDescription = image.description,
            modifier = Modifier
        )

        Column {
            Text(text = "Login")
            DataComponent()
        }

    }
}