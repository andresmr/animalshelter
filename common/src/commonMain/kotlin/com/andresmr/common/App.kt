package com.andresmr.common

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import com.andresmr.common.di.Injector
import com.andresmr.common.ui.LoginScreen

@Composable
fun App() {
    val viewModel = Injector.provideLoginViewModel()
    val uiState by viewModel.uiState.collectAsState()
    MaterialTheme {
        LoginScreen(uiState) { username, password ->  viewModel. onLogIn(username, password)}
    }
}
