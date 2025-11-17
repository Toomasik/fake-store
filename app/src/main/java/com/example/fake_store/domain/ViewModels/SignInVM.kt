package com.example.fake_store.domain.ViewModels


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.fake_store.domain.api.RetrofitClient.usersService
import com.example.fake_store.domain.postBodies.authLogin
import com.example.fake_store.domain.postBodies.usersCreate
import com.example.fake_store.domain.resopnses.usersCreateResponce
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch


class SignInVM : ViewModel() {

    private var _aToken = MutableStateFlow("")
    var aToken = _aToken
    private var _rToken = MutableStateFlow("")
    var rToken = _rToken

    fun login(authLogin: authLogin) {
        viewModelScope.launch {
            val result = usersService.login(authLogin)
            _aToken.value = result.access_token
            _rToken.value = result.refresh_token
        }
    }
    fun createUser(usersCreate: usersCreate) {
        viewModelScope.launch {
            try {
                println("Start")
                val result = usersService.createUser(usersCreate)
                login(
                    authLogin(result.email, result.password)
                )
            }catch (e: Exception){
                println(e.message)
            }

        }
    }
}