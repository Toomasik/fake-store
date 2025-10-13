package com.example.fake_store.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LogIn(innerPadding: PaddingValues) {
    var emailValue by remember { mutableStateOf("") }
    var passwordValue by remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Background)
            .padding(innerPadding)
            .padding(horizontal = 20.dp)
    ) {
        Text(
            "Login to your account",
            fontSize = 48.sp,
            lineHeight = 64.sp,
            modifier = Modifier.padding(top = 100.dp)
        )

        Text(
            "Email",
            fontSize = 24.sp,
            modifier = Modifier.padding(top = 25.dp),
            color = GrayFont
        )
        OutlinedTextField(
            emailValue, { emailValue = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp)
                .border(
                    3.dp, Color.Black,
                    RoundedCornerShape(30)
                )
                .padding(10.dp),
            placeholder = { Text("Email here", color = GrayFont, fontSize = 24.sp) },
            colors = TextFieldDefaults.colors(
                unfocusedIndicatorColor = Color.Transparent,
                unfocusedContainerColor = Color.Transparent,
                focusedContainerColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent,
            )
        )
        Text(
            "Password",
            fontSize = 24.sp,
            modifier = Modifier.padding(top = 25.dp),
            color = GrayFont
        )
        OutlinedTextField(
            passwordValue, { passwordValue = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp)
                .border(
                    3.dp, Color.Black,
                    RoundedCornerShape(30)
                )
                .padding(10.dp),
            placeholder = { Text("Email passowrd", color = GrayFont, fontSize = 24.sp) },
            colors = TextFieldDefaults.colors(
                unfocusedIndicatorColor = Color.Transparent,
                unfocusedContainerColor = Color.Transparent,
                focusedContainerColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent,
            )
        )

        Button(
            {},
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 15.dp)
                .background(Color.Black, RoundedCornerShape(50))
                ,
            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent)
        ) {
            Text("Login", color = Color.White, fontSize = 24.sp)
        }

    }
}