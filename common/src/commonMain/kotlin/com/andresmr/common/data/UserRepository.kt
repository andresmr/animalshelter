package com.andresmr.common.data

import com.andresmr.common.model.User

interface UserRepository {
    fun onLogin(username: String, password: String ) : User
}