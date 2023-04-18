package com.andresmr.common.data

import com.andresmr.common.model.User

class CommonUserRepository : UserRepository {
    override fun onLogin(username: String, password: String) = User("Hardcoded user")
}