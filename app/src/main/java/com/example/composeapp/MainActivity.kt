package com.example.composeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.composeapp.ui.theme.ComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ComposeAppTheme {
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text("Hello $name")
}

@Preview(showBackground = true, name = "Text preview")
@Composable
fun DefaultPreview() {
    ComposeAppTheme {
        Greeting(name = "Android")
    }
}


/*
    Code from Jetpack Intro Article
 */

//@Composable
//fun NewsStory() {
//    MaterialTheme {
//        val typography = MaterialTheme.typography
//        Column(
//            modifier = Modifier.padding(16.dp)
//        ) {
//            Image(
//                painter = painterResource(id = R.drawable.header),
//                contentDescription = null,
//                modifier = Modifier
//                    .height(180.dp)
//                    .fillMaxWidth()
//                    .clip(shape = RoundedCornerShape(4.dp)),
//                contentScale = ContentScale.Crop
//            )
//
//            Spacer(Modifier.height(16.dp))
//
//            Text(
//                "A quick brown fox jumps over the lazy dog.A quick brown fox jumps over the lazy dog.A quick brown fox jumps over the lazy dog.",
//                style = typography.h6,
//                maxLines = 2,
//                overflow = TextOverflow.Ellipsis
//            )
//            Text(
//                "Davenport",
//                style = typography.body2
//            )
//            Text(
//                "December 2018",
//                style = typography.body2
//            )
//        }
//    }
//}
//
//@Preview
//@Composable
//fun DefaultPreview(){
//    NewsStory()
//}