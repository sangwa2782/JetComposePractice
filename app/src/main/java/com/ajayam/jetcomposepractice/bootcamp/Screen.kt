//package com.ajayam.jetcomposepractice.bootcamp
//
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.layout.size
//import androidx.compose.material3.Card
//import androidx.compose.material3.CardElevation
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import com.ajayam.jetcomposepractice.R
//
//@Preview()
//@Composable
//fun BlogCategory() {
//    Card( modifier = Modifier.padding(8.dp), ) {
//        Row(
//            verticalAlignment = Alignment.CenterVertically,
//            modifier = Modifier.padding(8.dp)
//        ) {
//
//            Image(
//                painter = painterResource(id = R.drawable.person),
//                contentDescription = "a-image",
//                modifier = Modifier
//                    .size(48.dp)
//                    .padding(8.dp)
//
//                )
//
//            Column() {
//                Text(
//                    text = "Programming",
//                    fontWeight = MaterialTheme.typography.h6
//                )
//                Text(
//                    text = "Learn Different Language",
//                    fontWeight = FontWeight.Thin,
//                    fontSize = 12.sp
//                )
//            }
//
//
//        }
//    }
//}