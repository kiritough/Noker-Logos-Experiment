package com.noker.logos.experiment.ui

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults

@Composable
fun dash() {
    var peText by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF1E1E1E))
    ) {
        Row(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .background(Color.LightGray)
        ) {
            Box(
                modifier = Modifier
                    .weight(0.20f)
                    .fillMaxSize()
                    .background(Color.DarkGray)
            ) {
                Text(
                    text = "Проекты",
                    color = Color.White,
                    modifier = Modifier.padding(16.dp)
                )
            }
            Box(
                modifier = Modifier
                    .weight(0.85f)
                    .fillMaxSize()
                    .background(Color.LightGray)
            ) { Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Cyan)
            )
                Text(
                    text = "Вывод",
                    color = Color.White,
                    modifier = Modifier.padding(16.dp)
                )
            }
        }
        Box(
            modifier = Modifier
                .height(80.dp)
                .fillMaxWidth()
                .background(Color.Black)
                .padding(8.dp)
        ) {
            TextField(
                value = peText,
                onValueChange = { peText = it },
                placeholder = { Text("Тут вы пишите....", color = Color.LightGray) },
                modifier = Modifier.fillMaxWidth(),
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = Color.LightGray,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                )
                )
        }
    }
}