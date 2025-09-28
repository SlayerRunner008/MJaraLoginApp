package com.example.loginapp.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
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
val data = listOf(DataComponentClass("First name","Introduzca primer nombre"),
    DataComponentClass( "Last name","introduzca apellido"),
    DataComponentClass ("Email","Introduzca su email"))
@Composable
fun SignUpScreen(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {

        Row (
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center

        ) {
            Text(text = "Sign Up",
                color = Color.White,
                fontSize = 28.sp,
                modifier = Modifier
                    .padding(top = 16.dp)
                )
        }

        Column (
            modifier = Modifier
                .fillMaxWidth()
                .weight(8f)
                .clip(RoundedCornerShape(topStart = 70.dp))
                .background(Color.White)
                .padding(horizontal = 24.dp, vertical = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            DataComponent(title = data[0].title,data[0].description)
            DataComponent(title = data[1].title,data[1].description)
            DataComponent(title = data[2].title,data[2].description)
            PasswordComponent(title = "Password", descritpion = "Introduzca contraseña")
            PasswordComponent(title = "Confirm Password", descritpion = "Confirme contraseña")
            ButtonComponent(text = "Login")

            Text(
                text = "Already have any account? Sign In",
                modifier = Modifier.clickable {
                    navController.navigate(LoginScreenRoute)
                },
                style = MaterialTheme.typography.bodySmall,
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
