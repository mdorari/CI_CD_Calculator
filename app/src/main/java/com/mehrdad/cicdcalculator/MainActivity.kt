package com.mehrdad.cicdcalculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.mehrdad.cicdcalculator.presentation.CalculatorScreen
import com.mehrdad.cicdcalculator.ui.theme.CICDCalculatorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CICDCalculatorTheme {
                // A surface container using the 'background' color from the theme
                CalculatorScreen()
            }
        }
    }
}