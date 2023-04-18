package com.andresmr.common.ui

import com.andresmr.common.data.UserRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class LoginViewModel(
    private val userRepository: UserRepository
) {

    private val _uiState = MutableStateFlow(LoginUiState())
    val uiState : StateFlow<LoginUiState> = _uiState

    fun onLogIn(username: String, password: String) {
        val user = userRepository.onLogin(username, password)
        _uiState.value = LoginUiState(UiStatus.LOGGED_ID, "Hello ${user.username}")
    }
}