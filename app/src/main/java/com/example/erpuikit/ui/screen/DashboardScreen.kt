package com.example.erpuikit.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.erpuikit.ui.theme.Blue
import com.example.erpuikit.ui.theme.Gray
import com.example.erpuikit.ui.theme.LightBlue
import com.example.erpuikit.ui.theme.Orange
import com.example.erpuikit.ui.theme.Purple

@Composable
fun DashboardScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Blue)
    ) {
        Column(
            modifier = Modifier
                .background(Blue)
                .fillMaxWidth()
                .weight(3f)
        ) { }
        Column(
            modifier = Modifier
                .clip(RoundedCornerShape(30.dp))
                .background(Color.White)
                .fillMaxWidth()
                .weight(10f)
        ) { }
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 20.dp, start = 10.dp, end = 10.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                Text(
                    text = "Hi Aizen", color = Color.White, fontSize = 25.sp
                )
                Text(
                    text = "Class Soul Society", color = Gray, fontSize = 18.sp
                )
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(15.dp))
                        .background(Color.White)
                        .padding(5.dp)
                ) {
                    Text(
                        text = "2026/2027", fontSize = 15.sp, color = Blue
                    )
                }
            }

            Icon(
                imageVector = Icons.Default.AccountCircle, contentDescription = ""
            )


        }
        SuperRow(left = {
            BigCard(
                image = Icons.Default.AccountCircle,
                value = "80.39%",
                parameter = "Attendance",
                color = Orange
            )
        }, right = {
            BigCard(
                image = Icons.Default.Info,
                value = "80.39%",
                parameter = "Attendance",
                color = Purple
            )
        })
        SuperRow(
            left = {
                SmallCard(
                    image = Icons.Default.Edit, text = "Play Quiz"
                )
            },

            right = {
                SmallCard(
                    image = Icons.Default.Edit, text = "Play Quiz"
                )
            })
    }
}

@Composable
fun SuperRow(
    left: @Composable () -> Unit, right: @Composable () -> Unit
) {
    Row(
        modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Row(
            modifier = Modifier.weight(1f), horizontalArrangement = Arrangement.Start
        ) {
            left()
        }
        Row(
            modifier = Modifier.weight(1f), horizontalArrangement = Arrangement.End
        ) {
            right()
        }
    }
}

@Composable
fun BigCard(image: ImageVector, value: String, parameter: String, color: Color) {
    Column(
        modifier = Modifier
            .clip(RoundedCornerShape(15.dp))
            .background(Color.White)
            .border(
                width = 1.dp, color = Blue, shape = RoundedCornerShape(15.dp)
            )
            .padding(15.dp)
            .fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(10.dp),
        horizontalAlignment = Alignment.Start
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth(0.5f)
                .aspectRatio(0.8f)
        ) {
            Icon(
                imageVector = image,
                contentDescription = "",
                modifier = Modifier.fillMaxSize(),
                tint = color
            )
        }
        Text(
            text = value, fontSize = 22.sp, fontWeight = FontWeight.Black
        )
        Text(
            text = parameter, fontSize = 18.sp, color = Color.Gray
        )
    }
}

@Composable
fun SmallCard(image: ImageVector, text: String) {
    Column(
        modifier = Modifier
            .clip(RoundedCornerShape(15.dp))
            .background(LightBlue)
            .padding(12.dp)
            .fillMaxWidth(), verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Icon(
            imageVector = image, contentDescription = "", tint = Blue
        )
        Text(
            text = text, fontSize = 18.sp
        )
    }
}

@Preview
@Composable
private fun DashboardScreenPrev() {
    DashboardScreen()
}