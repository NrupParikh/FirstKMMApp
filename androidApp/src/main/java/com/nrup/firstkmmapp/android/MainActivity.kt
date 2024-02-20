package com.nrup.firstkmmapp.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.nrup.firstkmmapp.DateTimeApi
import com.nrup.firstkmmapp.Greeting

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                val greeting = remember { Greeting().greet() }
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    GreetingView(Greeting().greet())

                    Column(
                        modifier = Modifier.padding(all = 20.dp),
                        verticalArrangement = Arrangement.spacedBy(8.dp),
                    ) {
                        Column(
                            modifier = Modifier.padding(all = 20.dp),
                            verticalArrangement = Arrangement.spacedBy(8.dp),
                        ) {
                            Text(text = "Current Date")
                            Text(
                                text = DateTimeApi().getCurrentDateTime()
                            )
                        }

                        MyList(greeting)
                    }

                }
            }
        }
    }


}

@Composable
fun GreetingView(text: String) {
    Text(text = text)
}

@Preview
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        GreetingView("Hello, Android!")
    }
}

@Composable
private fun MyList(greeting: List<String>) {
    Column(
        modifier = Modifier.padding(all = 20.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        greeting.forEach { greeting ->
            Text(text = greeting)
            Divider()
        }
    }
}

@Preview
@Composable
fun MyListPreview() {
    MyApplicationTheme {
        val greeting = remember { Greeting().greet() }
        MyList(greeting)
    }
}