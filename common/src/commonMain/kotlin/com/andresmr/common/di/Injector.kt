package com.andresmr.common.di

import com.andresmr.common.data.CommonUserRepository
import com.andresmr.common.ui.LoginViewModel

object Injector {
    fun provideLoginViewModel() = LoginViewModel(provideUserRepository())

    fun provideUserRepository() = CommonUserRepository()
}