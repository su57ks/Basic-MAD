package com.example.erpuikit.ui.screen

import android.media.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.erpuikit.ui.theme.Blue
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.erpuikit.R

@Composable
fun SplashScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Blue),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom
    ) {
        Image(
            painter = painterResource(R.drawable.path_43880),
            contentDescription = "",
            modifier = Modifier.fillMaxWidth(0.3f),
            contentScale = ContentScale.FillWidth
        )
        Spacer(modifier = Modifier.height(2.dp))
        Image(
            painter = painterResource(R.drawable.path_43881),
            contentDescription = "",
            modifier = Modifier.fillMaxWidth(0.3f),
            contentScale = ContentScale.FillWidth
        )
        Spacer(modifier = Modifier.height(250.dp))
        Image(
            painter = painterResource(R.drawable.mask_group_6),
            contentDescription = "",
            modifier = Modifier.fillMaxWidth(),
            contentScale = ContentScale.FillWidth
        )
    }
}

@Preview
@Composable
private fun SplashScreenPrev() {
    SplashScreen()
}