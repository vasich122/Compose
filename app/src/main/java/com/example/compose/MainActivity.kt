package com.example.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.materialIcon
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                Surface {
                    newtext()
                    kittensImages()

                }
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun newtext(){
        Row(modifier = Modifier.fillMaxSize(), horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.CenterVertically) {
            Text("ИКБО-06", modifier = Modifier)
            Text("-22")
        }
        Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Bottom) {
            Text("Соваренко", style = MaterialTheme.typography.displayMedium)
            Text("Василий", style = MaterialTheme.typography.bodyLarge)
            Text("Васильевич", style = MaterialTheme.typography.titleSmall)
        }
        Button(onClick = {},  ) {
            Text("new button")
        }


    }
    @Preview(showBackground = true)
    @Composable
    fun kittensImages(){
        Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(R.drawable.cat1),
                contentDescription = "кот1"

            )
            Image(
                painter = painterResource(R.drawable.cat2),
                contentDescription = "кот1"
            )
        }

    }
}
