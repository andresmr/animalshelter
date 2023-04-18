package com.andresmr.common

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import com.andresmr.common.ui.LoginScreen

@Composable
fun App() {
    MaterialTheme {
        LoginScreen { email, password ->  }
    }
}
