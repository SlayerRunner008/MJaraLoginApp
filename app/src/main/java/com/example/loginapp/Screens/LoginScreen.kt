package com.example.loginapp.Screens
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import com.example.loginapp.Components.DataComponent
import com.example.loginapp.classes.LoginImage
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil3.compose.AsyncImage
import com.example.loginapp.Components.ButtonComponent
import com.example.loginapp.Components.PasswordComponent
import com.example.loginapp.classes.DataComponentClass

val image  = LoginImage(
    url = "https://cdn-icons-png.flaticon.com/512/761/761291.png",
    description = "imagen de halo "
)
val dataCard = DataComponentClass("Email","introduzca su email")
@Composable
fun LoginScreen(navController: NavController){
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
                    .clip(CircleShape)
                    .background(Color.White)
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
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            Text(text = "Login",
                fontWeight = FontWeight.Bold,
                style = MaterialTheme.typography.headlineLarge,
                color = Color.Black,
                modifier = Modifier.padding(bottom = 50.dp)
                )
            DataComponent(title = dataCard.title, Description = dataCard.description)

            PasswordComponent(title = "Password", descritpion = "introduzca su contraseña")

            ButtonComponent(text = "Login")

            Text(
                text = "Don't have any account? Sign Up",
                modifier = Modifier.clickable {
                    navController.navigate(SignupScreenRoute)
                },
                style = MaterialTheme.typography.bodyMedium,
                color = Color.Black
            )

        }

    }
}

