package com.example.loginapp.Components
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight

@Composable
fun DataComponent() {
    var email by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .shadow(
                elevation = 3.dp,
                shape = RoundedCornerShape(16.dp),
                clip = false
            )
            .background(Color.White, shape = RoundedCornerShape(16.dp))
            .padding(horizontal = 16.dp, vertical = 12.dp)
    ) {
        Text(
            text = "Email",
            style = MaterialTheme.typography.titleMedium,
            color = Color(0xFF333333),
            modifier = Modifier.padding(bottom = 12.dp),
            fontWeight = FontWeight.Bold
        )

        TextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("Introduzca correo") },
            modifier = Modifier
                .fillMaxWidth()
                .height(30.dp)
                .clip(RoundedCornerShape(12.dp)),
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color(0xFFF9F9F9),
                unfocusedContainerColor = Color(0xFFF9F9F9),
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                focusedTextColor = Color.Black,
                unfocusedTextColor = Color.Black,
                cursorColor = Color(0xFF6200EE),
                focusedLabelColor = Color(0xFF6200EE),
                unfocusedLabelColor = Color(0xFF999999)
            ),
            singleLine = true
        )
    }
}