package com.ajayam.jetcomposepractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

class RowsAndColumn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rows_and_column)
    }
}


@Preview
@Composable
fun BootcampThree() {
    RowLayout()
}


@Preview
@Composable
fun RowLayout() {

    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.run {
            background(Color.Red)
        }
    ) {
        Text(text = "One Text")
        Text(text = "Two Text")
        Text(text = "Three Text")
    }

}
