package com.example.digitalbusinesscard.ui.screens
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen(name: String) {
    Column (
        modifier = Modifier
            .padding(20.dp)
    ) {
        Card (
            modifier = Modifier
                .fillMaxWidth(),
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.surface,
            ),
            border = BorderStroke(1.dp, Color.Black),
        ) {
            Column (
                modifier = Modifier
                    .padding(15.dp)
            ) {
                Text(
                    text = "Muhammad Amin Akhtar",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Monospace,
                    modifier = Modifier
                        .padding(bottom = 5.dp)
                )

                Text(
                    text = "Senior Software Engineer",
                    fontFamily = FontFamily.Monospace,
                    modifier = Modifier
                        .padding(bottom = 5.dp)
                )

                Text(
                    text = "Dastgyr",
                    fontFamily = FontFamily.Monospace,
                    modifier = Modifier
                        .padding(bottom = 10.dp)
                )

                Row {
                    Icon(
                        imageVector = Icons.Filled.Phone,
                        contentDescription = "Email Icon",
                        modifier = Modifier
                            .size(18.dp)
                    )

                    Text(
                        text = "+923001234567",
                        fontFamily = FontFamily.Monospace,
                        modifier = Modifier
                            .padding(start = 10.dp, bottom = 10.dp)
                    )
                }

                Row {
                    Icon(
                        imageVector = Icons.Filled.Email,
                        contentDescription = "Email Icon",
                        modifier = Modifier
                            .size(18.dp)
                    )

                    Text(
                        text = "dummy@gmail.com",
                        fontFamily = FontFamily.Monospace,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                }
            }
        }
        Spacer(
            modifier = Modifier
                .height(10.dp)
        )
        Row (
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(
                onClick = {},

                ) {
                Text(text = "Create Card")
            }

            Button(onClick = {  },
            ) {
                Text(text = "Share Card")
            }
        }
    }
}