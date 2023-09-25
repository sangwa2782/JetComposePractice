package com.ajayam.jetcomposepractice.bootcamp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ajayam.jetcomposepractice.R


@Preview(heightDp = 500)
@Composable
fun PreviewItem() {
    //(vertical Scroll) this render all the UI list at once
    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
        getCategoryList().map { item ->
            BlogCategory(img = item.img, title = item.title, subtitle =item.subtitle )
        }
    }

    //(Lazy Scroll) -> this render only that list which are visible in screen instead of all, as like recyclerView

//    LazyColumn(content = {
//        items(getCategoryList()) {item ->
//            BlogCategory(img = , title = , subtitle = )
//        }
//    })


}


@Composable
fun BlogCategory(img: Int, title:String, subtitle:String) {
    Card( modifier = Modifier.padding(8.dp), ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(8.dp)
        ) {

            Image(
                painter = painterResource(id = img),
                contentDescription = "a-image",
                modifier = Modifier
                    .size(60.dp)
                    .padding(8.dp)
                    .weight(.2f)

            )

            ItemDescription(title, subtitle, Modifier.weight(0.8f))


        }
    }
}


@Composable
private fun ItemDescription(title: String, subtitle: String, modifier: Modifier) {
    Column(
        modifier = modifier
    ) {
        Text(
            text = title,
            style = MaterialTheme.typography.bodyLarge,
            fontWeight = FontWeight.Bold

        )
        Text(
            text = subtitle,
            fontWeight = FontWeight.Thin,
//                    style = MaterialTheme.typography.subtitle,
            fontSize = 12.sp
        )
    }
}

data class Category(val img:Int, val title:String, val subtitle:String)

fun getCategoryList(): MutableList<Category> {
    val list = mutableListOf<Category>()
    list.add(Category(R.drawable.c, "Programming", "Learn Different Language"))
    list.add(Category(R.drawable.d, "Technology", "News about New Tech"))
    list.add(Category(R.drawable.e, "Full Stack Development", "From Backend to Frontend"))
    list.add(Category(R.drawable.f, "DevOps", "Deployment, CI, CD etc,"))
    list.add(Category(R.drawable.g, "AI & ML", "Basic Artificial intelligence"))
    list.add(Category(R.drawable.c, "Programming", "Learn Different Language"))
    list.add(Category(R.drawable.d, "Technology", "News about New Tech"))
    list.add(Category(R.drawable.e, "Full Stack Development", "From Backend to Frontend"))
    list.add(Category(R.drawable.f, "DevOps", "Deployment, CI, CD etc,"))
    list.add(Category(R.drawable.g, "AI & ML", "Basic Artificial intelligence"))

    return list
}