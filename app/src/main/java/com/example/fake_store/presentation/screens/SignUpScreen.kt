package com.example.fake_store.presentation.screens

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
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.fake_store.domain.ViewModels.SignInVM
import com.example.fake_store.domain.postBodies.usersCreate
import com.example.fake_store.presentation.theme.ui.Background
import com.example.fake_store.presentation.theme.ui.Gray

@Composable
fun SignUp(innerPadding: PaddingValues, navController: NavController, vm: SignInVM = viewModel()) {
    var nameValue by remember { mutableStateOf("abcdefghjjrewoiu") }
    var emailValue by remember { mutableStateOf("abcdefghjjrewoiu@gmail.com") }
    var passwordValue by remember { mutableStateOf("12345678fvghgf") }
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
            "Create  account",
            fontSize = 48.sp,
            lineHeight = 64.sp,
            modifier = Modifier.padding(top = 60.dp)
        )
        Text(
            "Name",
            fontSize = 24.sp,
            modifier = Modifier.padding(top = 25.dp),
            color = Gray
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
            placeholder = { Text("Name here", color = Gray, fontSize = 24.sp) },
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
            color = Gray
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
            placeholder = { Text("Email here", color = Gray, fontSize = 24.sp) },
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
            color = Gray
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
            placeholder = { Text("Email passowrd", color = Gray, fontSize = 24.sp) },
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
            {
                val body = usersCreate(email=emailValue, password=passwordValue, name = nameValue)
                vm.createUser(body)
            },
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