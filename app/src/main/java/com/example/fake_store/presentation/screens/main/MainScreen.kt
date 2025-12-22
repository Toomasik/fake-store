package com.example.fake_store.presentation.screens.main

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Search
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fake_store.R
import com.example.fake_store.presentation.theme.ui.Background
import com.example.fake_store.presentation.theme.ui.Gray
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.NavController
import com.example.fake_store.presentation.Space
import com.example.fake_store.presentation.theme.ui.LightGray

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun MainScreen(innerPadding: PaddingValues, navController: NavController) {
    var searchValue by remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Background)
            .padding(innerPadding)
            .padding(horizontal = 20.dp)
    ) {
        Row(Modifier.fillMaxWidth()) {
            Image(
                painter = painterResource(R.drawable.ic_launcher_background),
                contentDescription = null,
                modifier = Modifier
                    .clip(RoundedCornerShape(50))
                    .size(50.dp)

            )
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 25.dp)
            ) {
                Text("Good Morning", fontSize = 12.sp, color = Gray)
                Text("Jhon")
            }
            IconButton({}) {
                Icon(Icons.Outlined.Notifications, contentDescription = null)
            }
            IconButton({}) {
                Icon(Icons.Outlined.FavoriteBorder, contentDescription = null)
            }
        }
        OutlinedTextField(
            searchValue, { searchValue = it },
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp)
                .padding(top = 20.dp)
                .background(LightGray, RoundedCornerShape(30))
                .border(
                    3.dp, Color.Black,
                    RoundedCornerShape(30)
                )
                .padding(horizontal = 10.dp),
            placeholder = { Text("Search", color = Gray, fontSize = 16.sp) },
            colors = TextFieldDefaults.colors(
                unfocusedIndicatorColor = Color.Transparent,
                unfocusedContainerColor = Color.Transparent,
                focusedContainerColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent,
            ),
            trailingIcon = {
                IconButton({}) {
                    Icon(
                        Icons.Outlined.Menu,
                        contentDescription = null,
                        tint = Gray
                    )
                }
            },
            leadingIcon = {
                IconButton({}) {
                    Icon(
                        Icons.Outlined.Search,
                        contentDescription = null,
                        tint = Gray
                    )
                }
            }
        )
        Row(
            Modifier
                .fillMaxWidth()
                .padding(vertical = 15.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text("Special Offer", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            Text("See All", fontSize = 20.sp, fontWeight = FontWeight.Bold)
        }
        Row(
            Modifier
                .fillMaxWidth()
                .background(LightGray, RoundedCornerShape(40.dp))
                .padding(20.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Column(Modifier.width(200.dp)) {
                Text("30%", fontSize = 30.sp, fontWeight = FontWeight.Bold)
                Space(height = 8.dp)
                Text("Today's Special", fontWeight = FontWeight.SemiBold, fontSize = 24.sp)
                Space(height = 8.dp)
                Text("The automobile layout consists of a front-engine", fontSize = 16.sp)
            }
            Image(
                painterResource(R.drawable.pizza),
                contentDescription = null,
                contentScale = ContentScale.FillWidth,
                alignment = Alignment.Center,
                modifier = Modifier
                    .weight(1f)
                    .clip(RoundedCornerShape(30.dp))
            )
        }
        Space(height = 15.dp)
        FlowRow(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(30.dp),
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            for (i in listOf("Clothes", "Electronics", "Funiture", "Shoes", "Others", "Jewelery")) {
                Category(Icons.Default.ShoppingCart, i)
            }
        }
        Space(height = 15.dp)
        Row(
            Modifier
                .fillMaxWidth()
                .padding(vertical = 15.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text("Most Popular", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            Text("See All", fontSize = 20.sp, fontWeight = FontWeight.Bold)
        }
    }

}

@Composable
fun Category(icon: ImageVector, info: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Icon(
            icon,
            contentDescription = null,
            modifier = Modifier.background(LightGray, RoundedCornerShape(50)).padding(20.dp)
        )
        Space(height = 10.dp)
        Text(info, fontSize = 14.sp)
    }

}
