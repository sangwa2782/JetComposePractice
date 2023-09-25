package com.ajayam.jetcomposepractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            CircleImage()

            NotificationCounter(count.value) { count.value++ }
        }
    }
}


//@OptIn(ExperimentalMaterial3Api::class)

//@Preview( showBackground = true )
//@Composable
//fun CircleImage() {
//    Image(
//        painter = painterResource(id = R.drawable.a),
//        contentScale = ContentScale.Crop,
//        modifier = Modifier
//            .size(80.dp)
//            .clip(CircleShape)
//            .border(2.dp, Color.LightGray, CircleShape)
//            .shadow(2.dp),
//        contentDescription = "b-image",
//
//
//        )
//}





//@Preview()
//@Composable
//private fun PreviewFunction() {
//    // Column View --------------
////    Column(
////        verticalArrangement = Arrangement.SpaceEvenly,
////        horizontalAlignment = Alignment.CenterHorizontally
////    )
//    //Row View ------------------
////    Row(
////        horizontalArrangement = Arrangement.SpaceEvenly,
////        verticalAlignment = Alignment.CenterVertically
////    )
//    // View Part ----------------
////    {
////        Text(text = "Ajay", fontSize = 26.sp)
////        Text(text = "Birju", fontSize = 24.sp)
////    }
//    // Row & column End --------------
//
//
//    // for Image ===================
////    Box(
////        contentAlignment = Alignment.Center
////    ) {
////        Image(painter = painterResource(id = R.drawable.a), contentDescription = "a-pic")
////        Image(painter = painterResource(id = R.drawable.b), contentDescription = "b-pic")
////    }
//    // end for Image =================
//
//
//
//    // List view with image ---------------------
////    listViewItem(R.drawable.person,"John Doe", "Software Develper")
//
////    Column() {
////        listViewItem(R.drawable.person,"John Doe", "Software Develper")
////        listViewItem(R.drawable.person,"John Doe", "Software Develper")
////        listViewItem(R.drawable.person,"John Doe", "Software Develper")
////        listViewItem(R.drawable.person,"John Doe", "Software Develper")
////    }
//    // End of List view with image -------------------------
//
////    Text(
////        text = "Hello",
////        color = Color.White,
////        modifier = Modifier
////            .background(Color.Blue)
////            .size(200.dp)
////            .padding(16.dp, 10.dp,)
////            .border(4.dp, Color.Red)
////            .clip(CircleShape)
////            .background(Color.Yellow)
////            .clickable { }
////    )
//
//
//}





//@Composable
//fun listViewItem(imgId: Int, name:String, occupation: String, modifier: Modifier) {
//    Row(
//        modifier.padding(10.dp)
//    ) {
//        Image(
//            painter = painterResource(id = imgId),
//            contentDescription = "a-pic",
//            Modifier.size(35.dp)
//        )
//
//
//        Column( Modifier.padding(horizontal = 8.dp) ) {
//            Text(
//                text = name,
//                fontWeight = FontWeight.Bold
//            )
//            Text(
//                text = occupation,
//                fontWeight = FontWeight.Thin,
//                fontSize = 12.sp
//            )
//        }
//    }
//}



