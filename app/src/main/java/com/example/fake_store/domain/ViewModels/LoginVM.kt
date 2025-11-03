package com.example.fake_store.domain.ViewModels

import androidx.compose.runtime.collectAsState
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.fake_store.domain.api.RetrofitClient.usersService
import com.example.fake_store.domain.resopnses.UserResponce
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

class LoginVM : ViewModel() {
    private var _users = MutableStateFlow(emptyList<UserResponce>())
    var users = _users
    fun GetAllUsers() {
        viewModelScope.launch {
            _users.value = usersService.get_users()
        }
    }
}