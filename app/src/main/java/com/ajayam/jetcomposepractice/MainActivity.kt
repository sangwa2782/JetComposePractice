package com.ajayam.jetcomposepractice

import android.annotation.SuppressLint
import android.icu.text.AlphabeticIndex.Bucket.LabelType
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ajayam.jetcomposepractice.ui.theme.JetComposePracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            Text(text = "Hello! Ajayam")
            TextInput()
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true, widthDp = 300, heightDp = 500)
@Composable
private fun PreviewFunction() {
    //-------------- Image -------------

//    Image(
//        painter = painterResource(id = R.drawable.a),
//        contentDescription = "Dummy Image",
//        contentScale = ContentScale.Crop
//    )


    //---------------- Button ----------

//    Button(
//        onClick = {  }, colors = ButtonDefaults.buttonColors(
//            contentColor = Color.White,
//            containerColor = Color.Black,
//
//        ),
//        enabled = false,
//
//        )
//
//        {
//        Text(text = "Hello")
//        Image(
//            painter = painterResource(id = R.drawable.b),
//            contentDescription = "Dummy"
//        )
//    }
    //-------------------- Text Feild -----------------

    TextField(
        value = "Hello Ajayam",
        onValueChange = {},
        label = { Text(text = "Enter Message")},
        placeholder = {}
    )
}

@SuppressLint("UnrememberedMutableState")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextInput() {
    val state = remember {mutableStateOf("")} // Hello Ajayam
   TextField(
       value = state.value,
       onValueChange = {
           state.value = it
       },
       label = { Text(text = "Enter Message")},
       placeholder = {}
   )
}

