package com.ajayam.jetcomposepractice

import android.annotation.SuppressLint
import android.icu.text.AlphabeticIndex.Bucket.LabelType
import android.os.Bundle
import android.print.PrintAttributes.Margins
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import androidx.compose.ui.Alignment
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

        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true, widthDp = 300, heightDp = 500)
@Composable
private fun PreviewFunction() {
    // Column View --------------
//    Column(
//        verticalArrangement = Arrangement.SpaceEvenly,
//        horizontalAlignment = Alignment.CenterHorizontally
//    )
    //Row View ------------------
//    Row(
//        horizontalArrangement = Arrangement.SpaceEvenly,
//        verticalAlignment = Alignment.CenterVertically
//    )
    // View Part ----------------
//    {
//        Text(text = "Ajay", fontSize = 26.sp)
//        Text(text = "Birju", fontSize = 24.sp)
//    }
    // Row & column End --------------


    // for Image ===================
//    Box(
//        contentAlignment = Alignment.Center
//    ) {
//        Image(painter = painterResource(id = R.drawable.a), contentDescription = "a-pic")
//        Image(painter = painterResource(id = R.drawable.b), contentDescription = "b-pic")
//    }
    // end for Image =================

    listViewItem(R.drawable.person,"John Doe", "Software Develper")

    Column() {
        listViewItem(R.drawable.person,"John Doe", "Software Develper")
        listViewItem(R.drawable.person,"John Doe", "Software Develper")
        listViewItem(R.drawable.person,"John Doe", "Software Develper")
        listViewItem(R.drawable.person,"John Doe", "Software Develper")
    }


}

@Composable
fun listViewItem(imgId: Int, name:String, occupation: String) {
    Row(
        Modifier.padding(10.dp)
    ) {
        Image(
            painter = painterResource(id = imgId),
            contentDescription = "a-pic",
            Modifier.size(35.dp)
        )


        Column( Modifier.padding(horizontal = 8.dp) ) {
            Text(
                text = name,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = occupation,
                fontWeight = FontWeight.Thin,
                fontSize = 12.sp
            )
        }
    }
}

