package com.example.erpuikit.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.erpuikit.ui.theme.Blue

@Composable
fun DashboardScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Blue)
    ) {
        Column() {
            Text(
                text = "Hi Aizen"
            )
            Text(
                text = "Class Soul Society"
            )
            Text(
                text = "2026/2027"
            )
            Row() {
                Box(
                    modifier = Modifier.weight(1f)
                ) {
                    BigCard(
                        image = Icons.Default.AccountCircle,
                        value = "80.39%",
                        parameter = "Attendance"
                    )
                }
                Spacer(modifier = Modifier.width(10.dp))
                Box(
                    modifier = Modifier.weight(1f)
                ) {
                    BigCard(
                        image = Icons.Default.AccountCircle,
                        value = "80.39%",
                        parameter = "Attendance"
                    )
                }
            }
        }
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
        ) { }
    }
}

@Composable
fun BigCard(image: ImageVector, value: String, parameter: String) {
    Column(
        modifier = Modifier
            .clip(RoundedCornerShape(15.dp))
            .background(Color.White)
            .padding(10.dp)
            .fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.Start
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth(0.5f)
                .aspectRatio(1f)
        ) {
            Icon(
                imageVector = image,
                contentDescription = "",
                modifier = Modifier.fillMaxSize()
            )
        }
        Text(
            text = value
        )
        Text(
            text = parameter
        )
    }
}

@Preview
@Composable
private fun DashboardScreenPrev() {
    DashboardScreen()
}