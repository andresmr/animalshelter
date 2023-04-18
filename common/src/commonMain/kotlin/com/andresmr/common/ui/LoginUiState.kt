package com.andresmr.common.ui

class LoginUiState(
    val status: UiStatus = UiStatus.NOT_LOGGED,
    val welcomeMessage: String = "Animal Shelter"
)

enum class UiStatus {
    NOT_LOGGED,
    LOGIN_IN,
    LOGGED_ID
}