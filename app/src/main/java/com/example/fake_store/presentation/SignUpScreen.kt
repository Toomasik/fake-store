package com.example.fake_store.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.outlined.Face
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
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
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.fake_store.presentation.theme.ui.Background
import com.example.fake_store.presentation.theme.ui.GrayFont

@Composable
fun SignUp(innerPadding: PaddingValues, navController: NavController) {
    var nameValue by remember { mutableStateOf("") }
    var emailValue by remember { mutableStateOf("") }
    var passwordValue by remember { mutableStateOf("") }
    var transformation by remember { mutableStateOf(true) }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Background)
            .padding(innerPadding)
            .padding(horizontal = 20.dp)
    ) {
        IconButton({navController.popBackStack()}) {
            Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "")
        }
        Text(
            "Create   account",
            fontSize = 48.sp,
            lineHeight = 64.sp,
            modifier = Modifier.padding(top = 60.dp)
        )
        Text(
            "Email",
            fontSize = 24.sp,
            modifier = Modifier.padding(top = 25.dp),
            color = GrayFont
        )
        OutlinedTextField(
            nameValue, { nameValue = it },
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
            ),
            trailingIcon = {
                IconButton({ nameValue = "" }) {
                    Icon(
                        Icons.Filled.Clear,
                        contentDescription = null
                    )
                }
            }
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
            ),
            trailingIcon = {
                IconButton({ emailValue = "" }) {
                    Icon(
                        Icons.Filled.Clear,
                        contentDescription = null
                    )
                }
            }
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
            ),
            visualTransformation = if (transformation) PasswordVisualTransformation() else VisualTransformation.None,
            trailingIcon = {
                IconButton({ transformation = !transformation}) {
                    Icon(
                        Icons.Outlined.Face,
                        contentDescription = null
                    )
                }
            }
        )

        Button(
            {},
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 15.dp)
                .background(Color.Black, RoundedCornerShape(50)),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent)
        ) {
            Text("Login", color = Color.White, fontSize = 24.sp)
        }
    }
}