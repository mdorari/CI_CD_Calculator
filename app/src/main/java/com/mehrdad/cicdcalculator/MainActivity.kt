package com.mehrdad.cicdcalculator

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.mehrdad.cicdcalculator.domain.ExpressionPart
import com.mehrdad.cicdcalculator.domain.Operation
import com.mehrdad.cicdcalculator.ui.theme.CICDCalculatorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CICDCalculatorTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
    val expected = listOf(
        ExpressionPart.Number(3.0),
        ExpressionPart.Op(Operation.ADD),
        ExpressionPart.Number(5.0),
        ExpressionPart.Op(Operation.SUBTRACT),
        ExpressionPart.Number(3.0),
        ExpressionPart.Op(Operation.MULTIPLY),
        ExpressionPart.Number(4.0),
        ExpressionPart.Op(Operation.DIVIDE),
        ExpressionPart.Number(3.0),
    )
    Log.d("Mehrdad main", "Greeting: $expected")
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CICDCalculatorTheme {
        Greeting("Android")
    }
}