package com.example.erpuikit.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.erpuikit.R
import com.example.erpuikit.ui.theme.Blue
import com.example.erpuikit.ui.theme.Gray

@Composable
fun LoginScreen(modifier: Modifier = Modifier) {
    var login by remember {mutableStateOf("")}
    var password by remember {mutableStateOf("")}
    val colors = TextFieldDefaults.colors(
        focusedContainerColor = Color.Transparent,
        unfocusedContainerColor = Color.Transparent,
        disabledContainerColor = Color.Transparent,
        focusedIndicatorColor = Color.Gray,
        unfocusedIndicatorColor = Color.Gray,
        disabledIndicatorColor = Color.Gray
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Blue),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ){
        Box(
            modifier = Modifier.padding(start = 40.dp, top = 40.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.vector),
                contentDescription = "",
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.FillWidth
            )
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
        ) {
            Text(
                text = "Hi Student",
                color = Color.White,
                fontSize = 30.sp
            )
            Text(
                text = "Sign in to continue",
                color = Gray,
                fontSize = 15.sp
            )
        }
        Column(
            modifier = Modifier
                .fillMaxSize()
                .clip(RoundedCornerShape(30.dp))
                .background(Color.White)
                .padding(20.dp)
        ) {
            Text(
                text = "Mobile Number/Email",
                color = Color.Gray,
                fontSize = 15.sp
            )
            TextField(
                value = login,
                onValueChange = {login = it},
                modifier = Modifier.fillMaxWidth(),
                colors = colors
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "Password",
                color = Color.Gray,
                fontSize = 15.sp
            )
            TextField(
                value = password,
                onValueChange = {password = it},
                modifier = Modifier.fillMaxWidth(),
                colors = colors,
                visualTransformation = PasswordVisualTransformation(),
                trailingIcon = {
                    Icon(
                        imageVector = Icons.Default.Lock,
                        contentDescription = "",
                        tint = Color.Gray
                    )
                }
            )
            Spacer(modifier = Modifier.height(40.dp))
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = Blue,
                    contentColor = Color.White
                ),
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Text(
                        text = "SIGN IN",
                         //modifier = Modifier.fillMaxWidth()
                    )
                    Icon(
                        imageVector = Icons.Default.ArrowForward,
                        contentDescription = ""
                    )
                }
            }
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "Forgot password?",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.End
            )
        }
    }
}

@Preview
@Composable
private fun LoginScreenPrev() {
    LoginScreen()
}