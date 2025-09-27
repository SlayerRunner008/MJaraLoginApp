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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import coil.compose.AsyncImage
import com.example.loginapp.Components.ButtonComponent
import com.example.loginapp.Components.DataComponent
import com.example.loginapp.Components.PasswordComponent
import com.example.loginapp.classes.DataComponentClass
import com.example.loginapp.classes.LoginImage
import com.example.loginapp.ui.theme.LoginAppTheme

val img = LoginImage(
    url = " ",
    description = " "
)
val data = listOf(DataComponentClass("First name"), DataComponentClass( "Last name"),
    DataComponentClass ("Email"))
@Composable
fun SignUpScreen(navController: NavController){
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
                model = img.url,
                contentDescription = img.description,
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
                .weight(3f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            Text(text = "Login",
                fontWeight = FontWeight.Bold,
                style = MaterialTheme.typography.headlineLarge,
                modifier = Modifier.padding(bottom = 50.dp)
            )
            DataComponent(title = data[0].title)
            DataComponent(title = data[1].title)
            DataComponent(title = data[2].title)
            PasswordComponent(title = "Password")
            PasswordComponent(title = "Confirm Password")
            ButtonComponent(text = "Login")

            Text(
                text = "Already have any account? Sign In",
                modifier = Modifier.clickable {
                    navController.navigate(LoginScreenRoute)
                },
                style = MaterialTheme.typography.bodyMedium,
                color = Color.Black
            )

        }

    }


}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SignUpScreenPreview() {
    LoginAppTheme {
        val navController = rememberNavController()
        SignUpScreen(navController = navController)
    }
}
